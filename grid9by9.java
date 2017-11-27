package main;
import java.util.*;

public class grid9by9 {
    static ArrayList<Integer> arr;
    static int[][] grid;
    static int bSum;
    
    public static void main(String[] args) {
        arr = new ArrayList<>();
        grid = new int[3][3];
        
        grid[0][0] = 1;
        grid[0][1] = 4;
        grid[0][2] = 8;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 3;
        grid[2][0] = 9;
        grid[2][1] = 4;
        grid[2][2] = 1;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 1) {
                    bSum = way3v1(i, j);
                    System.out.println(bSum);
                } else if (grid[i][j] == 8 || grid[i][j] == 9) {
                	bSum = way3v2(i,j);
                	System.out.println(bSum);
                } else {
                    bSum = way2(i, j);
                    System.out.println(bSum);
                }
            }
        }
    }
    
    public static int way2(int i, int j) {
        int sum1 = 1, sum2 = 1, sum = 0;
        for (int k = 0; k < 3; k++) {
            sum1 *= grid [i][k];
        }
        for (int k = 0; k < 3; k++) {
            sum2 *= grid [k][j];
        }
        if (sum1 > sum2)
        	sum = sum1;
        else
        	sum = sum2;
        return sum;
    }
    
    public static int way3v1(int i, int j) {
    	int sum1 = 1, sum2 = 1, sum3 = 1, sum = 0;
        for (int k = 0; k < 3; k++) {
            sum1 *= grid [i][k];
        }
        for (int k = 0; k < 3; k++) {
            sum2 *= grid [k][j];
        }
        for (int k = 0; k < 3; k++) {
        	sum3 *= grid [k][k];
        }
        arr.add(sum1);
        arr.add(sum2);
        arr.add(sum3);
        arr.sort(null);
        sum = arr.get(2);
        arr.clear();
        return sum;
    }
    
    public static int way3v2(int i, int j) {
    	int sum1 = 1, sum2 = 1, sum3 = 1, sum = 0;
        for (int k = 0; k < 3; k++) {
            sum1 *= grid [i][k];
        }
        for (int k = 0; k < 3; k++) {
            sum2 *= grid [k][j];
        }
        int k = 0;
        for (int l = 2; l >= 0; l--) {
        	sum3 *= grid [k][l];
        	k++;
        }
        arr.add(sum1);
        arr.add(sum2);
        arr.add(sum3);
        arr.sort(null);
        sum = arr.get(2);
        arr.clear();
        return sum;
    }
    
}
