//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class MyProfilePage extends BasePage {
//    public MyProfilePage(WebDriver driver) {
//        super(driver);
//    }
//
//    private WebElement getFollowingButton() {
//        String followingButtonXPath = "//li[contains(@class, 'xl565be')]/a[contains(text(), 'following')]";
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(followingButtonXPath)));
//    }
//
//    // Click the "Save Your Login Info" button
//    public void clickFollowingButton() {
//        getFollowingButton().click();
//    }
//
//
//    private WebElement getFriendButton() {
//        String friendButtonXPath = "(//img[@class='xpdipgo x6umtig x1b1mbwd xaqea5y xav7gou xk390pu x5yr21d xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x11njtxf xh8yej3'])[2]";
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(friendButtonXPath)));
//    }
//
//    // Click the "Save Your Login Info" button
//    public void clickFriendButton() {
//        getFriendButton().click();
//    }
//
//}