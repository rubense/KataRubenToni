package KataRubenToni.CookingSocialNetwork.dao.imp;

import KataRubenToni.CookingSocialNetwork.dao.UserDAO;
import KataRubenToni.CookingSocialNetwork.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruben on 17/12/2015.
 */
public class UserDAOImp implements UserDAO {

    private List<User> userDB;

    public UserDAOImp() { this.userDB = new ArrayList<User>(); }

    @Override
    public List<User> getList() throws Exception {
        return new ArrayList<User>(this.userDB);
    }

    @Override
    public User create(User entity) throws Exception {
        entity.setId(this.userDB.size()+1);
        userDB.add(entity);
        return entity;
    }

    @Override
    public void update(User entity) throws Exception {
        this.userDB.set(userDB.indexOf(entity), entity);
    }

    @Override
    public void delete(User entity) throws Exception {
        userDB.remove(entity);
    }

    @Override
    public User readById(User entity) throws Exception {
        return this.userDB.get(this.userDB.indexOf(entity));
    }
}
