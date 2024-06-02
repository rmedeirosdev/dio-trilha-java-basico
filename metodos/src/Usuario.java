public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.ligar();
        smartTv.mudarCanal(10);
        System.out.println("A Tv está ligada?" + " " + smartTv.ligada);
        System.out.println("Canal atual:" + " " + smartTv.canal);
        System.out.println("Volume:" + " " + smartTv.volume);
    }
}
