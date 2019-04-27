package parser;

import Lexical.Token;
//decl -> var_decl
public class Rule3 implements Node{
        Rule5 d;
	public Rule3(Rule5 d){
                this.d = d;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 3-------------");
		System.out.println("decl");
                d.printNode();
		System.out.println("--------------------");
	}
	
}
