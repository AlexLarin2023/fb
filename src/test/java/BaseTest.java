import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;

    protected LoginPage loginPage;
    protected MainPage mainPage;

    protected Stories stories;

//    protected FriendsProfile friendsProfile;
//    protected MyProfilePage myProfilePage;

////////////////////////////////////////////////////////////////////////////////////////////

    //for work computer

//    @BeforeSuite
//    public void beforeSuite() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/alexander.anderson/IdeaProjects/InstaProject/chromedriver.exe");
//    }

    // for home computer

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "/Users/oleksii_kolesnik/IdeaProjects/InstaProject/chromedriver");
    }

//////////////////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    public void startUp() {

/////////////////////////////////////////////////////////////////////////////////////////

                                             //SafariDriver
        // Initialize SafariDriver
        driver = new SafariDriver();

//////////////////////////////////////////////////////////////////////////////////////////

//        // Set Chrome options to disable notifications
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");

///////////////////////////////////////////////////////////////////////////////////////////

//                                             //// ChromeDriver
//
//        // Pass the options when initializing ChromeDriver
//        driver = new ChromeDriver(options);

///////////////////////////////////////////////////////////////////////////////////////////

        // Maximize screen
        driver.manage().window().maximize();

///////////////////////////////////////////////////////////////////////////////////////////




        // Initialize the login page and navigate to it
        loginPage = new LoginPage(driver);
        loginPage.open();

        // I keep this data for later
        username = "infokolesnik@gmail.com";
        password = "Eyecontact2021!";

        // Perform login and get to the main page
        mainPage = loginPage.loginToApp(username, password);


//        myProfilePage = new MyProfilePage(driver);
//
//        friendsProfile = new FriendsProfile(driver);

        // Initialize the Stories page (only once)

        stories = new Stories(driver);


    }
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }
}