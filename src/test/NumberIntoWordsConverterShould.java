import NumberIntoWordsConverter.NumberIntoWordsConverter;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverterShould {

    @Test
    public void convert_1_into_words_as_one() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("one", n2wConverter.convert(1));
    }

    @Test
    public void convert_2_into_words_as_two() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("two", n2wConverter.convert(2));
    }

    @Test
    public void convert_19_into_words_as_nineteen() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("nineteen", n2wConverter.convert(19));
    }

    @Test
    public void convert_21_into_words_as_twenty_one() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("twenty one", n2wConverter.convert(21));
    }
}
