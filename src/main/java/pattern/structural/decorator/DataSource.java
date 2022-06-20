package pattern.structural.decorator;

/*
Декоратор(Decorator)

Позволяет динамически добавлять объектам новую функцио-
нальность, оборачивая их в полезные «обёртки».
*/
public interface DataSource {

    void writeData(String data);

    String readData();

}
