import java.util.Scanner;
public class DistinctElements
{
 void findDistinct(int a[],int n){
        int count=0;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n-1;j++){
		        for(int k=j+1;k<n-2;k++){
		            if(a[i]!=a[j]&&a[j]!=a[k]&&a[k]!=a[i])
		                if(a[i]+a[j]+a[k]==0)
		                       {
		                           count++;
		                           System.out.println(a[i]+" "+a[j]+" "+a[k]);
		                       }
		            
		        }
		    }
		}
		System.out.println(count);
    } 
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    DistinctElements obj =new DistinctElements();
	    obj.findDistinct(a,n);
	}
}
