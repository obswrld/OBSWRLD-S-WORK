import DatingConcept.BoyFriend;
import DatingConcept.MushinBabe;
import DatingConcept.SemicolonBabe;
import org.junit.jupiter.api.Test;

public class BoyFriendTest {

    @Test
    public void test(){
        BoyFriend boyFriend = new BoyFriend(new MushinBabe());
        boyFriend.cook();
        boyFriend.setGirlFriend(new SemicolonBabe());
        boyFriend.cook();
    }
}
