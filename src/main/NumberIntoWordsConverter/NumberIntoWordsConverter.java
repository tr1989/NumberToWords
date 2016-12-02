package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

    private String[] numberInWords = {"zero", "one", "two"};

    public String convert(int number){
        return numberInWords[number];
    }
}
