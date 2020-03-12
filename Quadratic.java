import java.lang.Math;
import java.util.Scanner;
public class Quadratic
{
  public void findRoots(int a,int b,int c){
      double delta=b*b-4*a*c;
      if(delta>=0){
            double sqrt=Math.sqrt(delta);
            double root1=(-b+sqrt)/(2*a);
            double root2=(-b-sqrt)/(2*a);
            System.out.println(root1+" "+root2);
      }
      else{
        System.out.println("imaginary roots..");
      }
  }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    Quadratic obj=new Quadratic();
	    obj.findRoots(a,b,c);
	}
}
