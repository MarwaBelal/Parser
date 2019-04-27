package parser;

public class Rule10 implements Node{
    
    Rule11 r11;
    Rule10 r10;
    int x = 0;
    public Rule10(Rule10 r10, Rule11 r11)
    {
        this.r10 = r10;
        this.r11 = r11;
    }
    public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 10-------------");
		System.out.println("stmt_list");
                r10.printNode();
                r11.printNode();
                System.out.println(x);
		System.out.println("--------------------");
	}
    
}
