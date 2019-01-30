
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PredecessorVersion {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("href")
    @Expose
    private String href;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "PredecessorVersion{" +
                "id=" + id +
                ", href='" + href + '\'' +
                '}';
    }
}
