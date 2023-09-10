import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stories extends BasePage {
    public Stories(WebDriver driver) {
        super(driver);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    // Get the right arrow element
//    private WebElement getRightArrow() {
//        By rightArrowBy = By.xpath("//div[@class=' _9zm2']");
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(rightArrowBy));
//    }
//
//    // Click the right arrow a specified number of times
//    public void clickRightArrow(int timesToClick) {
//        for (int i = 0; i < timesToClick; i++) {
//            getRightArrow().click();
//        }
//    }
//
//    // Perform the scenario of clicking right arrow 5 times and then clicking like story button once
//    public void swipeFiveTimesAndLikeOneTime(int repeatCount) {
//        for (int i = 0; i < repeatCount; i++) {
//            clickRightArrow(5); // Click right arrow 5 times
//            HoverAndLike(); // Click like story button 1 time
//        }
//    }

}
