package parser;

public class Rule15 {
    Rule15 r15;
    Rule16 r16;
    int x = 0;
    public Rule15(Rule15 r15, Rule16 r16)
    {
        this.r15 = r15;
        this.r16 = r16;
    }
    public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 15-------------");
		System.out.println("local_decls");
                r15.printNode();
                r16.printNode();
                System.out.println(x);
		System.out.println("--------------------");
	}
}
