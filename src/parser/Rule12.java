package parser;

public class Rule12 {
    Rule19 r19;
    
    public Rule12(Rule19 r19)
    {
        this.r19 = r19;
    }
    public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 12-------------");
		System.out.println("expr_stmt");
                r19.printNode();
		System.out.println("--------------------");
	}
}
