
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UrlMeta {

    @SerializedName("origin")
    @Expose
    private Integer origin;
    @SerializedName("position")
    @Expose
    private Integer position;

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "UrlMeta{" +
                "origin=" + origin +
                ", position=" + position +
                '}';
    }
}
