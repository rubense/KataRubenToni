package KataRubenToni.CookingSocialNetwork.controller.imp;

import KataRubenToni.CookingSocialNetwork.model.Recipe;
import KataRubenToni.CookingSocialNetwork.controller.RecipeController;
import KataRubenToni.CookingSocialNetwork.dao.RecipeDAO;

import java.util.List;

/**
 * Created by toni on 14/12/15.
 */
public class RecipeControllerImp implements RecipeController{

    private RecipeDAO recipeDAO;

    @Override
    public List<Recipe> getRecipes() throws Exception {
        return recipeDAO.getList();
    }

    @Override
    public Recipe getRecipeById(Recipe recipe) throws Exception {
        return recipeDAO.readById(recipe);
    }
}
