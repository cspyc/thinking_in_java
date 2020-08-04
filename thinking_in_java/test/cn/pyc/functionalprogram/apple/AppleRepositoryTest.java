package cn.pyc.functionalprogram.apple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppleRepositoryTest {

    @Test
    public void should_pick_all_green_apple() throws Exception {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Green",110.0));
        apples.add(new Apple("Green",310.21));
        apples.add(new Apple("Red",150.23));

        AppleRepository appleRepository = new AppleRepository(apples);
        List<Apple> greenApples = appleRepository.pickUpGreenApples(appleRepository.getInventory());
        Assert.assertEquals(2,greenApples.size());
    }


}
