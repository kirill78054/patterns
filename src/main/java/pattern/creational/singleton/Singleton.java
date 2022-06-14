package pattern.creational.singleton;

import lombok.Getter;

public final class Singleton {

    @Getter
    private final String name;

    private static Singleton singleton;

    private Singleton(String name) {
        this.name = name;
    }

    public static synchronized Singleton getInstance(String name) {
        if (singleton == null) singleton = new Singleton(name);
        return singleton;
    }

}
