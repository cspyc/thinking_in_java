package cn.pyc.functionalprogram.apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pi
 */
public class AppleRepository {
    private List<Apple> inventory;

    public AppleRepository(){}
    public AppleRepository(List<Apple> inventory){
        this.inventory = inventory;
    }

    public List<Apple> getInventory() {
        return inventory;
    }

    public Integer harvestApple(Apple apple){
        this.inventory.add(apple);
        return inventory.size();
    }

    public Integer harvestApples(List<Apple> apples){
        this.inventory.addAll(apples);
        return inventory.size();
    }

    public List<Apple> pickUpGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if("Green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
}
