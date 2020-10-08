package prototype.impriove;

import java.io.Serializable;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/8
 * @Time: 8:16
 * @Description: No Description
 */
public class DeepCloneTarget implements Serializable, Cloneable {
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public DeepCloneTarget(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
