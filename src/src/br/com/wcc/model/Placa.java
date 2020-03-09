package src.br.com.wcc.model;

import java.util.Random;

/**
 * projeto
 */
public class Placa {
    private final int nComponentes;
   // int numCapacitores, numConectores, numResistores, numSmeicondutores, numSensor, total;
    int aleatorio;
     private Componentes tipoComponentes[] = Componentes.values();
     private int qntComponentes[] = new int[tipoComponentes.length];

    public Placa() {
        Random random = new Random();
        int nAleatorio = random.nextInt(50);
        this.nComponentes = nAleatorio;
     }

    // 0 = Conector
    // 1 = Capacitor
    // 2 = Sensor
    // 3 = Resistor
    // 4 = Semicondutor
    public void geraPlaca() {
        System.out.println("Número de componentes dessa placa é: " + this.nComponentes);
        Random random = new Random();

        for (int i = 0; i < this.nComponentes; i++) {
             aleatorio = random.nextInt(tipoComponentes.length-1);
             qntComponentes[aleatorio] = qntComponentes[aleatorio]+1;
             
         }
    }   
    
        public void ListComponentes() {
           for (int i=0; i<tipoComponentes.length; i++) {
               System.out.println(tipoComponentes[i]+ ":" +qntComponentes[i] + "\n");
           }  
            //System.out.println("Capacitores:" + numCapacitores + "\n Conectores: " + numConectores + "\n Resistores: "
             //       + numResistores + "\n Sensores: " + numSensor + "\nSemiCondutores: " + numSmeicondutores);
         
               
                /*switch (aleatorio) {
                case 0:
                    numCapacitores++;
                    break;

                case 1:
                    numConectores++;
                    break;

                case 2:
                    numResistores++;
                    break;
                case 3:
                    numSensor++;
                    break;
                case 4:
                    numSmeicondutores++;
                    break;

            }*/
        }
    public enum Componentes {
      CONECTOR, CAPACITOR, SENSOR, RESISTOR, SEMICONDUTOR, TESTE1, TESTE2;
    }
         

}