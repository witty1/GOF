package Factory.pizza;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/4
 * @Time: 9:43
 * @Description: No Description
 */
public abstract class Pizza {
    protected String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("正在准备"+name);
    }

    public void bake() {
        System.out.println("正在烘烤"+name);
    }

    public void cut() {
        System.out.println("正在裁剪"+name);
    }

    public void box() {
        System.out.println("正在打包"+name);
    }
}
