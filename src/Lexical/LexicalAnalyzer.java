package Lexical;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalyzer {
	public static String readFromFile(String fileName)
	{
		
		String line ="";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
		     line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    line = sb.toString();
		    
		    br.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		return line;
	}	public  Queue<Token>lexical(String fileName){
		Queue<Token> qTokenss = new LinkedList<Token>();
		String line = readFromFile(fileName);//"5+ 6+7*10";
		String [] subLine = line.split("\\b");
		Vector<Token> tokens = new Vector<Token>(subLine.length);
		ArrayList<Pair> REs = Token.getListofTokens();
		Pattern p ;
		Matcher r;
		for (int i = 0; i < subLine.length; i++) {
			for (Pair re : REs) {
				p = Pattern.compile(re.RE);
				r = p.matcher(subLine[i]);
				
				if(r.find()){
					Token ff = new Token(re.index, subLine[i]);
					tokens.add(i,ff);
					break;
				}
				
			}
		}
		

		qTokenss.addAll(tokens);

		return qTokenss; 
	}
	public static void main(String[] args) {
		Queue<Token> xx = new LexicalAnalyzer().lexical("C:\\Users\\Mariam\\Documents\\GitHub\\mini-C-compiler\\phase 1\\outputt.txt");
		for (Token token : xx) {
			System.out.println(token);
		}
		
	}
}
