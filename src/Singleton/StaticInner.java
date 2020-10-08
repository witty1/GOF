package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 17:17
 * @Description: No Description
 */
public class StaticInner {
    private static StaticInner instance;
    private StaticInner() {}

    private static class Inner{
        static {
            System.out.println("初始化...");
        }
        private static final StaticInner instance = new StaticInner();
    }

    public static StaticInner getInstance() {
        return Inner.instance;
    }
}
