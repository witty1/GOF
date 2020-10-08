package Factory.pizza;

import Factory.pizza.Pizza;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/4
 * @Time: 9:48
 * @Description: No Description
 */
public class ChicagoPizza extends Pizza {

    public ChicagoPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }

    public void test(){

    }
}
