package pattern.creational.singleton;

import lombok.Getter;

/*
Одиночка(Singleton)

Гарантирует, что у класса есть только один экземпляр, и предо-
ставляет к нему глобальную точку доступа.
*/
public final class Singleton {

    private static Singleton singleton;
    @Getter
    private final String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static synchronized Singleton getInstance(String name) {
        if (singleton == null) singleton = new Singleton(name);
        return singleton;
    }

}
