package parser;
import Lexical.Token;

public class Rule7 implements Node{
    Rule8 d;
	Token x;
	public Rule7(Rule8 d, Token x){
		this.x = x;
        this.d = d;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 7-------------");
		System.out.println("Params");
                //d.
                System.out.println(x.value);

                System.out.println("--------------------");
	}
}

