package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar Bob = new RaceCar("Ferarri" , 5);
		
		// 2. Print the RaceCar's position in the race
		int position = Bob.getPositionInRace();
		System.out.println("Your position in the race is the "+position+"th position.");
		// 3. Crash the RaceCar
Bob.crash();

		// 4. If the car is damaged. Bring it in for a pit stop.
boolean crashed = Bob.isDamaged();
if(crashed==true) {
	Bob.pit();
}
		// 5. Help the car move into first place.
while(Bob.getPositionInRace() > 1) {
	Bob.overtake();
}
	}
}
