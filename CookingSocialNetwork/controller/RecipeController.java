package KataRubenToni.CookingSocialNetwork.controller;

import KataRubenToni.CookingSocialNetwork.model.Recipe;

import java.util.List;

/**
 * Created by toni on 14/12/15.
 */
public interface RecipeController {
    List<Recipe> getRecipes() throws Exception;
    Recipe getRecipeById(Recipe recipe) throws Exception;
}
