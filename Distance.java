/*Write a program Distance.java that takes two integer command-line arguments x and y and
prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
The formulae to calculate distance = sqrt(x*x + y*y). 
Use Math.power function
*/

import java.lang.Math;
import java.util.Scanner;
public class Distance
{
    public double euclideanDistance(int x,int y){
        double distance=Math.pow(x*x+y*y,0.5);
        return distance;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int x=s.nextInt();
	    int y=s.nextInt();
	    Distance obj=new Distance();
    System.out.println(obj.euclideanDistance(x,y));
	}
}
