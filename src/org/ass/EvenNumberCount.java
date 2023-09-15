package org.ass;

public class EvenNumberCount {
    static int[] a ={6,7,8,9,13};
    static int count= 0;
    static int counter=0;
    void DisplayResult() {
        System.out.println("Odd Numbers:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
                System.out.println(a[i]);

            }

        }
        System.out.println("Total Odd Number: " + count);
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                counter++;
                System.out.println(a[i]);
            }
        }

        System.out.println("Total Even Number: " + counter);
    }
    public static void main(String[] args){
        EvenNumberCount myNo = new EvenNumberCount();
    myNo.DisplayResult();
    }
}
