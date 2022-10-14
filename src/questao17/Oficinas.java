package questao17;

public class Oficinas implements Runnable {
    final int QTD = 10; // quantidade de oficinas
    java.util.Random gerador = new java.util.Random();
    int oficina = gerador.nextInt(QTD); // identificador de oficina selecionada (um valor entre 1 e 10)

    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
