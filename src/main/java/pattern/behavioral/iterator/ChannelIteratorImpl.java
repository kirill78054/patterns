package pattern.behavioral.iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private final ChannelTypeEnum type;
    private final List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
        this.type = type;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel c = channels.get(position);
            if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channels.get(position);
        position++;
        return c;
    }

}