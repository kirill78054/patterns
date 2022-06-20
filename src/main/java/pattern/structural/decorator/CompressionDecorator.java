package pattern.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data + ", with CompressionDecorator");
    }

    @Override
    public String readData() {
        return super.readData();
    }

}
