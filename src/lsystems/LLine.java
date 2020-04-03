package lsystems;

import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {

		String s;
		Iterator<LRule> r = rules.iterator();
		//for(LRule rule : rules) {
		while(r.hasNext()) {
			LRule rule = r.next();
			int i = 0;
			while (i < line.length) {
				if (line[i] != 'A' && line[i] != 'B' && line[i] != 'C') {
						throw new LSystemSymbolException("e");
				}
				i++;
			}
			if (line.length == 0) {
				throw new LSystemLengthException("e");
			}
			s = "";
			i = 0;
			while (i < line.length) {   // i realized last second that i was supposed to only apply rules on the initial line, instead of applying rules on the modified line
				if (line[i] == rule.getMatch()) {
					char[] body = rule.getBody();
					if (body.length > 0) {
						s += body[0];
					}
					if (body.length == 2) {
						s += body[1];
					}
				}
				else {
					s += line[i];
				}
				i++;
			}
			line = s.toCharArray();
		}
	}
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
