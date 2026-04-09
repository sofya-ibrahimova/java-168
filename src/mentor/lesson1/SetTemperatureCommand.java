package mentor.lesson1;

public class SetTemperatureCommand implements Command {
    private AirConditioner ac;
    private int temperature;

    public SetTemperatureCommand(AirConditioner ac, int temperature) {
        this.ac = ac;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        try {
            ac.setTemperature(temperature);
        } catch (IllegalArgumentException e) {
            Logger.error("The temperature was not set");
        }
    }

}

