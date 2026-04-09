package mentor.lesson1;

public class HomeAutomationController {

    private Device[] devices;
    private int size;

    {
        devices = new Device[10];
    }

    void registerDevice(Device device) {
        try {
            devices[size++] = device; //???
            Logger.info(device.getName() + " registered");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Maksimal cihaz sayi!");
        }
    }

    void turnOnAllDevices() {
        for (int i = 0; i < size; i++) {
            devices[i].turnOn();
        }
    }

    void setDeviceTemperature(int temperature) {
        for (int i = 0; i < size; i++) {
            if (devices[i] instanceof AirConditioner) {
                try {
                    ((AirConditioner) devices[i]).setTemperature(temperature);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    void CheckALlStatuses() {
        for (int i = 0; i < size; i++) {
            Logger.info(devices[i].getStatus());
        }
    }
}



