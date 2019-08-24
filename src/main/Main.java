package main;
 import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);
            double t = scan.nextDouble();
            scan.close();
            double g = 9.8;
            double speed = g*t;
            double distance =(1f/2f)*( g * t *t);
            System.out.println("the speed of object at " + t + " seconds after its release is" + speed + " and the distance travelled by the object in the " + t + " seconds after the release is "+ distance);



        }}





