
package com.task.blog.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("amp_status")
    @Expose
    private String ampStatus;
    @SerializedName("spay_email")
    @Expose
    private String spayEmail;
    @SerializedName("jetpack_publicize_message")
    @Expose
    private String jetpackPublicizeMessage;

    public String getAmpStatus() {
        return ampStatus;
    }

    public void setAmpStatus(String ampStatus) {
        this.ampStatus = ampStatus;
    }

    public String getSpayEmail() {
        return spayEmail;
    }

    public void setSpayEmail(String spayEmail) {
        this.spayEmail = spayEmail;
    }

    public String getJetpackPublicizeMessage() {
        return jetpackPublicizeMessage;
    }

    public void setJetpackPublicizeMessage(String jetpackPublicizeMessage) {
        this.jetpackPublicizeMessage = jetpackPublicizeMessage;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "ampStatus='" + ampStatus + '\'' +
                ", spayEmail='" + spayEmail + '\'' +
                ", jetpackPublicizeMessage='" + jetpackPublicizeMessage + '\'' +
                '}';
    }
}
