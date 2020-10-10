package ru.netology.domain;

public
class RepostsInfo {
    private int repostsCount;
    private boolean userReposted;

    public
    int getRepostsCount() {
        return repostsCount;
    }

    public
    void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public
    boolean isUserReposted() {
        return userReposted;
    }

    public
    void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
