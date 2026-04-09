package mentor.lesson1;

public class AirConditioner implements Device {
    private boolean isOn;
    private int temperature = 16;
    private String name;


    public AirConditioner(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setTemperature(int temperature) {
        if (temperature < 16 || temperature > 30) {
            throw new IllegalArgumentException();
        }
        this.temperature = temperature;
        Logger.info(name + " temperature set to " + temperature);
    }

    @Override
    public void turnOn() {
        isOn = true;
        Logger.info(name + " turned on. Temperature: " + temperature);
    }

    @Override
    public void turnOff() {
        isOn = false;
        Logger.info(name + " turned off");
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String getStatus() {
        String status = isOn ? "ON" : "OFF";
        return name + ": " + status + ", " + temperature + "°C";
    }


}

