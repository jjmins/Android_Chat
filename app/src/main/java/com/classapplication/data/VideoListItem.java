package com.classapplication.data;

public class VideoListItem {
    private String title;
    private String date;
    private String link;
    private boolean bl;

    public VideoListItem(String title,String date,String link,boolean bl){
        this.title = title;
        this.date= date;
        this.link = link;
        this.bl= bl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
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
}
