package mentor.lesson1;

import java.awt.*;

public class DeviceStatusMonitor {
    Device[] device;

    public DeviceStatusMonitor(Device device1, Device device2) {
        device = new Device[2];
        device[0] = device1;
        device[1] = device2;
    }

    public void checkAllStatuses() {
        for (int i = 0; i < device.length; i++){
            Logger.info("Monitorig: " + device[i].getStatus());
            }
        }
    }
