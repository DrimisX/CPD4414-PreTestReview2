/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author c0587637
 */
@ApplicationScoped
@ManagedBean
public class PostController {

    private List<Post> posts;
    private Post currentPost;

    public PostController() {
        updatePostsFromDatabase();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Post getCurrentPost() {
        return currentPost;
    }

    public Post getPostById(int id) {
        for (Post p : posts) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Post> getPostsByUserId(int userId) {
        List<Post> result = new ArrayList<>();
        for (Post p : posts) {
            if (p.getUser_id() == userId) {
                result.add(p);
            }
        }
        return result;
    }

    private void updatePostsFromDatabase() {
            // Create an ArrayList of Posts using the posts variable
            
            
            // Make a Connection using the Utils.getConnection() Method
            

            // Build a Query that selects all data from the posts table
            

            // Parse the Results for the following columns:
            // INT id
            // INT user_id
            // VARCHAR title
            // TIMESTAMP created_time
            // VARCHAR contents

    }

    public String savePost() {
        
            // Make a Connection

            // Build a Query that updates the post title and contents,
            // given a specific id.
            // HINT: The currentPost object will contain the title, contents, 
            // and id.

       
        
        return "viewPost";
    }

    // Navigation Methods
    public String viewPost(Post post) {
        currentPost = post;
        return "viewPost";
    }
}
