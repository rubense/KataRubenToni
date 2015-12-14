package KataRubenToni.CookingSocialNetwork.dao;

import KataRubenToni.CookingSocialNetwork.model.Recipe;

/**
 * Created by toni on 14/12/15.
 */
public interface RecipeDAO extends DataAccessObject<Recipe> {
    //CRUD methods
    //Additional methods
    int getLikeCount(Recipe recipe);

}
