package KataRubenToni.CookingSocialNetwork;

import java.util.ArrayList;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Comment implements Likeable{
    private User user;
    private ArrayList<String> comment;
    private ArrayList<Like> likes;

    public void like(User u){
        likes.add(new Like(User u));
    }
}
