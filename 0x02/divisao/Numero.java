public class Numero {
    public static void dividir(int a, int b) {
        int resultado = 0;
        
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
            return;
        } finally {
            System.out.println(a + " / " + b + " = " + (b != 0 ? resultado : 0));
        }
    }
}