package Advanced;

public class SingletonStatic {

    private SingletonStatic() {
    }

    private static class Init {
        private static final SingletonStatic Init = new SingletonStatic();
    }

    public SingletonStatic getSingleton() {
        return Init.Init;
    }
}
