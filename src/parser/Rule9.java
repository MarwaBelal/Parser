package parser;

import Lexical.Token;

public class Rule9 implements Node{
    Rule6 d;
	Token x;
	public Rule9(Rule6 d, Token x){
		this.x = x;
                this.d = d;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 9-------------");
		System.out.println("param");
                d.printNode();
                System.out.println(x.value);
		System.out.println("--------------------");
	}
    
}
