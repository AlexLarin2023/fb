import org.testng.annotations.Test;

public class FaceProject extends BaseTest {

    @Test
    public void likePosts() {

        // scrolling and liking posts
        mainPage.scrollAndLikePosts();
    }
}
