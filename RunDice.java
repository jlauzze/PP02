//*********************************************************************
//* 																  *
//* CIS611 				Fall Session 2016 		AdamBarn JoseLauz  	  * 
//* 																  *
//*					 Program Project 02 						  	  *
//* 																  *
//* 					Java Programming							  *
//* 																  *
//* 																  *
//*						October 10, 2016 							  *
//* 																  *
//* 				Saved in: JoseLauzPP02.zip					      *
//* 																  *
//*********************************************************************
//


import javax.swing.*;

public class RunDice {
	//declare class variables
	public static int rollNum;
	public static boolean six;
	public static boolean five;
	public static boolean four;
	public static Die[] die = new Die[5];
	
	
	public static void main(String[] args) {
	//invoking methods
	    initDie();
	    roll();
		System.exit(0);
	}
	

	
	public static void initDie(){
		
		//initializing array of type Die[]
		
		for (int i=0; i<die.length; i++){
		die[i]= new Die();
		
		/*display contents of array for testing
		JOptionPane.showMessageDialog(null, "This element's number equals: "+die[i].getNumber()+ 
				"\n"+"This element's keep equals: " + die[i].getKeep());*/
		
		}
		
		
	}
	
	public static void roll(){
		/*can roll one to three times depending 
		  on outcome of each roll */
		
		//roll 0 up to 2
		while(rollNum <= 2){
			
			//initialize variables
			int dieNum=0;
			for (int i=0;i<die.length;i++){
				if(die[i].getKeep()==false){
				//set number
				die[i].setNumber();
				}
			}
			
			//handle rollNum <=2 die which equal 6, 5, or 4
			for (int i=0;i<die.length;i++){
			
				//setKeep & six equals true if getNumber equals 6
				for (int j=0;j<die.length;j++){
				if (die[j].getNumber()==6 && six==false){
					//set to true values
					die[j].setKeep(true);
					six=true;
					
					//loop through to make sure you don't need to adjust 5, or 4
					for(int k=0;k<die.length;k++){
						if(die[k].getNumber()==5&& six==true&&five==false){
							die[k].setKeep(true);
							five=true;
							for(int l=0;l<die.length;l++){
								if(die[l].getNumber()==4&&six==true &&five==true&&four==false){
									die[l].setKeep(true);
									four=true;
								}
							}
						}
					}
						
				}}
				for (int j=0;j<die.length;j++){
					//setKeep & five equals true if getNumber equals 5
					if (die[j].getNumber()==5 && six==true&&five==false){
						die[j].setKeep(true);
						five=true;
						
					}}
				for (int j=0;j<die.length;j++){
					
					//setKeep & four equals true if getNumber equals 4
					if (die[j].getNumber()==4 && six==true &&five==true&&four==false){
						die[j].setKeep(true);
						four=true;
						
					}}
				
				calculateScore();
			}
			
			//display contents of array for testing
			JOptionPane.showMessageDialog(null, "Element[0] number & keep equals: "+die[0].getNumber()+ die[0].getKeep()+"\n"+"Element[1] number & keep equals: "+die[1].getNumber()+ 
					die[1].getKeep()+"\n"+"Element[2] number & keep equals: "+die[2].getNumber()+ die[2].getKeep()+"\n"+"Element[3] number & keep equals: "+die[3].getNumber()+
					die[3].getKeep()+"\n"+"Element[4] number & keep equals: "+die[4].getNumber() + die[4].getKeep());
			
			//display number of available die and ask to continue
			for(int i=0;i<die.length;i++){
				
				if(die[i].getKeep()==false){
					
					dieNum++;
				}}
				int dialogResult = JOptionPane.showConfirmDialog(null, "You have " + dieNum + " die to roll. Your present score equals " + calculateScore() +" Do you want to keep rolling?");
			
				//if player would like to continue
				if (dialogResult == JOptionPane.YES_OPTION){
					rollNum++;
					continue;
			
			}else{
				finalScore();
				System.exit(0);
			}
			break;
		}
		JOptionPane.showMessageDialog(null,"You have rolled 3 times and can no longer roll.");
		finalScore();
			
		
		}
	
		
		
		
		
	
	
	public static int calculateScore(){
	//declare variables
		int score1=0;
		int score2=0;
		int score3=0;
		
		//score for roll 0
		if (rollNum==0&&six==true&&five==true&&four==true){
			for(int i=0;i<die.length;i++){
				if(die[i].getKeep()==false){
					score1=die[i].getNumber()+score1;
				}
			}
			return score1;
		}
		
		//score for roll 1
		if (rollNum==1&&six==true&&five==true&&four==true){
			for(int i=0;i<die.length;i++){
				if(die[i].getKeep()==false){
					score2=die[i].getNumber()+score2;
				}
			}
			return score2;
		}
		
		//score for roll 2
		if (rollNum==2&&six==true&&five==true&&four==true){
			for(int i=0;i<die.length;i++){
				if(die[i].getKeep()==false){
					score3=die[i].getNumber()+score3;
				}
			}
			return score3;
		}
		
		
		//if nothing nothing, return 0
		return 0;
	
		
	}
	
	public static void finalScore() {
		/*My understanding of the final score is that
		it is the score that you settle on and then exit the game, not necessarily
		the highest score you receive.*/
		
		//invokes the calculateScore method
		JOptionPane.showMessageDialog(null,"You have exited the game with the final score: "  + calculateScore());
	
	}
	
	


}
