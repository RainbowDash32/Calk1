package calculate;

import java.util.ArrayList;

public class RomanNumbersOrNot {
    public static boolean isRoman(String str, String str2) {
        boolean test1;
        boolean test2;
        boolean result;
        ArrayList<String> romanNumbersOrNot = new ArrayList<>(11){{
            add(0, "null");
            add(1, "I");
            add(2, "II");
            add(3, "III");
            add(4, "IV");
            add(5, "V");
            add(6,"VI");
            add(7, "VII");
            add(8, "VIII");
            add(9, "IX");
            add(10, "X");
        }};
        test1 = romanNumbersOrNot.contains(str);
        test2 = romanNumbersOrNot.contains(str2);
        result = test1 && test2;
        return result;
    }
}
