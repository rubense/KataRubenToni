package KataRubenToni.CookingSocialNetwork.dao;

import KataRubenToni.CookingSocialNetwork.Recipe;
import KataRubenToni.CookingSocialNetwork.User;

import java.util.List;

/**
 * Created by toni on 14/12/15.
 */
public interface RecipeDAO extends DataAccessObject<Recipe> {
    //Additional methods
    int getLikeCount(Recipe recipe);

}
