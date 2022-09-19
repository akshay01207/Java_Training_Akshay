package com.bhavna.exception.m_catches;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class MultipleCatches {
		public void exceptions() {
			try {
				System.out.println(4 / 0);
				String word = null;
				System.out.println(word.charAt(1));
				FileInputStream fin = new FileInputStream("C://Java_io/ak2.txt");
				

			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException :divide by 0");
			} catch(NullPointerException n) {
				System.out.println("NullPointerException: string is empty");
			} catch(FileNotFoundException f) {
				System.out.println("NullPointerException: folder empty");
			}

		}
	}