package Singleton;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/2
 * @Time: 16:46
 * @Description: 静态常量实现单例模式
 */
public class StaticConstant {
    private static final StaticConstant instance = new StaticConstant();

    private StaticConstant(){}

    public static StaticConstant getInstance() {
        return instance;
    }
}


