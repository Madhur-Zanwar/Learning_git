package java_basics.Amazon_Easy;
import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void RD(int Array[]) {
        int j=1;
        int Array1[]=new int[Array.length];
        Array1[0]=Array[0];
        for (int i=0; i<Array.length-1; i++){
           if (Array[i+1]!=Array[i]){
               Array1[j]=Array[i+1];
               j++;
           }
        }
        for (int i=0; i<Array1.length; i++){
            if (Array1[i]==Array1[i+1]){
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Array[]=new int[n];
        for (int i=0; i<n; i++){
            Array[i]=sc.nextInt();
        }
        RD(Array);
    }
}
