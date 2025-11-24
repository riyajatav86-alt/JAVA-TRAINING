
    // InstagramProfile.java
public class InstagramProfile {
    private String id;
    private String username;
    private String fullName;
    private String bio;
    private String website;
    private int followers;
    private int following;
    private int posts;
    private String profilePictureUrl;

    public InstagramProfile(String id, String username, String fullName, String bio,
                            String website, int followers, int following, int posts,
                            String profilePictureUrl) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.bio = bio;
        this.website = website;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
        this.profilePictureUrl = profilePictureUrl;
    }

    // Getters (add setters if you need mutability)
    public String getUsername() { return username; }
    public String getFullName() { return fullName; }
    public String getBio() { return bio; }
    public int getFollowers() { return followers; }
    public int getFollowing() { return following; }
    public int getPosts() { return posts; }
    public String getProfilePictureUrl() { return profilePictureUrl; }

    @Override
    public String toString() {
        return String.format(
            "InstagramProfile{username=%s, fullName=%s, followers=%d, following=%d, posts=%d, bio=%s, website=%s, picture=%s}",
            username, fullName, followers, following, posts, bio, website, profilePictureUrl
        );
    }
}

    
}
