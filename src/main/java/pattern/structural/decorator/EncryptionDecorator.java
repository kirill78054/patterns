package pattern.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data + ", with EncryptionDecorator");
    }

    @Override
    public String readData() {
        return super.readData();
    }

}
