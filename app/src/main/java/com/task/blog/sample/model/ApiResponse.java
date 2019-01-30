
package com.task.blog.sample.model;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private Boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    @SerializedName("jetpack_featured_media_url")
    @Expose
    private String jetpackFeaturedMediaUrl;
    @SerializedName("jetpack_publicize_connections")
    @Expose
    private List<Object> jetpackPublicizeConnections = null;
    @SerializedName("jetpack_shortlink")
    @Expose
    private String jetpackShortlink;
    @SerializedName("jetpack-related-posts")
    @Expose
    private List<JetpackRelatedPost> jetpackRelatedPosts = null;
    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    public String getJetpackFeaturedMediaUrl() {
        return jetpackFeaturedMediaUrl;
    }

    public void setJetpackFeaturedMediaUrl(String jetpackFeaturedMediaUrl) {
        this.jetpackFeaturedMediaUrl = jetpackFeaturedMediaUrl;
    }

    public List<Object> getJetpackPublicizeConnections() {
        return jetpackPublicizeConnections;
    }

    public void setJetpackPublicizeConnections(List<Object> jetpackPublicizeConnections) {
        this.jetpackPublicizeConnections = jetpackPublicizeConnections;
    }

    public String getJetpackShortlink() {
        return jetpackShortlink;
    }

    public void setJetpackShortlink(String jetpackShortlink) {
        this.jetpackShortlink = jetpackShortlink;
    }

    public List<JetpackRelatedPost> getJetpackRelatedPosts() {
        return jetpackRelatedPosts;
    }

    public void setJetpackRelatedPosts(List<JetpackRelatedPost> jetpackRelatedPosts) {
        this.jetpackRelatedPosts = jetpackRelatedPosts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public static DiffUtil.ItemCallback<ApiResponse> DIFF_CALLBACK = new DiffUtil.ItemCallback<ApiResponse>() {
        @Override
        public boolean areItemsTheSame(@NonNull ApiResponse oldItem, @NonNull ApiResponse newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull ApiResponse oldItem, @NonNull ApiResponse newItem) {
            return true;
        }
    };

    @Override
    public String toString() {
        return "ApiResponse{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", dateGmt='" + dateGmt + '\'' +
                ", guid=" + guid +
                ", modified='" + modified + '\'' +
                ", modifiedGmt='" + modifiedGmt + '\'' +
                ", slug='" + slug + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", title=" + title +
                ", content=" + content +
                ", excerpt=" + excerpt +
                ", author=" + author +
                ", featuredMedia=" + featuredMedia +
                ", commentStatus='" + commentStatus + '\'' +
                ", pingStatus='" + pingStatus + '\'' +
                ", sticky=" + sticky +
                ", template='" + template + '\'' +
                ", format='" + format + '\'' +
                ", meta=" + meta +
                ", categories=" + categories +
                ", tags=" + tags +
                ", jetpackFeaturedMediaUrl='" + jetpackFeaturedMediaUrl + '\'' +
                ", jetpackPublicizeConnections=" + jetpackPublicizeConnections +
                ", jetpackShortlink='" + jetpackShortlink + '\'' +
                ", jetpackRelatedPosts=" + jetpackRelatedPosts +
                ", links=" + links +
                ", embedded=" + embedded +
                '}';
    }
}
