package src.br.com.wcc.model;

/**
 * projeto
 */
public class Montador {
private final int numPlaca;

public Montador(int numPlaca) {
    this.numPlaca = numPlaca;
}

 public void placa(){
     for(int i =0; i<numPlaca; i++){
     System.out.println("Placa: " + (i+1)+" de "+ this.numPlaca);
     Placa placa = new Placa();
     placa.geraPlaca();
     placa.ListComponentes();

    }

 }
}
