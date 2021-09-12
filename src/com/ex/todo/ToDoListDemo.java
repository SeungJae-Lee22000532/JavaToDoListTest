package com.ex.todo;

import java.util.Scanner;

public class ToDoListDemo {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int select = 0;
		String doing;
		int num1, num2;
		ToDoList myList = new ToDoList();
		System.out.println("----To Do List Management-----");
      
		while(select !=6) {
			System.out.println("Select number what do you want");
			System.out.println("1: add\n2: remove\n3: replace\n4: clear\n5: View Size\n6 : EXIT");
			select = keyboard.nextInt();
       
			switch(select) {
				case 1:
					System.out.println("Enter the do list");
					doing = keyboard.next();
					myList.add(doing);
					myList.display();
					break;

				case 2:
					System.out.println("Enter the remove number");
					System.out.println();
					myList.display();
					num1 = keyboard.nextInt();
					myList.remove(num1);
					myList.display();
					break;

				case 3:
					System.out.println();
					myList.display();
					System.out.println("Enter the replace two index ");
					num1 = keyboard.nextInt();
					num2 = keyboard.nextInt();
					myList.replace(num1, num2);
					myList.display();
					break;
           
				case 4:
					System.out.println();
					myList.clear();
					System.out.println("Clear success");
					break;

				case 5:
					System.out.println();
					System.out.println("Size is " + myList.getCurrentSize());
					break;

				default:
					System.out.println("You entered Wrong number!");
					break;
			}// end switch
		}// end while
	}// end main
}// end class
