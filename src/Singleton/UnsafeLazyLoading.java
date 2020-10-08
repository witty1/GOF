package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 16:59
 * @Description: 线程不安全懒汉式
 */
public class UnsafeLazyLoading {
    private static UnsafeLazyLoading instance;

    private UnsafeLazyLoading() {
    }

    public static UnsafeLazyLoading getInstance() {
        if (instance == null) {
            instance = new UnsafeLazyLoading();
        }
        return instance;
    }
}


