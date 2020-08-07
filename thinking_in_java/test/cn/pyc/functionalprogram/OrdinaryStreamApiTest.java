package cn.pyc.functionalprogram;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author pi
 * @date 2020/8/7 15:28:24
 */
public class OrdinaryStreamApiTest {

    private OrdinaryStreamApi ordinaryStreamApi;

    @Before
    public void setFixture() {
        ordinaryStreamApi = new OrdinaryStreamApi();
    }

    @Test
    public void should_return_even_number() throws Exception {
        List<Integer> evenNumbers = ordinaryStreamApi.filterAllEvenNumber(new Integer[]{1, 2, 2, 4, 7, 10, -2});
        Assert.assertEquals(4, evenNumbers.size());
    }

    @Test
    public void should_return_words_length() throws Exception {
        List<Integer> wordsLength = ordinaryStreamApi.calculateWordsLength(new String[]{"words", "test", "111", "today"});
        Assert.assertEquals(4, wordsLength.size());
        Assert.assertEquals(5, wordsLength.get(0).intValue());
    }

    @Test
    public void should_merge_words_character_distinct() throws Exception {
        List<String> distinctCharacters = ordinaryStreamApi.mergeWordsCharactersDistinctly(new String[]{"www1w","22.3u"});
        Assert.assertEquals(6,distinctCharacters.size());
        Assert.assertEquals("2",distinctCharacters.get(2));
        Assert.assertEquals(".",distinctCharacters.get(3));
    }
}
