package org.example.observer.youtubeexample;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        YoutubeSubscriber sub1 = new YoutubeSubscriber();
        YoutubeSubscriber sub2 = new YoutubeSubscriber();
        YoutubeSubscriber sub3 = new YoutubeSubscriber();
        YoutubeSubscriber sub4 = new YoutubeSubscriber();

        youtubeChannel.addObserver(sub1);
        youtubeChannel.addObserver(sub2);
        youtubeChannel.addObserver(sub3);
        youtubeChannel.addObserver(sub4);

        youtubeChannel.releaseNewVideo("how to learn java");
    }


}
