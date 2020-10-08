package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 17:06
 * @Description: 同步方法实现单例模式懒加载
 */
public class SafeLazyLoadingSync {
    private static SafeLazyLoadingSync instance;

    private SafeLazyLoadingSync() {
    }

    public static synchronized SafeLazyLoadingSync getInstance() {
        if (instance == null) {
            instance = new SafeLazyLoadingSync();
        }
        return instance;
    }
}
