/*Write a program WindChill.java that takes two double command-line arguments 
t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), 
the National Weather Service defines the effective temperature (the wind chill) to be:
w = 35.74 + 0.6215 t + (0.4275*t - 35.75) (V power(0.16))
Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 
(you may assume that the values you get are in that range).
*/

import java.lang.Math;
public class WindChill
{
  public double findWindChill(double temperature,double speed){
      double windChill=35.74+0.6215*temperature+((0.4257*temperature-35.75)*Math.pow(speed,0.16)); 
      return windChill;
  }
	public static void main(String[] args) {
	    double temperature=Double.parseDouble(arg[0]);
	    double speed=Double.parseDouble(arg[1]);
	    WindChill obj=new WindChill();
	    System.out.println(obj.findWindChill(temperature,speed));
	}
}
