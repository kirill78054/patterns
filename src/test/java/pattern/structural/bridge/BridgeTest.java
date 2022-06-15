package pattern.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeTest {

    @Test
    public void advancedRemoteMuteTest() {
        AdvancedRemote advancedRemote = new AdvancedRemote(new TV());
        advancedRemote.mute();
        int volume = advancedRemote.getDevice().getVolume();
        assertEquals(0, volume);
    }

    @Test
    public void remoteChannelUpTest() {
        Remote advancedRemote = new Remote(new TV());
        advancedRemote.channelUp();
        int channel = advancedRemote.getDevice().getChannel();
        assertEquals(2, channel);
    }

}
