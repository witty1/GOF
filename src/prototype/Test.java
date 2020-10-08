package prototype;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/6
 * @Time: 16:16
 * @Description: No Description
 */
public class Test {
    public static void main(String[] args) {
        //传统方法
        Sheep sheep = new Sheep("多利", 3, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
