package pattern.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionDecoratorTest {

    @Test
    public void readDataTest() {
        String fileName = "some.file";
        DataSource dataSource = new EncryptionDecorator(
                new CompressionDecorator(
                        new FileDataSource(fileName)
                )
        );
        dataSource.writeData("'some text about me'");

        String result = "Write data FileDataSource: 'some text about me', with EncryptionDecorator, with CompressionDecorator in file: " + fileName;
        assertEquals(result, dataSource.readData());
    }

}
