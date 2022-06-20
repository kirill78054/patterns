package pattern.structural.decorator;

public class FileDataSource implements DataSource {

    private final String fileName;
    private String text;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        text = "Write data FileDataSource: " + data + " in file: " + fileName;
    }

    @Override
    public String readData() {
        return text;
    }

}
