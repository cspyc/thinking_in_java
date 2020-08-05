package cn.pyc.functionalprogram.apple;

import cn.pyc.functionalprogram.apple.constants.Constants;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author pi
 * @date 2020/8/5 09:37:34
 */
public class AppleTest {
    @Test
    public void should_return_true_when_apple_is_green() throws Exception {
        Apple apple = new Apple(Constants.GREEN_APPLE_COLOR,11.2);
        Assert.assertEquals(true,apple.isGreen());
    }

    @Test
    public void should_return_true_when_apple_weight_heavier_than() throws Exception {
        Apple apple = new Apple("red",123.2);
        Assert.assertEquals(true,apple.isHeavierThan(100.0));
    }


    @Test
    public void should_pick_apple_by_color() throws Exception {
        Apple apple = new Apple("Pink",12.22);
        Assert.assertEquals(true,apple.identityAppleColor("Pink"));
    }

}
