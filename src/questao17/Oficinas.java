package questao17;

public class Oficinas {
    final int QTD = 10; // quantidade de oficinas
    java.util.Random gerador = new java.util.Random();
    int oficina = gerador.nextInt(QTD); // identificador de oficina selecionada (um valor entre 1 e 10)
}
