package org.ass;

public class SumArray {
    static int[] a ={6,5,6,7,5,8,3,9,3};
    static int sum= 0;
    static int counter=0;
    void DisplayResult() {
        System.out.println("Odd Numbers:");

        for (int i = 0; i < a.length; i++) {

                sum=sum+a[i];
              //  System.out.println(sum);



        }
        System.out.println("Total SUM: " + sum);
        }



    public static void main(String[] args){
        SumArray myNo = new SumArray();
        myNo.DisplayResult();
    }
}
