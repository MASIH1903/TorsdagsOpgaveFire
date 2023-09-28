import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions ){
		this.actions = actions;


	}


	public void displayMenu(){


		for( String s : actions){

			System.out.println(s);


		}



		}


		public String getAction(){


			System.out.println("Type a number to choose an action");

			for(String s : actions){

				System.out.println(s);


			}

			String choice;



			Scanner scan = new Scanner(System.in);

			choice = scan.nextLine();
			return choice;




	}







}