package cn.pyc.functionalprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author pi
 * @date 2020/8/7 15:27:51
 */
public class OrdinaryStreamApi {
    public List<Integer> filterAllEvenNumber(Integer[] integers) {
        return Arrays.asList(integers)
                .stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> calculateWordsLength(String[] words) {
        return Arrays.asList(words)
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public List<String> mergeWordsCharactersDistinctly(String[] words) {
        return Arrays.asList(words)
                .stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer[]> combineArrayAElementsAndArrayBElementsForNewArrays(Integer[] arrayA, Integer[] arrayB) {
        return Arrays.asList(arrayA)
                .stream()
                .flatMap(i -> Arrays.asList(arrayB).stream().map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
    }

    public List<Integer[]> combineArrayAElementsAndArrayBElementsForNewArraysSumCanDividedBy3(Integer[] arrayA, Integer[] arrayB) {
        return Arrays.asList(arrayA)
                .stream()
                .flatMap(i -> Arrays.asList(arrayB).stream().filter(j -> (i + j) % 3 == 0).map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
    }

    public Integer calculateMaxNumber(Integer[] numbers) {
        Optional<Integer> maxNumberObj =
                Arrays.asList(numbers)
                        .stream()
                        .reduce(Integer::max);
        return maxNumberObj.get();
    }
}
