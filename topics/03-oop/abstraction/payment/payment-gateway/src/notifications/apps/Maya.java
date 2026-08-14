package notifications.apps;

import notifications.absrule.NotificationRule;

public class Maya extends NotificationRule {
    @Override
    public void paidNotifications() {
        System.out.print("fly high with your successful payment");
    }
}
