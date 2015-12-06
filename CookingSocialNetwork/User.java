package KataRubenToni.CookingSocialNetwork;

import java.util.ArrayList;

/**
 * Created by Ruben on 06/12/2015.
 */
public class User {
    private String name;
    private String userName;
    private String password;
    private Picture picture;
    private String description;
    private ArrayList<User> followed;
    private ArrayList<User> followers;
    private ArrayList<Recipe> recipes;

    public User(String name, String password, String userName) {
        this.name = name;
        this.userName = userName;
        this.password = password;

        this.followed = new ArrayList<User>();
        this.followers = new ArrayList<User>();
        this.recipes = new ArrayList<Recipe>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ArrayList<User> getFollowed() {
        return followed;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }


    public void addRecipe(Recipe r) {
        this.recipes.add(r);
    }

    public void removeRecipe(Recipe r) {
        this.recipes.remove(r);
    }

    public boolean equals(Object o) {
        if (o instanceof User) {
            User other = (User) o;
            return this.userName.equals(other.userName);
        } else return false;
    }
}
