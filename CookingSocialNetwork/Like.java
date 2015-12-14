package KataRubenToni.CookingSocialNetwork;

import java.util.Date;

/**
 * Created by Ruben on 06/12/2015.
 */
public class Like {
    private User user;
    private Likeable liked;
    private Date time;

    public Like(User user, Likeable liked){
        this.user = user;
        this.liked = liked;
        this.time = new Date();
    }
}
