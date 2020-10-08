package prototype.impriove;

import prototype.Sheep;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/6
 * @Time: 16:27
 * @Description: No Description
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep1 sheep1 = new Sheep1("多利", 3, "白色");
        sheep1.setSheep(new Sheep("李四",3,"白色"));
        Sheep1 clone1 = (Sheep1) sheep1.clone();
        clone1.getSheep().setAge(222);
        System.out.println(clone1.hashCode() == sheep1.hashCode());
        System.out.println(sheep1);
        System.out.println(clone1);
        DeepCloneObj obj = new DeepCloneObj("张三", new DeepCloneTarget("李四", 20));
        DeepCloneObj clone =(DeepCloneObj) obj.clone();
        System.out.println("obj:"+obj.getName()+obj.getTarget()+obj.hashCode());
        System.out.println(clone.getName()+clone.getTarget()+clone.hashCode());

    }
}
