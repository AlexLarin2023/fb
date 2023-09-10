import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
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
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Like']")));

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
}
