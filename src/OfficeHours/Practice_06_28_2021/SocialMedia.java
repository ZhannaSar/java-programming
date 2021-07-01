package OfficeHours.Practice_06_28_2021;

public abstract class SocialMedia {
    /*Create an abstract class for Social Media that has the following features:
- Direct messaging(String username, String message)
- Post(String body)
- Notifications()
• The Social Media will also have the following fields:
- Personal URl (String)
- Account length (int)
- Platform (static String)
     */

    String personUrl;
    int accountLength;
    static String Platform;

    public abstract void DirectMessaging(String username, String message);
    public abstract void Post(String body);
    public abstract void Notifications();
}
