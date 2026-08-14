package notifications.apps;

import notifications.absrule.NotificationRule;

public class Uniondigital extends NotificationRule {
    @Override
    public void paidNotifications() {
        System.out.print("your parking fee is successfully paid, thank you so much for choosing union");
    }
}
