package org.example.observer.youtubeexample;

public class YoutubeSubscriber implements Observer{
    @Override
    public void udpate() {
        System.out.println("new video on channel");
    }
}
