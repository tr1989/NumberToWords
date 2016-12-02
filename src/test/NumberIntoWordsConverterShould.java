import org.junit.Test;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverterShould {

    @Test
    public void convert_1_into_words_as_one() {
        NumberIntoWordsConverter n2wConverter = NumberIntoWordsConverter();
        assertEquals("one", n2wConverter.convert(1));
    }
}
