package test1;

import java.util.Scanner;

 public class CalculateArea {

  public static void main(String[] args) {
        // TODO Auto-generated method stub

 

        System.out.println("Enter side of the square:");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base");
        int base= sc.nextInt();
        System.out.println("enter the height");
        int height= sc.nextInt();
        int result;
        result=(1/2)*base*height;
        System.out.println("result=" +result);
    }
}