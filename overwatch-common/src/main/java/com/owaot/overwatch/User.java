package com.owaot.overwatch;

public class User {

  private String gamerTag;
  private Region region;
  private Platform platform;
  private int level;
  private int skillRating;
  private int quickPlayWins;

  public User(){
  }

  public User(Platform platform, Region region, String gamerTag){
    this.platform = platform;
    this.region = region;
    this.gamerTag = gamerTag;
  }

  public String getGamerTag() {
    return gamerTag;
  }

  public void setGamerTag(String gamerTag) {
    this.gamerTag = gamerTag;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getSkillRating() {
    return skillRating;
  }

  public void setSkillRating(int skillRating) {
    this.skillRating = skillRating;
  }

  public int getQuickPlayWins() {
    return quickPlayWins;
  }

  public void setQuickPlayWins(int quickPlayWins) {
    this.quickPlayWins = quickPlayWins;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("User{");
    sb.append("gamerTag='").append(gamerTag).append('\'');
    sb.append(", region=").append(region);
    sb.append(", platform=").append(platform);
    sb.append(", level=").append(level);
    sb.append(", skillRating=").append(skillRating);
    sb.append(", quickPlayWins=").append(quickPlayWins);
    sb.append('}');
    return sb.toString();
  }
}
