package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public class WordsConverter {

    private String[] numberInWords = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty"
    };

    public String convertWords(int number){
        if(number <=20){
            return numberInWords[number];
        } else{
            String current = "twenty";
            number %= 10;
            return current+ " " + numberInWords[number];
        }
    }
}
