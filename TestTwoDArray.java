import java.util.Scanner;
class TwoDArray{
	
    public static int[][] readIntegerArray(int r ,int c){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
	
    public static double[][] readDoubleArray(int r ,int c){
        Scanner sc=new Scanner(System.in);
        double[][] a=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        return a;
    }
	
    public static boolean[][] readBooleanArray(int r ,int c){
        Scanner sc=new Scanner(System.in);
        boolean[][] a=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextBoolean();
            }
        }
        return a;
    }
	
    public static void printArray(int a[][],int r,int c){
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }
	
    public static void printArray(double a[][],int r,int c){
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }
    
    public static void printArray(boolean a[][],int r,int c){
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }   
}
public class TestTwoDArray
{
    
    
	public static void main(String[] args) {
	int r,c;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter no. of rows and columns for integer 2D-array:");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter integer elements :");
		int iArray[][]=TwoDArray.readIntegerArray(r,c);
		System.out.println("integer 2D-array elements are :");
		TwoDArray.printArray(iArray,r,c);
	
		System.out.println("Enter no. of rows and columns for double 2D-array:");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter double elements :");
	    	double dArray[][]=TwoDArray.readDoubleArray(r,c);
		System.out.println("double 2D-array elements are :");
		TwoDArray.printArray(dArray,r,c);
			
		System.out.println("Enter no. of rows and columns for boolean 2D-array:");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter boolean elements :");
		boolean bArray[][]=TwoDArray.readBooleanArray(r,c);
		System.out.println("boolean 2D-array elements are :");
		TwoDArray.printArray(bArray,r,c);
		
	}
}
