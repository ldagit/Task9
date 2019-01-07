package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int numb[][] = new int[3][3];
        int i;
        int j;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив целых чисел: ");
        for (i=0; i<3; ++i){
            for (j=0; j<3; ++j){
                System.out.printf("numb[%d][%d] = ", i, j);
                numb[i][j] = in.nextInt();
            }
        }
        System.out.println("Каждый элемент первой строки умножается на 3: ");
        i = 0;
        for (j=0; j<3; ++j) {
            System.out.print(3 * numb[i][j] + " ");
        }

        /*for (i=0; i<3; ++i){
            for (j=0; j<3; ++j){
                if (i==0) System.out.print(3*numb[i][j] + " ");
                else System.out.print(numb[i][j] + " ");
            }
            System.out.print("\n");
        }*/
    }
}
