package parser;

public class Rule14 {
    Rule15 r15;
    Rule16 r16;
    
    public Rule14(Rule15 r15, Rule16 r16)
    {
        this.r15 = r15;
        this.r16 = r16;
    }
    public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 14-------------");
		System.out.println("compound_stmt");
                r15.printNode();
                r16.printNode();
		System.out.println("--------------------");
	}
}
