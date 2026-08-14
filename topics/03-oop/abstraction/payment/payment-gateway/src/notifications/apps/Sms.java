package notifications.apps;

import notifications.absrule.NotificationRule;

public class Sms extends NotificationRule {
    @Override
    public void paidNotifications() {
        System.out.print("you successfully paid your parking fee, thank you so much ");
    }
}
