package collections.social_app;

public class Main {
    public static void main(String[] args) {
        MainLogic mainLogic = new MainLogic();
        User famil = new User(101, "Famil");
        System.out.println(famil.getPosts());
        System.out.println(famil.getId());
        System.out.println(famil.getName());
        System.out.println(famil.toString());

        mainLogic.addUser(famil);

        Post post1 = new Post(101, "First post");
        mainLogic.addPost(famil, post1);

        mainLogic.likePost(famil, 101);
        mainLogic.likePost(famil, post1.getId());
        mainLogic.likePost(famil, post1.getId());

        mainLogic.printUserPosts(famil);
        System.out.println(famil.getPosts());






    }
}
