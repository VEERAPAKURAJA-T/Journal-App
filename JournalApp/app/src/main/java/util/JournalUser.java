package util;

import android.app.Application;

public class JournalUser extends Application {
   private String UserName;
    private String UserId;
    private static  JournalUser instance;
    //Singleton design pattern
    /*
This will ensure that only one single user at runtime is found on the app, and this will prevent many
errors in Firebase, Firebase Authentication and other and other places.
So for that, I will create a string username and string you ID and also I.
Later on I can combine the journal user with the journal, with the username with the ID.
So if we get the ID we will get the username and vice versa is true.
So I will create an instance of this user journal user and following the singleton design pattern,
     */
    /*
    The Singleton's purpose is to control object creation, limiting the number to one but allowing the flexibility
    to create more objects if the situation changes. Since there is only one Singleton instance, any instance fields of a Singleton
    will occur only once per class, just like static fields.
     */
    public static JournalUser getInstance(){
        if(instance==null){
            instance=new JournalUser();
        }
        return  instance;
    }
  //empty constructor
    public JournalUser() {
    }

    public JournalUser(String userName, String userId) {
        UserName = userName;
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public static void setInstance(JournalUser instance) {
        JournalUser.instance = instance;
    }
}
