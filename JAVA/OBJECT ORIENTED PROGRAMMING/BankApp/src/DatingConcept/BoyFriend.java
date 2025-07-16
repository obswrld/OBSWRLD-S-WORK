package DatingConcept;

public class BoyFriend {
    private GirlFriend girlFriend;

    public BoyFriend(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }

    public void cook(){
        girlFriend.cook();
    }

    public void setGirlFriend(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }
}
