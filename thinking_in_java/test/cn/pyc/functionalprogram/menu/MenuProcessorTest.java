package cn.pyc.functionalprogram.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author pi
 * @date 2020/8/7 09:45:57
 */
public class MenuProcessorTest {

    private MenuProcessor menuProcessor;

    @Before
    public void setFixture() {
        menuProcessor = new MenuProcessor();
    }

    @Test
    public void should_return_3_dish_and_calories_more_than_300() throws Exception {
        List<String> threeHighCaloriesDishNames = menuProcessor.queryThreeHighCaloriesDishNames();
        Assert.assertEquals(3, threeHighCaloriesDishNames.size());
        Assert.assertEquals("pork", threeHighCaloriesDishNames.get(0));
    }

    @Test
    public void should_return_all_vegetarian_dishes() throws Exception {
        List<Dish> dishes = menuProcessor.queryAllVegetarianDishes();
        Assert.assertEquals(4, dishes.size());
    }

    @Test
    public void should_return_first_two_meat_dishes() throws Exception {
        List<Dish> twoMeatDishes = menuProcessor.queryFirstTwoDishes();
        Assert.assertEquals(2, twoMeatDishes.size());
        Assert.assertEquals("pork", twoMeatDishes.get(0).getName());
        Assert.assertEquals("beef", twoMeatDishes.get(twoMeatDishes.size() - 1).getName());
    }

    @Test
    public void should_return_number_of_dishes() throws Exception {
        Integer count = menuProcessor.countDishes();
        Assert.assertEquals(9, count.intValue());
    }

    @Test
    public void should_return_the_sum_of_calories() throws Exception {
        Long begin = System.currentTimeMillis();
        Integer calories = menuProcessor.countDishesCalories();
        Assert.assertEquals(4200, calories.intValue());
        Long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
