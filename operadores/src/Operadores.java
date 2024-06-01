public class Operadores {
    public static void main(String[] args) {
        int numero = 1;
        numero --; // igual a numero -= 1;
        numero ++; // igual a numero += 1;
        numero = - numero; // passando para negativo
        numero = numero * -1; // passando para positivo, já que numero = + numero não funciona
        System.out.println(numero);
} 
}
