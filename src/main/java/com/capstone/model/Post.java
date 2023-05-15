package com.capstone.model;

import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Table(name = "POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int postId;
    int authorId;
    int parentId;
    String title;
    Text content;
    String comment;
    Category category;

//    Default Constructor
    public Post() {
    }

//    Parameterized Constructor
    public Post(int authorId, int parentId, String title, Text content, String comment, Category category) {
        this.authorId = authorId;
        this.parentId = parentId;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.category = category;
    }

//    Getters & Setters
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getContent() {
        return content;
    }

    public void setContent(Text content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
