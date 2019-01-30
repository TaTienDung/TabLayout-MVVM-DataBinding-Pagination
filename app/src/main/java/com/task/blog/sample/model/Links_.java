
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Links_ {

    @SerializedName("self")
    @Expose
    private List<Self_> self = null;
    @SerializedName("collection")
    @Expose
    private List<Collection_> collection = null;
    @SerializedName("about")
    @Expose
    private List<About> about = null;
    @SerializedName("author")
    @Expose
    private List<Author_> author = null;
    @SerializedName("replies")
    @Expose
    private List<Reply> replies = null;

    public List<Self_> getSelf() {
        return self;
    }

    public void setSelf(List<Self_> self) {
        this.self = self;
    }

    public List<Collection_> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection_> collection) {
        this.collection = collection;
    }

    public List<About> getAbout() {
        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public List<Author_> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author_> author) {
        this.author = author;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

}
