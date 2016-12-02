package NumberIntoWordsConverter;

/**
 * Created by rtulya on 12/2/2016.
 */
public interface WordsText {
    String[] uniqueTexts = {
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

    String TWENTY = "twenty";

    String convertWords(int Number);
}
