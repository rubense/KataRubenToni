package KataRubenToni.CookingSocialNetwork.dao.imp;

import KataRubenToni.CookingSocialNetwork.dao.RecipeDAO;
import KataRubenToni.CookingSocialNetwork.model.Recipe;

import java.io.FileWriter;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by toni on 14/12/15.
 */
public class RecipeDAOImp implements RecipeDAO {

    //I need the DataBase link
    private List<Recipe> recipeDB;

    public RecipeDAOImp() {
        this.recipeDB = new ArrayList<Recipe>();
    }

    @Override
    public int getLikeCount(Recipe recipe) {
        return 0;
    }

    @Override
    public List<Recipe> getList() throws Exception {
        return null;
    }

    @Override
    public Recipe create(Recipe entity) throws Exception {
        recipeDB.add(entity);
        return entity;
    }

    @Override
    public void update(Recipe entity) throws Exception {
        //
    }

    @Override
    public void delete(Recipe entity) throws Exception {
        recipeDB.remove(entity);
    }

    @Override
    public Recipe readById(Recipe entity) throws Exception {
        return null;
    }
}
