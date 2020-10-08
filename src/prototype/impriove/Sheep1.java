package prototype.impriove;

import prototype.Sheep;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/6
 * @Time: 16:22
 * @Description: No Description
 */
public class Sheep1 implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    private Sheep sheep;

    /**
     *克隆该实例，使用默认的克隆方法
     */
    @Override
    protected Object clone(){
        Sheep1 sheep1 = null;
        try {
            sheep1 = (Sheep1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep1;
    }

    public Sheep1(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    public Sheep getSheep() {
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sheep=" + sheep.toString() +
                '}';
    }
}

