package com.capstone.model;

import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Table(name = "Post_Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    Text categoryContent;

    //default constructor
    public Category() {
    }
    //Constructor
    public Category(String title, Text categoryContent) {
        this.title = title;
        this.categoryContent = categoryContent;
    }

    //Getter & Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getCategoryContent() {
        return categoryContent;
    }

    public void setCategoryContent(Text categoryContent) {
        this.categoryContent = categoryContent;
    }
}
