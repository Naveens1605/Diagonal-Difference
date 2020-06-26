package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int diagonalDifference(ArrayList<ArrayList<Integer>> arr){
        int sum = 0,sum1 = 0;
        for(int i = 0;i < arr.size()-1; i++) {
            for (int j = 0; j< arr.size()-1; j++) {
                if (i == j) {
                    sum = sum + arr.get(i).get(j) ;
                }
            }
        }
        int res = sum;
        return res;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>arr =  new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter Size of Matrix : ");
        int n = sc.nextInt();
        for(int i=0;i < n ;i++) {
            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }
            arr.add(a);
            a.clear();
        }
        System.out.println(arr);
    }
}
