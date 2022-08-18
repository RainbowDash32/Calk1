package calculate;

import java.util.Scanner;

public class Calculator {
    static String[] entr;
    static int var1;
    static int var2;
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        try{
            entr = keyboard.nextLine().split(" ", 3);
            ArabicNumbersOrNot.isInteger(entr[0], entr[2]);
        }
        catch (Exception e){
            System.out.println("Некорректный ввод");
        }
            boolean isArabicNumbers = ArabicNumbersOrNot.isInteger(entr[0], entr[2]);
            boolean isRomanNumbers = RomanNumbersOrNot.isRoman(entr[0], entr[2]);
        if(isArabicNumbers) {
            var1 = Integer.parseInt(entr[0]);
            var2 = Integer.parseInt(entr[2]);
            if (var1>10 || var2>10 || var1<1 || var2<1){
                throw new Exception("Вводимые числа должны быть больше 1 и меньше 10");
            }
            System.out.println(Sign.Operation());
        }
        else if (isRomanNumbers) {
            RomanNumbers.RomanOperation(entr[0], entr[2]);
        }
            else {
                System.out.println("Данные введены неверно");
        }
    }
}
