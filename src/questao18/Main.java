package questao18;

import questao17.Oficinas;

public class Main {
    public static void main(String[] args) {

        Oficinas oficina = new Oficinas();
        Thread oficinaThread = new Thread(oficina);
        oficinaThread.start();
    }
}