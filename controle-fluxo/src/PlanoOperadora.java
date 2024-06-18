public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "Turbo";

        switch (plano) {
            case "Basic":
                System.out.println("100 minutos de ligação");
                break;
            case "Midia":
                System.out.println("WhatsApp e Instagram grátis");
                break;
            case "Turbo":
                System.out.println("5gb Youtube");
                break;
        
            default: System.out.println("Nenhum plano selecionado para esse operadora!");
                break;
        }
    }
}
//pq aqui nao é assim :(