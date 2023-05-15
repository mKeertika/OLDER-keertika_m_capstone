package com.capstone.model;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int postId;
    Date createdDate;
    Text commentContent;

//    Default Constructor

    public Comment() {
    }

//    Parameterized Constructor

    public Comment(int postId, Date createdDate, Text commentContent) {
        this.postId = postId;
        this.createdDate = createdDate;
        this.commentContent = commentContent;
    }

//    Getters & Setters

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Text getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(Text commentContent) {
        this.commentContent = commentContent;
    }
}
