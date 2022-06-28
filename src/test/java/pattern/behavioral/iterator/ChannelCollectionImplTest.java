package pattern.behavioral.iterator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChannelCollectionImplTest {

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(100.55, ChannelTypeEnum.HINDI));
        return channels;
    }

    @Test
    public void iteratorTest() {
        ChannelIterator baseIterator = populateChannels()
                .iterator();
        double sum = 0;
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            sum += c.getFrequency();
        }

        assertEquals(399.05, sum, 0);
    }

    @Test
    public void iteratorHINDITypeTest() {
        ChannelIterator hindiIterator = populateChannels()
                .iterator(ChannelTypeEnum.HINDI);
        double sum = 0;
        while (hindiIterator.hasNext()) {
            Channel c = hindiIterator.next();
            sum += c.getFrequency();
        }

        assertEquals(200.05, sum, 0);
    }

}
