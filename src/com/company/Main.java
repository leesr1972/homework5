package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        System.out.print("Целочисленный массив arrInt {");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrInt[i]);
            if (i == 2) {
                System.out.println("};");
                break;
            }
            System.out.print(", ");
        }
        float arrFloat[] = new float[]{1.57f, 7.654f, 9.986f};
        System.out.print("Массив дробных чисел arrFloat {");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrFloat[i]);
            if (i == 2) {
                System.out.println("};");
                break;
            }
            System.out.print(", ");
        }
        char arrChar[] = {'A', 'B', 'C'};
        System.out.print("Массив символов arrChar {");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrChar[i]);
            if (i == 2) {
                System.out.println("}.");
                break;
            }
            System.out.print(", ");
        }

        System.out.println();
        System.out.print("Целочисленный массив arrInt наоборот {");
        for (int j = 2; j >= 0; j--) {
            System.out.print(arrInt[j]);
            if (j == 0) {
                System.out.println("};");
                break;
            }
            System.out.print(", ");
        }
        System.out.print("Массив дробных чисел arrFloat наоборот {");
        for (int j = 2; j >= 0; j--) {
            System.out.print(arrFloat[j]);
            if (j == 0) {
                System.out.println("};");
                break;
            }
            System.out.print(", ");
        }
        System.out.print("Массив символов arrChar наоборот {");
        for (int j = 2; j >= 0; j--) {
            System.out.print(arrChar[j]);
            if (j == 0) {
                System.out.println("}.");
                break;
            }
            System.out.print(", ");
        }

        System.out.println();
        System.out.print("Целочисленный массив arrInt с четными числами {");
        for (int k = 0; k <=2; k++) {
            if (arrInt[k] % 2 == 1) {
                arrInt[k] = arrInt[k] + 1;
                System.out.print(arrInt[k]);
            }
            else System.out.print(arrInt[k]);
                if (k == 2) {
                    System.out.println("}.");
                    break;
                }
                System.out.print(", ");
        }
    }
}
