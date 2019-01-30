
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("medium_large")
    @Expose
    private MediumLarge mediumLarge;
    @SerializedName("large")
    @Expose
    private Large large;
    @SerializedName("carmack-attachment")
    @Expose
    private CarmackAttachment carmackAttachment;
    @SerializedName("carmack-header")
    @Expose
    private CarmackHeader carmackHeader;
    @SerializedName("carmack-archive")
    @Expose
    private CarmackArchive carmackArchive;
    @SerializedName("jetpack-portfolio-admin-thumb")
    @Expose
    private JetpackPortfolioAdminThumb jetpackPortfolioAdminThumb;
    @SerializedName("full")
    @Expose
    private Full full;
    @SerializedName("infinity-mag-400-260")
    @Expose
    private InfinityMag400260 infinityMag400260;
    @SerializedName("infinity-mag-725-480")
    @Expose
    private InfinityMag725480 infinityMag725480;

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public MediumLarge getMediumLarge() {
        return mediumLarge;
    }

    public void setMediumLarge(MediumLarge mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public CarmackAttachment getCarmackAttachment() {
        return carmackAttachment;
    }

    public void setCarmackAttachment(CarmackAttachment carmackAttachment) {
        this.carmackAttachment = carmackAttachment;
    }

    public CarmackHeader getCarmackHeader() {
        return carmackHeader;
    }

    public void setCarmackHeader(CarmackHeader carmackHeader) {
        this.carmackHeader = carmackHeader;
    }

    public CarmackArchive getCarmackArchive() {
        return carmackArchive;
    }

    public void setCarmackArchive(CarmackArchive carmackArchive) {
        this.carmackArchive = carmackArchive;
    }

    public JetpackPortfolioAdminThumb getJetpackPortfolioAdminThumb() {
        return jetpackPortfolioAdminThumb;
    }

    public void setJetpackPortfolioAdminThumb(JetpackPortfolioAdminThumb jetpackPortfolioAdminThumb) {
        this.jetpackPortfolioAdminThumb = jetpackPortfolioAdminThumb;
    }

    public Full getFull() {
        return full;
    }

    public void setFull(Full full) {
        this.full = full;
    }

    public InfinityMag400260 getInfinityMag400260() {
        return infinityMag400260;
    }

    public void setInfinityMag400260(InfinityMag400260 infinityMag400260) {
        this.infinityMag400260 = infinityMag400260;
    }

    public InfinityMag725480 getInfinityMag725480() {
        return infinityMag725480;
    }

    public void setInfinityMag725480(InfinityMag725480 infinityMag725480) {
        this.infinityMag725480 = infinityMag725480;
    }

}
