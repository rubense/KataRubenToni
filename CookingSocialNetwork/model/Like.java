package KataRubenToni.CookingSocialNetwork.model;

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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Likeable getLiked() {
        return liked;
    }
    public void setLiked(Likeable liked) {
        this.liked = liked;
    }

    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
}
