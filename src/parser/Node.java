package parser;

public interface Node {
	public void printNode();

}
/*
public class Node {
    int value;
    Node left;
    Node right;
    
    Node(int value){
        this.value = value;
        right = null;
        left = null;
        
    }
    
    public void print(Node n){
        if(n != null){
            print(n.left);
            System.out.println("" + n.value);
            print(n.right);
        }
    }
    
}*/

