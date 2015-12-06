package KataRubenToni.CookingSocialNetwork;

import java.util.ArrayList;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Like {
    private ArrayList<User> users;

    public void like(User u){
        users.add(u);
    }

    public void unlike(User u){
        users.remove(u);
    }
}
