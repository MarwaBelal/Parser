package parser;

import Lexical.Token;
//var_decl -> type_sper  IDENT;
public class Rule5 implements Node{
        Rule6 d;
	Token x;
	public Rule5(Rule6 d, Token x){
		this.x = x;
                this.d = d;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 5-------------");
		System.out.println("var_decl");
                //d.
                System.out.println(x.value);
		System.out.println("--------------------");
	}
}
