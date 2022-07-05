package pattern.behavioral.template_method;

public class Chess extends Game {

    private String winnerName;

    @Override
    protected void initializeGame() {
        names.add("Kirill");
        names.add("Ivan");
    }

    @Override
    protected void playGame() {
        if (names.get(0).length() > names.get(1).length()) {
            winnerName = names.get(0);
        } else {
            winnerName = names.get(1);
        }
    }

    @Override
    protected String printWinner() {
        return winnerName;
    }

}
