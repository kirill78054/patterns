package pattern.structural.bridge;

/*
Мост(Bridge)

Разделяет один или несколько классов на две отдельные
иерархии — абстракцию и реализацию, позволяя изменять их
независимо друг от друга.
*/
public class Remote {

    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    protected Device getDevice() {
        return device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

}
