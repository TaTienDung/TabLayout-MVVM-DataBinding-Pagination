
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Embedded {

    @SerializedName("author")
    @Expose
    private List<Author> author = null;
    @SerializedName("wp:featuredmedia")
    @Expose
    private List<WpFeaturedmedium> wpFeaturedmedia = null;
    @SerializedName("wp:term")
    @Expose
    private List<List<WpTerm>> wpTerm = null;

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<WpFeaturedmedium> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }

    public List<List<WpTerm>> getWpTerm() {
        return wpTerm;
    }

    public void setWpTerm(List<List<WpTerm>> wpTerm) {
        this.wpTerm = wpTerm;
    }

    @Override
    public String toString() {
        return "Embedded{" +
                "author=" + author +
                ", wpFeaturedmedia=" + wpFeaturedmedia +
                ", wpTerm=" + wpTerm +
                '}';
    }
}
