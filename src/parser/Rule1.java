package parser;

import Lexical.Token;
//Program -> declList
public class Rule1 implements Node{
	Rule2 dl;
	
	public Rule1( Rule2 dl)
	{
		this. dl = dl;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 1-------------");
		System.out.println("Rule1 : program ");
                dl.printNode();
		System.out.println("--------------------");
	}

	

}
