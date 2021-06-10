package _05_vault;

public class Spy{
int findCode(Vault Panda){
	for (int i = 0; i < 1000000; i++) {
		
	
	boolean Bob = Panda.tryCode(i);
	if(Bob==true) {
		return i;
	}
	
		
	
	}	
	return -1;
		
	
}

}