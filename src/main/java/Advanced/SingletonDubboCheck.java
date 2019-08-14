package Advanced;

public class SingletonDubboCheck {

    private SingletonDubboCheck() {
    }

    private static SingletonDubboCheck sing = null;

    public static SingletonDubboCheck getSing() {
        if (sing == null) {
            synchronized (SingletonDubboCheck.class) {
                if (sing == null) {
                    sing = new SingletonDubboCheck();
                }
            }
        }
        return new SingletonDubboCheck();
    }
}
