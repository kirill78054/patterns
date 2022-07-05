package pattern.behavioral.template_method;

public class Monopoly extends Game {

    private String winnerName;

    @Override
    protected void initializeGame() {
        names.add("Kirill");
        names.add("Ivan");
        names.add("Masha");
        names.add("Vladimir");
    }

    @Override
    protected void playGame() {
        winnerName = names.stream().max(String::compareTo).get();
    }

    @Override
    protected String printWinner() {
        return winnerName;
    }

}
