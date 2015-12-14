package KataRubenToni.CookingSocialNetwork;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Recipe implements Likeable{
    private String name;
    private User user;
    private ArrayList<Picture> pictures;
    private ArrayList<Ingredient> ingredients;
    private Date time;
    private String description;
    private ArrayList<Comment> comments;
    private ArrayList<Like> likes;


}
