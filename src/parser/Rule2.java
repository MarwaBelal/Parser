package parser;
//decl_list -> decl X
public class Rule2 implements Node{
	
	Rule3 d;
	Rule4 x;
	
	public Rule2(Rule3 d , Rule4 x)
	{
		this.d = d;
		this.x = x;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 2-------------");
		System.out.println("decl_list");
                d.printNode();
                x.printNode() ; 
		System.out.println("--------------------");
	}

	
}
