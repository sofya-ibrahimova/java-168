package mentor.lesson1;

public class Light implements Device {

    private boolean isOn;
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        isOn = true;
        Logger.info(name + " turned on!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        Logger.info(name + " turned off");
    }


    public boolean isOn() {
        return isOn;
    }

    public String getStatus() {
        String status = isOn ? "ON" : "OFF";
        return name + ": " + status;
    }
}
