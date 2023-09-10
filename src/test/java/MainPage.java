import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Get the second story element
    private WebElement getSecondStory() {
        By secondStoryBy = By.xpath("(//div[@class='x1g0ag68 xx6bhzk x11xpdln xcj1dhv x1ey2m1c x9f619 xds687c x10l6tqk x17qophe x13vifvy'])[1]");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(secondStoryBy));
    }

    // Click the second story
    public void clickSecondStory() {
        WebElement secondStory = getSecondStory();
        if (secondStory.isDisplayed()) {
            secondStory.click();
            // You can add waits here if necessary
        } else {
            System.out.println("Second story button not found.");
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private List<WebElement> getLikeMainPageButtons() {
        return driver.findElements(By.xpath("//span[text()='Like']"));
    }

    public void scrollAndLikePosts() {
        int initialLikeCount = 0;
        int maxScrolls = 30; // Set the maximum number of scrolls
        int maxLikes = 30;   // Set the maximum number of likes

        while (maxScrolls > 0 && maxLikes > 0) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x193iq5w xeuugli x1r8uery x1iyjqo2 xs83m0k'])[6]")));

            List<WebElement> likeButtons = getLikeMainPageButtons();
            int currentLikeCount = likeButtons.size();

            // Scroll down the page if new like buttons are not visible
            if (currentLikeCount == initialLikeCount) {
                Actions actions = new Actions(driver);
                actions.moveToElement(likeButtons.get(likeButtons.size() - 1)).perform();

                maxScrolls--;
                continue;
            }

            // Like the new posts
            for (int i = initialLikeCount; i < currentLikeCount && maxLikes > 0; i++) {
                likeButtons.get(i).click();

                maxLikes--;
            }

            initialLikeCount = currentLikeCount;

            // Scroll down further and repeat the process
            Actions actions = new Actions(driver);
            actions.moveToElement(likeButtons.get(likeButtons.size() - 1)).perform();

            // Wait for some time to allow new content to load
            try {
                Thread.sleep(3000); // Adjust sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            maxScrolls--;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////

    private WebElement getNotificationButton() {
        String notificationButtonXPath = "//button[@class='_a9-- _a9_1']";
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(notificationButtonXPath)));
    }

    // Click the "Notification" button
    public void clickNotificationButton() {
        getNotificationButton().click();
    }

//////////////////////////////////////////////////////////////////////////////////////


    private WebElement getMyProfileButton() {
        String myProfileButtonXPath = "//img[@class='xpdipgo x6umtig x1b1mbwd xaqea5y xav7gou xk390pu x5yr21d xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x11njtxf xh8yej3']";
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myProfileButtonXPath)));
    }

    // Click the "MyProfileButton" button
    public void clickMyProfileButton() {
        getMyProfileButton().click();
    }


}
