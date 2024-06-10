package com.java8features;

public class RunnableLambdaExample {

	public static void main(String[] args) {


		/**
		 * Lagacy way of implementation runnable. Before java 8
		 */
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable1");

			}
		};

		new Thread(runnable).start();
		
		/**
		 * Runnable implemation using lambda
		 */
		Runnable runnable1=()->System.out.println("Inside runnable2");
		new Thread(runnable1).start();
		new Thread(()->System.out.println("Inside runnable3")).start();
		
	}

}
