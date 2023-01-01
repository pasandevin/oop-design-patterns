package singleton;

import singleton.threadsafesol3.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
