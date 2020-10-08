package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 17:12
 * @Description: 双重检查实现单例，懒加载
 */
public class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
