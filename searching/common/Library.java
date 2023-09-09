package searching.common;

import java.util.Random;
import java.util.Scanner;

public class Library {

    public int getInt(String input, int m, int n){
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(input  + ":");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if(a >= m && a <= n){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter between: " + m + " and " + n);
            }
        }
        return a;
    }
    public int[] createArray(int n){
        int [] arr = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public void displayAll(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
