
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JetpackRelatedPost {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("url_meta")
    @Expose
    private UrlMeta urlMeta;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("format")
    @Expose
    private Boolean format;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("context")
    @Expose
    private String context;
    @SerializedName("img")
    @Expose
    private Img img;
    @SerializedName("classes")
    @Expose
    private List<Object> classes = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlMeta getUrlMeta() {
        return urlMeta;
    }

    public void setUrlMeta(UrlMeta urlMeta) {
        this.urlMeta = urlMeta;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getFormat() {
        return format;
    }

    public void setFormat(Boolean format) {
        this.format = format;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Img getImg() {
        return img;
    }

    public void setImg(Img img) {
        this.img = img;
    }

    public List<Object> getClasses() {
        return classes;
    }

    public void setClasses(List<Object> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "JetpackRelatedPost{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", urlMeta=" + urlMeta +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", format=" + format +
                ", excerpt='" + excerpt + '\'' +
                ", rel='" + rel + '\'' +
                ", context='" + context + '\'' +
                ", img=" + img +
                ", classes=" + classes +
                '}';
    }
}
