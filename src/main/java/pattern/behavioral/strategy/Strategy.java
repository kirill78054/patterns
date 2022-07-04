package pattern.behavioral.strategy;

/*
Стратегия(Strategy)

Определяет семейство схожих алгоритмов и помещает каждый
из них в собственный класс, после чего алгоритмы можно вза-
имозаменять прямо во время исполнения программы.
*/
public interface Strategy {

    int execute(int a, int b);

}
