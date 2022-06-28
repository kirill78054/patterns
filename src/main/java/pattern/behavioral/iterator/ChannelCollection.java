package pattern.behavioral.iterator;

public interface ChannelCollection {

    void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator();

    ChannelIterator iterator(ChannelTypeEnum type);

}
