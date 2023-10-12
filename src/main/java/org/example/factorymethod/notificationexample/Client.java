package org.example.factorymethod.notificationexample;

public class Client {

    public static void main(String[] args) throws Exception {

        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
