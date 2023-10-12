package org.example.factorymethod.notificationexample;

public class EmailNotification implements  Notification{
    @Override
    public void notifyUser() {
        System.out.println("send an email notification");
    }
}
