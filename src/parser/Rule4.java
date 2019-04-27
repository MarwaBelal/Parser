package parser;

//X -> decl x | E
public class Rule4 implements Node{
    Rule3 d;
	//Rule4 x;
        
	public Rule4(Rule3 d){
		//this.x = x;
        this.d = d;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 4-------------");
		System.out.println("decl");
        d.printNode();
                //System.out.println("X");
                //x.printNode();
		System.out.println("--------------------");
	}
	
}
