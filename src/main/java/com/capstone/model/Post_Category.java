package com.capstone.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Post_Category {

    int categoryId;
    int postId;

//    Default Constructor

    public Post_Category() {
    }

//    Parameterized Constructor

    public Post_Category(int categoryId, int postId) {
        this.categoryId = categoryId;
        this.postId = postId;
    }

//    Getters & Setters

}
