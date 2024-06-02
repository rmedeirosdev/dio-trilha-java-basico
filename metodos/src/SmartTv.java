public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }    
    public void desligar () {
        ligada = false;
    }    

    public int aumentarVolume() {
        return volume++;
    }
    public int diminuirVolume() {
        return volume--;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public int mudarCanal (int novoCanal) {
        canal = novoCanal;
        return canal;
    }
    
}
