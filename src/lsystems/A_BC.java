package lsystems;

public class A_BC extends LRule {
	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		char[] chars = {'B', 'C'};
		return chars;
	}

}
