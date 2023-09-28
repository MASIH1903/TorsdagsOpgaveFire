public class Team{
	


		private  String teamName;
		private int teamNumber;
		private String players;



		public Team(String teamName){
			this.teamName = teamName;


		}


		public void setRank(int teamNumber){
			this.teamNumber = teamNumber;




		}

		public String toString(){

			return "Team: " + teamName + " - Rank: " + teamNumber;
		}


	
}