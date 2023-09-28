import java.util.ArrayList;

public class MainMenu{
	

	public static void main(String[] args){

			ArrayList<String> a = new ArrayList<String>();

			a.add("Start game");
			a.add("Resume game");
			a.add("Pause game");
			a.add("End game");



			//System.out.println(actions.get(3));


			GameMenu menu = new GameMenu(a);

			//menu.displayMenu();

			int userChoice = Integer.parseInt(menu.getAction());

			doAction(userChoice);

			


				}



				public static void doAction(int action){


				switch(action){

					case 1: 
					System.out.println("Starting the´game now");
					break;
					case 2: 
					System.out.println("Fetching previously saved game data");
					break;
					case 3:
					System.out.println("Game paused");
					break;
					case 4:
					System.out.println("Ending game");
					break;
				default:



			}

			

}
}



			

			
	
