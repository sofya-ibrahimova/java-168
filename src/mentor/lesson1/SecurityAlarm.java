package mentor.lesson1;

public class SecurityAlarm implements Device {
    private boolean isOn;


    @Override
    public void turnOn() {
        isOn = true;
        Logger.info(getName() + " turned on!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        Logger.info(getName() + " turned off");
    }

    @Override
    public String getName() {
        return "SecurityAlarm";
    }

    public boolean isOn() {
        return isOn;
    }

   public String getStatus() {
        String status = isOn ? "ON" : "OFF";
        return getName() + ": " + status;
    }
}
