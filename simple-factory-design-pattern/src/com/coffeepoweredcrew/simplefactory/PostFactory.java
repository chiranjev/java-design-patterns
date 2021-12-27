package com.coffeepoweredcrew.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(String type) {
        if(type.equalsIgnoreCase("blog")) {
            return new BlogPost();
        }else if(type.equalsIgnoreCase("news")) {
            return new NewsPost();
        }else if(type.equalsIgnoreCase("product")) {
            return new ProductPost();
        }else {
            throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
