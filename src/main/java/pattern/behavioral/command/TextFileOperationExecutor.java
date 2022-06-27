package pattern.behavioral.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    @Getter
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

}
