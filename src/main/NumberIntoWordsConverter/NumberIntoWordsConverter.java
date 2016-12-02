package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

    public String convert(int number){
        WordsConverter wordsConverter = new WordsConverter();
        return wordsConverter.convertWords(number);
    }

}
