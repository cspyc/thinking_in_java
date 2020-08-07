package cn.pyc.functionalprogram;

import java.util.Arrays;
import java.util.List;
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
}
