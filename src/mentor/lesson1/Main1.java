package mentor.lesson1;

public class Main1 {
    public static void main(String[] args) {

        SecurityAlarm sa = new SecurityAlarm();
        AirConditioner ac = new AirConditioner("Living room AC");

        HomeAutomationController ham = new HomeAutomationController();
        ham.registerDevice(sa);
        ham.registerDevice(ac);

        TurnOnCommand turnOnSecurityAlarm = new TurnOnCommand(sa);
        TurnOnCommand turnOnAirConditioner = new TurnOnCommand(ac);

        turnOnSecurityAlarm.execute();
        turnOnAirConditioner.execute();

        SetTemperatureCommand setTemperatureCommand = new SetTemperatureCommand(ac, 10);
        setTemperatureCommand.execute();

        DeviceStatusMonitor dsm = new DeviceStatusMonitor(ac, sa);
        dsm.checkAllStatuses();
        ham.CheckALlStatuses();
    }
}
