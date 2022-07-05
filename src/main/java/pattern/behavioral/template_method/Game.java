package pattern.behavioral.template_method;

import java.util.LinkedList;
import java.util.List;

/*
Шаблонный метод(Template Method)

Определяет скелет алгоритма, перекладывая ответственность
за некоторые его шаги на подклассы. Паттерн позволяет под-
классам переопределять шаги алгоритма, не меняя его общей
структуры.
*/
public abstract class Game {
    protected final List<String> names;

    protected Game() {
        this.names = new LinkedList<>();
    }

    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract String printWinner();

    public final String playOneGame() {
        initializeGame();
        playGame();

        String winnerName = printWinner();
        System.out.println("Победитель игры " + getClass().getSimpleName() + " - " + winnerName);
        return winnerName;
    }

}

