package lsystems;

public class A_AA extends LRule{
	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		char[] chars = {'A', 'A'};
		return chars;
	}

}
