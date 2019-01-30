
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Title_ {

    @SerializedName("rendered")
    @Expose
    private String rendered;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    @Override
    public String toString() {
        return "Title_{" +
                "rendered='" + rendered + '\'' +
                '}';
    }
}
