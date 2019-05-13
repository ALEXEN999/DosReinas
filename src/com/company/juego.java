package com.company;

import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        int nx = 0, ny = 0;
        int bx = 7, by = 3;
        char[][] Tablero = new char[8][8];

        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido a Tu Reina");

        for (int i = 0; i < 8; i++) {
            System.out.println("   +---+---+---+---+---+---+---+---+");
            System.out.print(i + "  | ");
            for (int j = 0; j < 8; j++) {
                if (i == nx && j == ny) {
                    Tablero[i][j] = 'N';
                    System.out.print(Tablero[i][j] + " | ");
                    j++;
                }
                if (i == bx && j == by) {
                    Tablero[i][j] = 'B';
                    System.out.print(Tablero[i][j] + " | ");
                    j++;
                }
                Tablero[i][j] = ' ';
                System.out.print(Tablero[i][j] + " | ");

            }
            System.out.println("");
        }
        System.out.println("   +---+---+---+---+---+---+---+---+");
        System.out.println("     0   1   2   3   4   5   6   7");

        boolean vencedor = false;
        while (vencedor == false) {
            if (bx != nx && by != ny) {
                System.out.println("Introduce una posicion:");

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (Tablero[i][j] == 'B') {
                            Tablero[i][j] = ' ';
                            bx = in.nextInt();
                            by = in.nextInt();
                            if(bx == Tablero[i-1][j-1] && by == Tablero[i-1][j-1]) {
                                Tablero[bx][by] = 'B';
                                break;
                            } else {
                                System.out.println("Introduce una posicion valida");

                            }
                            break;
                        }

                    }
                }


                for (int i = 0; i < 8; i++) {
                    System.out.println("   +---+---+---+---+---+---+---+---+");
                    System.out.print(i + "  | ");
                    for (int j = 0; j < 8; j++) {
                        if (i == nx && j == ny) {
                            Tablero[i][j] = 'N';
                            System.out.print(Tablero[i][j] + " | ");
                            j++;
                        }
                        if (i == bx && j == by) {
                            Tablero[i][j] = 'B';
                            System.out.print(Tablero[i][j] + " | ");
                            j++;
                        }
                        Tablero[i][j] = ' ';
                        System.out.print(Tablero[i][j] + " | ");

                    }
                    System.out.println("");
                }
                System.out.println("   +---+---+---+---+---+---+---+---+");
                System.out.println("     0   1   2   3   4   5   6   7");
            }
            else {
                vencedor = true;
                System.out.println("Gana blanca o negra");
            }
        }
    }


    //TABLERO
//
//    void tablero(){
//
//    }
//// NEGRAS
//void negra(){
//
//}
////// BLANCAS
//    void blanca(int bx, int by,) {
//
//        boolean vencedor = false;
//        while (vencedor == false) {
//            System.out.println("Introduce una posicion:");
//
//            for (int i = 0; i < 8; i++) {
//                for (int j = 0; j < 8; j++) {
//                    if (Tablero[i][j] == 'B') {
//                        Tablero[i][j] = ' ';
//                        bx = in.nextInt();
//                        by = in.nextInt();
//
//                        break;
//                    }
//
//                }
//            }
//        }
//
//    }


}
////MOVIMIENTO DE CADA UNA DE ELLAS
//void movimiento(){
//
//}
//// COMPROBAR CONSTANTEMENTE SI SE COMEN
//void colision(){
//
//}


