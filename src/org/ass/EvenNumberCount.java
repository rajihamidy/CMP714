package org.ass;

public class EvenNumberCount {
    public static void main(String[] args){
        int[] a ={6,7,8,9,13};
        int count= 0;
        int counter=0;
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                count++;
                System.out.println(a[i]);
            }

        }
        System.out.println("Total Odd Number: "+count);
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                counter++;
                System.out.println(a[i]);
            }
        }
        System.out.println("Total Even Number: "+counter);
    }
}
