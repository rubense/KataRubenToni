package KataRubenToni.CookingSocialNetwork.model;

import java.util.ArrayList;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Comment implements Likeable{
    private User user;
    private String comment;
    private ArrayList<Comment> comments;
    private ArrayList<Like> likes;

    public void like(User u){
        likes.add(new Like(u, this));
    }

    public void unlike(User u){
        likes.remove(new Like(u, this));
    }
}
