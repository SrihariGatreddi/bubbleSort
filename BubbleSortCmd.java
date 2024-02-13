import java.util.*;
public class BubbleSortCmd{
    public static void main(String[] args){
        int n,i,j;
        n=args.length;
        int[] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(args[i]);
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array is  : ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

