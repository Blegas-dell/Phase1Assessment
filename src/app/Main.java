package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Menu.MainMenu();
		String stopper = null;
		while (stopper!="stop") {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose slection by typing number in []'s: ");
			String selection = scanner.nextLine();
			
			
			
			if (selection.equals("1")) {
				ReturnFiles obj = new ReturnFiles();
				obj.userInput();
				Menu.BackToMain();
			} if (selection.equals("2")){
				Menu.ModifyMenu();
				
				String stopper2 = null;
				while (stopper2!="stop") {
					String selection2 = scanner.nextLine();
					
					if (selection2.equals("1")) {
						ModifyFiles adder = new ModifyFiles();
						adder.AddFile();
						Menu.Back();
					} if (selection2.equals("2")) {
						ModifyFiles deleter = new ModifyFiles();
						deleter.DeleteFile();
						Menu.Back();
					} if (selection2.equals("3")) {
						ModifyFiles searcher = new ModifyFiles();
						searcher.SearchFile();
						Menu.Back();
					} if (selection2.equals("4")) {
						stopper2="stop";
						Menu.MainMenu();
					}
				}

				
			} if (selection.equals("3")) {
				stopper="stop";
				System.out.println("Goodbye.");
				
			} else {
				System.out.println("Please select either 1, 2, 3.");
			}
		}
		
		
		Runtime.getRuntime().exit(0);

		
	}

}
