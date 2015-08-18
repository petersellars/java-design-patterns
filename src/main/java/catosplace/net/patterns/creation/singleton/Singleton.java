package catosplace.net.patterns.creation.singleton;

/**
 * Created by psellars on 18/08/15.
 *
 * Singleton Pattern implementation
 */
class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {

    }

}
