import java.io.*;
import java.util.*;

public class Main {

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] ba = {
                arr[lo]
            };
            return ba;
        }

        int mid = (lo + hi) / 2;
        int[] left = mergeSort(arr, lo, mid);
        int[] right = mergeSort(arr, mid + 1, hi
        int[] merged = mergeTwoSortedArrays(left, right);
        return merged;
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        System.out.println("Merging these two arrays ");
        System.out.print("left array -> ");
        print(a);
        System.out.print("right array -> ");
        print(b);
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            ans[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            ans[k] = b[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = {81,1,45,95,52,11,47,0,45,62,67};
        int[] sa = mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array -> ");
        print(sa);
    }
