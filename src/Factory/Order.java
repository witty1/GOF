package Factory;

import Factory.pizza.CheesePizza;
import Factory.pizza.ChicagoPizza;
import Factory.pizza.Pizza;

import java.util.Scanner;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/4
 * @Time: 9:51
 * @Description: No Description
 */
public class Order {
    public Order() {
        String type = orderPizza();
        Pizza pizza = null;

        if ("Cheese".equals(type)){
            pizza = new CheesePizza("奶酪披萨");
        }else if ("Chicago".equals(type)){
            pizza = new ChicagoPizza("芝加哥披萨");
        }
        if (pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    private String orderPizza() {
        String type = null;
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("请输入您要预定的披萨");
            type = sc.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }
}
