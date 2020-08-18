/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.*;

/**
 *
 * @author faust
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a dimencao da matriz: ");
        System.out.print("n: ");

        int n = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        int diagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" ");
                System.out.print(matriz[i][j]);

            }
            System.out.println();

        }
        System.out.print(" Escolhe o valor: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (x == matriz[i][j]) {
                    System.out.println(i + "," + j);
                    if (matriz[i][j + 1] > 0) {
                        System.out.println("Rigth: " + matriz[i][j + 1]);

                    } if (matriz[i][j - 1] > 0) {
                        System.out.println("Lefth: " + matriz[i][j - 1]);
                    } if (matriz[i + 1][j] > 0) {
                        System.out.println("Up: " + matriz[i + 1][j]);

                    } if (matriz[i - 1][j] > 0) {
                        System.out.println("Down: " + matriz[i - 1][j]);
                    }

                }

            }

        }

        /*
        
                System.out.println("Diagonal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);

                }
                if (matriz[i][j] < 0) {
                    diagonal++;
                }
            }

        }
         */
        System.out.println("Quantidade de numeros negativos: " + diagonal);

    }

}
