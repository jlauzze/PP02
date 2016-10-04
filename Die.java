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

import java.util.Random;

public class Die {
//declare instance variables
	private int number;
	private boolean keep;
	
	//constructors
	
		//two parameter constructor
		/* public Die(int number,boolean keep){
			 this.number=number;
			this.keep = keep;
		
		 }*/
	 	
	 
	
	//return keep
	public boolean getKeep(){
		return keep;
	}
	
	//set new keep
	public void setKeep(boolean keep){
		
			this.keep = keep;
	
	}
	
	//return number
	public int getNumber(){
	
		return number;
	}
	
	//set new number
		public void setNumber(){
			
			//create a random number bigger than 0, but no larger than 6
			Random random = new Random();
		      number = random.nextInt(7);
		      
			if(number==0){
			Random random2 = new Random();
		      number = random2.nextInt(7);
			}
		
	}
}
