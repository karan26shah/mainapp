
package com.example.karan.mainapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerList {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("link_url")
    @Expose
    public Object linkUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(Object linkUrl) {
        this.linkUrl = linkUrl;
    }

}
