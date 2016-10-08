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
	public Die(){
		this.number=0;
		this.keep = false;

	}



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

		// ensures that 0 will not be a selected number  
		while (number==0) {
			Random random2 = new Random();
			number = random2.nextInt(7);

			/* the old code here allowed 0... but only if 2 random numbers from (0,1,2,3,4,5,6) were selected in succession.
			if(number==0){
			Random random2 = new Random();
		      number = random2.nextInt(7);
			 */
		}

	}
}
























/* import java.util.Random;  // the following is Adam's version of Die.java

public class Die {
	private int number;
	private boolean keep;

		/** Default constructor *//*
		public Die() {
			this(1, false);
		}
		
		/** Construct a Die with exact values *//*
		public Die(int number, boolean keep) {
			Random random1 = new Random();
			int convert = random1.nextInt(6);
			switch (convert) {
				case 0: 
					convert = 1;
					break;
				case 1: 
					convert = 2;
					break;
				case 2: 
					convert = 3;
					break;
				case 3: 
					convert = 4;
					break;
				case 4: 
					convert = 5;
					break;
				case 5: 
					convert = 6;
					break;
				}
			this.number = convert;
			
			if (convert == 4 || convert == 5 || convert ==6){
				keep = true;
			}
			//otherwise keep stays false
			this.keep = keep;
		}
		
		
		
		/** Get number *//*
		public int getNumber() {
			return number;
		}
	
		/** Set a new number *//*
		public void setNumber(int number) {

			//Random random1 = new Random(3);
			this.number = number;

		}
		
		
		
		/** Get keep *//*
		public boolean getKeep() {
			return keep;
		}

		/** Set a new annualInterestRate *//*
		public void setKeep(boolean keep) {
			this.keep = keep;
		}
}
*/