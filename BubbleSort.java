import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elemets: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Array Elemnts: ");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
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



