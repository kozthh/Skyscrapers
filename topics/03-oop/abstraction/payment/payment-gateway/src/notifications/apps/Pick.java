package notifications.apps;

import payments.Cash;

public class Pick {

    public void pick(String app) {
        switch (app) {
            case "gcash":
                new payments.Gcash();
                break;
            case "maya":
                new payments.Maya();
                break;
            case "uniondigital":
                new payments.Uniondigital();
                break;
            case "cash":
                new Cash();
                break;
            case "sms":
                new Sms();
                break;
            default:
                System.out.println("Unknown app: " + app);
        }
    }
}
