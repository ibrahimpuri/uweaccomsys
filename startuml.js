public class User {
    public void openApp(App app) {
        app.requestAccess();
    }

    public void grantAccess() {
        // Access granted logic
    }
}

public class App {
    public void requestAccess() {
        AlarmSystem alarmSystem = new AlarmSystem();
        alarmSystem.checkCredentials();
    }
}

public class AlarmSystem {
    public void checkCredentials() {
        SecuritySystem securitySystem = new SecuritySystem();
        if (securitySystem.validateCredentials()) {
            Database database = new Database();
            database.retrieveUserData();
            activateAlarm();
        }
    }

    private void activateAlarm() {
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.activateAlarm();
    }
}

public class SecuritySystem {
    public boolean validateCredentials() {
        // Validation logic
        return true;
    }

    public void activateAlarm() {
        // Alarm activation logic
    }
}

public class Database {
    public void retrieveUserData() {
        // Retrieve user data logic
    }
}