package cn.pyc.ch16.exercise.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author pi
 */
public class MultidimensionalArray {
    public int[][] generateMultidimensionalArray() {
        int[][] a = {
            {1,2,3},
            {4,5,6}
        };
        System.out.println(Arrays.deepToString(a));
        return a;
    }

    public int[][][] generate3DimensionlIntArray() {
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
        return a;
    }
}
