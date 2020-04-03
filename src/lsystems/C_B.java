package lsystems;

public class C_B extends LRule {
	
	public char getMatch() {
		return 'C';
	}
	
	public char[] getBody() {
		char[] chars = {'B'};
		return chars;
	}

}
