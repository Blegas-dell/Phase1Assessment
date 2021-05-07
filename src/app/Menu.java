package app;

import java.util.Scanner;

abstract public class Menu {
	public static void MainMenu() {
		System.out.println("Hello, this is the Phase-1 Assessment Application");
		System.out.println("Developer: Brendan Legas");
		System.out.println("-------------------------------------------------");
		System.out.println("[1] Return file names in ascending order.");
		System.out.println("[2] Modify files in directory.");
		System.out.println("[3] Exit applicaiton.");
	}
	
	public static void ModifyMenu() {
		System.out.println("Please choose from the following options.");
		System.out.println("-----------------------------------------");
		System.out.println("[1] Add File");
		System.out.println("[2] Delete File");
		System.out.println("[3] Search for File");
		System.out.println("[4] Return to main menu.");
	}
	
	public static void Back() {
		System.out.println("[5] Press to go back to previous menu.");
		Scanner scanner = new Scanner(System.in);
		String back = scanner.nextLine();
		if (back.equals("5")) {
			Menu.ModifyMenu();
		}
	}
	
	public static void BackToMain() {
		System.out.println("[5] Press to go back to previous menu.");
		Scanner scanner = new Scanner(System.in);
		String back = scanner.nextLine();
		if (back.equals("5")) {
			Menu.MainMenu();
		}
	}


}
