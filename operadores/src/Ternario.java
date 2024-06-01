public class Ternario {
    public static void main(String[] args) {
        /*O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
        <Expressão Condicional>`` ?    ``<Caso condição seja true>``    :   ``<Caso condição seja false> */
        
        int a, b;
        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        // em operador ternário

         int resultado = (a==b) ? 1 :  0;
        
             System.out.println(resultado);
    }
}
