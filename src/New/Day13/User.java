package New.Day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
     }

     public boolean isSubscribed(User user){
        for (User user1 : subscriptions){
            if (user1.getUserName().equals(user.getUserName())) return true;
        }
        return false;
     }

     public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
     }
     public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
     }

    @Override
    public String toString() {
        return userName;
    }
}
