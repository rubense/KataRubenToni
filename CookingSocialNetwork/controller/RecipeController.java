package KataRubenToni.CookingSocialNetwork.controller;

import KataRubenToni.CookingSocialNetwork.Recipe;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_EXCLUSIONPeer;

import java.util.List;

/**
 * Created by toni on 14/12/15.
 */
public interface RecipeController {
    List<Recipe> getRecipes() throws Exception;
    Recipe getRecipeById(Recipe recipe) throws Exception;
}
