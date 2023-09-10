import org.testng.annotations.Test;

public class FaceProject extends BaseTest {

    @Test
    public void likePosts() {


        // Call the scrollAndLikePosts method to start scrolling and liking posts
        mainPage.scrollAndLikePosts();
    }

    @Test
    public void likeStoriesSwipe() {

        // Click the Second story on the Stories page
        mainPage.clickSecondStory();

//        // Like the current story
//        stories.();
//
//        // Swipe
//        stories.swipeFiveTimesAndLikeOneTime(10);
    }

//    @Test
//    public void likeFriendsPhotos(){
//
//        mainPage.clickMyProfileButton();
//        myProfilePage.clickFollowingButton();
//        myProfilePage.clickFriendButton();
//        friendsProfile.clickFriendsPicture();
//
//
//    }

}
