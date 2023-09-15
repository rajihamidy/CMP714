package org.ass;

public class LargestNoInArray {
    public static int getLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                   // temp = a[i];
                    //a[i] = a[j];
                    a[j] = a[i];
                }
            }
        }
        return a[total-1];

    }
    public static int AddArray(int[] a, int total){
        int sum = 0;
        for (int i = 0; i < total; i++)
        {


            sum = sum + a[i] ;
            //a[i] = a[j];
            //a[j] = a[i];


        }
        return sum;
    }
    public static void main(String[] args){
        int[] c ={1,2,5,6,3,2,50,9};
        int[] b ={44,66,99,770,33,22,55,205,8};
        System.out.println("The Largest of array a is :"+getLargest(c,8));
        System.out.println("The Largest of array b is :"+getLargest(b,9));
        System.out.println("The Sum of array a is :"+AddArray(c,8));
        System.out.println("The Sum of array b is :"+AddArray(b,9));
    }
}
