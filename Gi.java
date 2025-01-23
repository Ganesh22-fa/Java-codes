import java.util.*;
class Gi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max1=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max1)
            {
                max1=a[i];
            }
            
        }
        System.out.println(max1);
    }
}