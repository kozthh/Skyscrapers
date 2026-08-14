package notifications.apps;

import notifications.absrule.NotificationRule;

public class Gcash extends NotificationRule {
    @Override
    public void paidNotifications() {
        System.out.print("your gcash payment is successful");
    }
}
