package ru.netology.domain;

public class Post {
    private int id;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private String copyright;
    private LakesInfo lakesInfo;
    private RepostsInfo repostsInfo;
    private int viewsCount;
    private String postType;
    private int postSource;
    private Geo geo;
    private int signerID;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean pinned;
    private boolean markedAsAd;
    private boolean favorite;
    private int postponedID;

    public
    int getId() {
        return id;
    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    int getOwnerID() {
        return ownerID;
    }

    public
    void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public
    int getFromID() {
        return fromID;
    }

    public
    void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public
    int getCreatedBy() {
        return createdBy;
    }

    public
    void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public
    int getDate() {
        return date;
    }

    public
    void setDate(int date) {
        this.date = date;
    }

    public
    String getText() {
        return text;
    }

    public
    void setText(String text) {
        this.text = text;
    }

    public
    int getReplyOwnerID() {
        return replyOwnerID;
    }

    public
    void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public
    int getReplyPostID() {
        return replyPostID;
    }

    public
    void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public
    boolean isFriendsOnly() {
        return friendsOnly;
    }

    public
    void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public
    CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public
    void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public
    String getCopyright() {
        return copyright;
    }

    public
    void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public
    LakesInfo getLakesInfo() {
        return lakesInfo;
    }

    public
    void setLakesInfo(LakesInfo lakesInfo) {
        this.lakesInfo = lakesInfo;
    }

    public
    RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public
    void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public
    int getViewsCount() {
        return viewsCount;
    }

    public
    void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public
    String getPostType() {
        return postType;
    }

    public
    void setPostType(String postType) {
        this.postType = postType;
    }

    public
    int getPostSource() {
        return postSource;
    }

    public
    void setPostSource(int postSource) {
        this.postSource = postSource;
    }

    public
    Geo getGeo() {
        return geo;
    }

    public
    void setGeo(Geo geo) {
        this.geo = geo;
    }

    public
    int getSignerID() {
        return signerID;
    }

    public
    void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public
    boolean isCanPin() {
        return canPin;
    }

    public
    void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public
    boolean isCanDelete() {
        return canDelete;
    }

    public
    void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public
    boolean isCanEdit() {
        return canEdit;
    }

    public
    void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public
    boolean isPinned() {
        return pinned;
    }

    public
    void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public
    boolean isMarkedAsAd() {
        return markedAsAd;
    }

    public
    void setMarkedAsAd(boolean markedAsAd) {
        this.markedAsAd = markedAsAd;
    }

    public
    boolean isFavorite() {
        return favorite;
    }

    public
    void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public
    int getPostponedID() {
        return postponedID;
    }

    public
    void setPostponedID(int postponedID) {
        this.postponedID = postponedID;
    }
}
