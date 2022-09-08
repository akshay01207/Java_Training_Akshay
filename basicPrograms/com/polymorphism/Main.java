package com.polymorphism;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape name");
        String name=sc.next();
        switch(name) {
        case "Square":
            System.out.println("enter the side ");
            int side =sc.nextInt();
            Square obj=new Square();
            System.out.println(obj.calculateArea());
                
            break;
        case "Rectangle":
            System.out.println("enter the length and breadth ");
            int b =sc.nextInt();
            int l=sc.nextInt();
            Shape obj2=new Rectangle(name,l,b);
            System.out.println(obj2.calculateArea());
            break;
        case "Circle":
            System.out.println("enter the radius ");
            int r =sc.nextInt();
            Shape obj3=new Circle(name,r);
            System.out.println(obj3.calculateArea());    
            break;
        case "Hexagon":
            System.out.println("enter the side ");
            int s =sc.nextInt();
            Shape obj4=new Hexagon(name,s);
            System.out.println(obj4.calculateArea());    
            break;
            
        default:
            System.out.println("wrong choice ");
            }
    }



}