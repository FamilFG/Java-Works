package collections.social_app;

import collections.social_app.exceptions.FullListOfUsers;
import collections.social_app.exceptions.FullPostQuantity;
import collections.social_app.exceptions.PostNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MainLogic {
    private final List<User> users = new ArrayList<>();
    private int userCounter;

    public void addUser(User u){
        if(userCounter<=10){
            users.add(u);
            userCounter++;
        }
        else{
            throw new FullListOfUsers("Full list of Users");
        }
    }


    public void addPost(User u, Post p){
        if((u.getPosts()).size() >= u.getMaxPosts()){
            throw new FullPostQuantity("Full posts quantity(5)");
        }else{
            u.getPosts().add(p);
        }
    }


    public void likePost(User u, int postId) {
        boolean isFound = false;
        for(Post post : u.getPosts()){
            if(postId == post.getId()){
                post.setLikeCount(post.getLikeCount()+1);
                isFound = true;

            }
            if(!isFound){
                throw new PostNotFoundException("Post with id " + postId + " not found");
            }
        }
    }


    public void printUserPosts(User u){
        for(Post post : u.getPosts()){
            System.out.println(post);
        }
    }



}

