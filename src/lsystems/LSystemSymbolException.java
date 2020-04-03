package lsystems;

public class LSystemSymbolException extends Exception{
	
	public LSystemSymbolException(String errorMessage) {
		super(errorMessage);
	}
	
	public char getSymbol() {
		return 'Q';
	}

}
