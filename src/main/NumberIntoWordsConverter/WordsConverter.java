package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public class WordsConverter implements WordsText{

    public String convertWords(int number){
        if(number <=20){
            return uniqueTexts[number];
        } else{
            number %= 10;
            return TWENTY+ " " + uniqueTexts[number];
        }
    }
}
