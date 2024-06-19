public class ExemploforArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};
        
    /*  int contador = 0;
        
        for (int i= 0; i< alunos.length;i++) {
            contador++;
            System.out.println("Aluno " +contador + ": " + alunos[i]);
        }
        
    */
    for (String aluno : alunos) {
        System.out.println(aluno);
      }

    }
}

