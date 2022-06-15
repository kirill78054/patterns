package pattern.structural.bridge;

public class TV implements Device {

    private boolean isWork = false;
    private int volume = 10;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return isWork;
    }

    @Override
    public void enable() {
        this.isWork = true;
    }

    @Override
    public void disable() {
        this.isWork = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0) throw new IllegalArgumentException("Неверное значение для volume");
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (volume < 1) throw new IllegalArgumentException("Неверное значение для channel");
        this.channel = channel;
    }

}
