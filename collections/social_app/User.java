package collections.social_app;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Post> posts;
    private int maxPosts = 5;



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", posts=" + posts +
                ", maxPosts=" + maxPosts +
                '}';
    }
    public void setPosts(List<Post> posts) {this.posts = posts;}
    public int getMaxPosts() {return maxPosts;}
    public void setMaxPosts(int maxPosts) {this.maxPosts = maxPosts;}
    public User(int id, String name) {this.id = id;this.name = name;this.posts = new ArrayList<>();}
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Post> getPosts() { return posts; }


}
