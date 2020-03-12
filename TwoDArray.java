import java.util.Scanner;
public class TwoDArray
{
    int[][] readIntArray(int r ,int c){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
	public static void main(String[] args) {
	    TwoDArray obj=new TwoDArray();
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=obj.readIntArray(r,c);
	     for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
        System.out.println();
        }
	}
}
