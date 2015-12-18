package KataRubenToni.CookingSocialNetwork.controller;

import KataRubenToni.CookingSocialNetwork.model.User;

/**
 * Created by Ruben on 17/12/2015.
 */
public interface UserController {
    User register(User user);
    User getUser(User user);
    void modify(User user);
}
