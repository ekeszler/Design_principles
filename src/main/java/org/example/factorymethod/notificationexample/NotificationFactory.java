package org.example.factorymethod.notificationexample;

public class NotificationFactory {


    public static Notification createNotification (String channel) throws Exception{
        switch (channel) {
            case "SMS":
                    return new SMSNotification();
            case "ËMAIL":
                return new EmailNotification();
            default:
                throw new Exception("wrong chanel");
        }
    }
}
