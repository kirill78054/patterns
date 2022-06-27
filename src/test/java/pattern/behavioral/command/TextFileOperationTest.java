package pattern.behavioral.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextFileOperationTest {

    @Test
    public void executeOneTest() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        String resultOne = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));

        assertEquals(resultOne, "Opening file file1.txt");

    }

    @Test
    public void executeTwoTest() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        String resultTwo = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
        assertEquals(resultTwo, "Opening file file1.txt");

    }

    @Test
    public void executeLambdaTest() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        String resultTwo = textFileOperationExecutor.executeOperation(() -> "Result Lambda");
        assertEquals(resultTwo, "Result Lambda");
    }

}
