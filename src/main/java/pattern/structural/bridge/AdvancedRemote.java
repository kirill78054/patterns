package pattern.structural.bridge;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        getDevice().setVolume(0);
    }

}
