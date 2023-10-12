package org.example.factorymethod.notificationexample;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("send sms notification");
    }
}
