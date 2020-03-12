/*Write a program Quadratic.java to find the roots of the equation 
a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. 
The 2 roots of the equation can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/

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
