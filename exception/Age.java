package com.bhavna.exception;

import java.util.Scanner;

public class Age {
       public void check() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your age : ");
                int age = sc.nextInt();
                if(age < 19) {
                    throw new InvalidAgeException("Invalid age Exception");
                }
                else {
                    System.out.println("Age is valid");
                }
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }




}
