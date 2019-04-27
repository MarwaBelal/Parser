package parser;

public class Rule8 implements Node{
    
    Rule9 r1;
    Rule8 r2;
	
	public Rule8(Rule9 rl, Rule8 r2)
	{
        this.r2 = r2;
		this.r1 = rl;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 8-------------");
		System.out.println("param_list");
                r2.printNode();
                r1.printNode();
                System.out.println("--------------------");
	}
}
