package parser;

public class Rule11 {
    Rule12 r12;
    Rule14 r14;
    Rule17 r17;
    Rule13 r13;
    Rule18 r18;
    public Rule11(Rule12 r12, Rule14 r14, Rule17 r17, Rule13 r13, Rule18 r18)
    {
        this.r12 = r12;
        this.r14 = r14;
        this.r17 = r17;
        this.r13 = r13;
        this.r18 = r18;
    }
    public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 11-------------");
		System.out.println("stmt");
                r12.printNode();
                r14.printNode();
                r17.printNode();
                r13.printNode();
                r18.printNode();
		System.out.println("--------------------");
	}
}
