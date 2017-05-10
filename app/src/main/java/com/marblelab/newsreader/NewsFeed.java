package com.marblelab.newsreader;

/**
 * Created by Abid Hasan on 5/10/2017.
 */

public class NewsFeed {
    private String title;
    private String description;
    private String tumbTitle;
    private String tumbDescription;
    private String tumbImaageLink;
    private String tag;
    private String source;
    private String updateTimeDate;
    private boolean favorite;
    private boolean saved;

    public NewsFeed(String title, String description, String tumbTitle, String tumbDescription, String tumbImaageLink, String tag, String source, String updateTimeDate, boolean favorite, boolean saved) {
        this.title = title;
        this.description = description;
        this.tumbTitle = tumbTitle;
        this.tumbDescription = tumbDescription;
        this.tumbImaageLink = tumbImaageLink;
        this.tag = tag;
        this.source = source;
        this.updateTimeDate = updateTimeDate;
        this.favorite = favorite;
        this.saved = saved;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTumbTitle(String tumbTitle) {
        this.tumbTitle = tumbTitle;
    }

    public void setTumbDescription(String tumbDescription) {
        this.tumbDescription = tumbDescription;
    }

    public void setTumbImaageLink(String tumbImaageLink) {
        this.tumbImaageLink = tumbImaageLink;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setUpdateTimeDate(String updateTimeDate) {
        this.updateTimeDate = updateTimeDate;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTumbTitle() {
        return tumbTitle;
    }

    public String getTumbDescription() {
        return tumbDescription;
    }

    public String getTumbImaageLink() {
        return tumbImaageLink;
    }

    public String getTag() {
        return tag;
    }

    public String getSource() {
        return source;
    }

    public String getUpdateTimeDate() {
        return updateTimeDate;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public boolean isSaved() {
        return saved;
    }
}
