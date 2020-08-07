package cn.pyc.functionalprogram.menu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pi
 * @date 2020/8/7 09:40:50
 */
public class MenuProcessor {
    private List<Dish> menu;

    public MenuProcessor() {
        initialMenuData();
    }

    private void initialMenuData() {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }

    public List<String> queryThreeHighCaloriesDishNames() {
        return menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Dish> queryAllVegetarianDishes() {
        return menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

    public List<Dish> queryFirstTwoDishes() {
        return menu.stream()
                .filter(dish -> !dish.isVegetarian())
                .limit(2)
                .collect(Collectors.toList());
    }
}
