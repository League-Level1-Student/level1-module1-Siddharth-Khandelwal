package _06_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
void quack() {
	System.out.println("Quack! Quack!");
}
void waddle() {
	System.out.println("Waddle. Waddle.");
}
	
}

