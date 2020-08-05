package cn.pyc.ch16.exercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pi
 */
public class ParameterizedArrayType {
    public static void main(String[] args){
        Integer[] ints = {1,2,3,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        System.out.println(Arrays.deepToString(ints2));
        System.out.println(Arrays.deepToString(doubles2));

        Integer[] ints3 = MethodParameter.f(ints);
        System.out.println(Arrays.deepToString(ints3));

        Double[] doubles3 = MethodParameter.f(doubles);
        System.out.println(Arrays.deepToString(doubles3));
    }
}

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter{
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}