package parser;

import java.util.Queue;

import Lexical.LexicalAnalyzer;
import Lexical.Token;

public class Parser {
	Queue<Token> queue;
	public Parser(String fileName) {
		// TODO Auto-generated constructor stub
		queue = getTokens(fileName);
	}
	public  Queue<Token>getTokens(String fileName){
		LexicalAnalyzer la = new LexicalAnalyzer();
		return la.lexical(fileName);
	}
        
	public  Rule1 parse(){
		return program();
	}
	
	private  Rule1 program() {
		// TODO Auto-generated method stub
		Rule2 dl = decl_list();
		
		return new Rule1(dl);
		
	}
	private  Rule2 decl_list() {
		// TODO Auto-generated method stub
		Rule3 d = decl();
                Rule4 x = x();
		return new Rule2(d,x);
	}
	private Rule3 decl() {
		// TODO Auto-generated method stub
            Rule5 d = var_decl();
            return new Rule3(d);
        }
        private Rule4 x() {
		// TODO Auto-generated method stub
            Rule3 d = decl();
            //Rule4 x = x();
            return new Rule4(d);
	}
        private Rule5 var_decl() {
		// TODO Auto-generated method stub
            Token t = queue.peek();
            Rule6 l = type_decl();
            return new Rule5(l,t);
	}
        private Rule6 type_decl() {
		// TODO Auto-generated method stub
            
            return new Rule6();
	}
        
	/*private  Token x() {
            String x = "end";
            return new Rule4(x);
		
	}*/
	public static void main(String[] args) {
		
		Parser p = new Parser("C:\\Users\\LENOVO\\Desktop\\Lab 5 - compiler - small parser\\Lab 6 - compiler - small parser\\src\\testCases\\Lex_test_1.txt");
		Rule1 root = p.parse();
		root.printNode();
	}
}
