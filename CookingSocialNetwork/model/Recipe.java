package KataRubenToni.CookingSocialNetwork.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Recipe implements Likeable{
    private int id;
    private String name;
    private User user;
    private ArrayList<Picture> pictures;
    private ArrayList<Ingredient> ingredients;
    private Date time;
    private String description;
    private ArrayList<Comment> comments;
    private ArrayList<Like> likes;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public ArrayList<Picture> getPictures() { return pictures;}
    public void setPictures(ArrayList<Picture> pictures) { this.pictures = pictures; }

    public ArrayList<Ingredient> getIngredients() { return ingredients; }
    public void setIngredients(ArrayList<Ingredient> ingredients) { this.ingredients = ingredients; }

    public Date getTime() { return time; }
    public void setTime(Date time) { this.time = time; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<Comment> getComments() { return comments; }
    public void setComments(ArrayList<Comment> comments) { this.comments = comments; }

    public ArrayList<Like> getLikes() { return likes; }
    public void setLikes(ArrayList<Like> likes) { this.likes = likes; }


    public void like(User u){
        this.likes.add(new Like(u, this));
    }
    public void unlike(User u){
        this.likes.remove(new Like(u,this));
    }

    public boolean equals(Object o) {
        if (o instanceof Recipe) {
            Recipe other = (Recipe) o;
            return this.id == other.id;
        } else return false;
    }
}
