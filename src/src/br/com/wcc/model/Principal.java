package src.br.com.wcc.model;

import java.util.Scanner;

/**
 * projeto
 */
public class Principal {
    public static void main(String[] args) {
        int p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de placas que deseja: ");
        p = scanner.nextInt();
        Montador mont = new Montador(p);
        mont.placa();
     }

    
}