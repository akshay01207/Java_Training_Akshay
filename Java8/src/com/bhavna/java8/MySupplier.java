package com.bhavna.java8;

//import java.util.function.Consumer;
import java.util.function.Supplier;

/*Write Program to demonstrate use of
1.Suppler
2.Consumer
*/

public interface MySupplier {
	public static void main(String args[])
    {
        // Consumer to display a number
        Supplier<Double> ref = () -> Math.random();
        System.out.println(ref.get());
 
        // Implement display using accept()
//        ref.accept(10);
}
}
