   class YouTubeChannel {
    private String channelName;
    private int subscribers;

    // Constructor
    public YouTubeChannel(String channelName, int subscribers) {
        this.channelName = channelName;
        this.subscribers = subscribers;
    }

    // Method to display subscriber count
    public void showSubscribers() {
        System.out.println("Channel: " + channelName);
        System.out.println("Subscribers: " + subscribers);
    }

    // Method to increase subscribers
    public void addSubscriber() {
        subscribers++;
    }

    // Method to decrease subscribers
    public void removeSubscriber() {
        if (subscribers > 0) {
            subscribers--;
        }
    }
}

public class Main {
    public static void main(String[] ar…
    