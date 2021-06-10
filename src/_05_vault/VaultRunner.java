package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Spy James = new Spy();
	Vault TheVault=new Vault();
int jeff = James.findCode(TheVault);
System.out.println(jeff);
}
}
