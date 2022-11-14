package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину масиву n: ");
        int n = input.nextInt();
        int[] mas = massive(n);
        System.out.print("\nВведений масив : {");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.print(" }\n\n");
        System.out.println("Мінімальний елемент масиву: " + Multipl(mas));
        System.out.println("Cуму елементів масиву розташованих між першим і другим від’ємними елементами: " + sumel(mas));
    }
    public static int[] massive(int n) {

        return new Random().ints(-100, 100).limit(n).toArray();
    }


    public static int Multipl(int [] mas)
    {
        int ar_min = mas[0];
        for (int i = 0; i < mas.length; i++)
        {
            if(mas[i] < ar_min)
                ar_min = mas[i];
        }
        return ar_min;
    }
    public static int sumel(int[] mas){
        int sum=0;
        int state = 0;
        for(int i=0;i< mas.length;i++){
            if(mas [i]<0)
                state++;
            if (state == 2)
                break;
            if(mas [i]>=0 && state==1)
                sum+=mas[i];
        }
        return sum;
    }
}
