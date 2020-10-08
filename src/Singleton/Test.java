package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 17:23
 * @Description: No Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("静态内部类方式");
        System.out.println(StaticInner.getInstance() == StaticInner.getInstance());
        System.out.println("Double Check");
        System.out.println(DoubleCheck.getInstance() == DoubleCheck.getInstance());
        System.out.println("同步方法");
        System.out.println(SafeLazyLoadingSync.getInstance() == SafeLazyLoadingSync.getInstance());
        System.out.println("静态常量懒汉式");
        System.out.println(StaticConstant.getInstance() == StaticConstant.getInstance());
        System.out.println("线程不安全");
        System.out.println(UnsafeLazyLoading.getInstance() == UnsafeLazyLoading.getInstance());
        System.out.println("枚举");
        System.out.println(EnumSingleton.INSTANCE ==EnumSingleton.INSTANCE);
        EnumSingleton.test();
    }
}
