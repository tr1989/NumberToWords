package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

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

    public String convert(int number){
        if(number <=20){
            return numberInWords[number];
        } else{
            return "twenty one";
        }
    }
}
