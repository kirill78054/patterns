package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private final List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator() {
        return iterator(ChannelTypeEnum.ALL);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channelsList);
    }

}
