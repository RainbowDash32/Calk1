package calculate;

public class Sign {
    public static int Operation() throws Exception {
        int result;
        switch (Calculator.entr[1]) {
            case "+":
                result = Calculator.var1 + Calculator.var2;
                break;
            case "-":
                result = Calculator.var1 - Calculator.var2;
                break;
            case "*":
                result = Calculator.var1 * Calculator.var2;
                break;
            case "/":
                result = Calculator.var1 / Calculator.var2;
                break;
            default:
                throw new Exception("ведень неверный знак. Используйте только + - * /");
        }
        return result;
    }
}
