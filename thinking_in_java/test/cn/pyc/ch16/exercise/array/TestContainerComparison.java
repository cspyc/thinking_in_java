package cn.pyc.ch16.exercise.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pyc
 */
public class TestContainerComparison {
    public static ContainerComparison containerComparison = null;

    @Before
    public void initial_obj() {
        containerComparison = new ContainerComparison();
    }

    @Test
    public void should_return_4_when_get_fourth_element() {
        Assert.assertEquals(4, containerComparison.queryArrayElement(4).getId());
    }

    @Test
    public void should_return_object_contain_a_value_equals_4_when_get_forth_element_in_list(){
        Assert.assertEquals(4,containerComparison.queryListElement(4).getId());


    }


}
