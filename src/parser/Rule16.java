package parser;

import Lexical.Token;

public class Rule16 {
    Rule6 r6;
	Token x;
	public Rule16(Rule6 r6, Token x){
		this.x = x;
        this.r6 = r6;
	}
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 16-------------");
		System.out.println("local_decl");
                r6.printNode();
                System.out.println(x.value);
		System.out.println("--------------------");
	}
}
