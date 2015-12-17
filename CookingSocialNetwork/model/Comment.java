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

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public ArrayList<Comment> getComments() { return comments; }
    public void setComments(ArrayList<Comment> comments) { this.comments = comments; }

    public ArrayList<Like> getLikes() { return likes; }
    public void setLikes(ArrayList<Like> likes) {this.likes = likes;}

    public void like(User u){
        likes.add(new Like(u, this));
    }

    public void unlike(User u){
        likes.remove(new Like(u, this));
    }

}
