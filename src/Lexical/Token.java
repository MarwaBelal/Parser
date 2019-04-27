package Lexical;

import java.util.ArrayList;


public class Token {
	public static final int PLUS = 0;
	public static final int TIMES = 1;
	public static final int DIGIT = 2;
	
	public static final String RE_PLUS = "\\+";
	public static final String RE_TIMES = "\\*";
	public static final String RE_DIGIT = "\\d";
	

	public final int myType;
	public final String RE;
	public String value;
	public String tokenName;
	
	public Token() {
		// TODO Auto-generated constructor stub
		myType = -99;
		this.RE = "";
		tokenName = value="";
		
	}
	
	public Token(int type) {
		// TODO Auto-generated constructor stub
		myType = type;
		this.RE = getRE(type);
		tokenName = value=getName();
		
		
	}
	
	private String getName() {
		// TODO Auto-generated method stub
		switch (myType) {
		case PLUS:
			return "PLUS";
		case TIMES:
			return "TIMES";
		case DIGIT:
			return "DIGIT";
		default:
			break;
		}
		return null;
	}

	public Token(int type, String value) {
		// TODO Auto-generated constructor stub
		myType = type;
		this.RE = getRE(type);
		this.value=value;
		tokenName = getName();
		
	}

	public Token(String strCOUT) {
		// TODO Auto-generated constructor stub
		//"< "+ token+ " > : -" +value+"-"
		tokenName = strCOUT.split("> ")[0].substring(2).trim();
		myType = getType();
		this.RE = getRE(myType);
		this.value=strCOUT.split("-")[1];
		
		
	}

	private String getRE(int myType2) {
		// TODO Auto-generated method stub
		
		switch (myType2) {
		case PLUS:
			return RE_PLUS;
		case TIMES:
			return RE_TIMES;
		case DIGIT:
			return RE_DIGIT;
		default:
			
			return "ERROR";
		}
		
	}

	private int getType() {
		// TODO Auto-generated method stub
		int t=-999;
		switch(tokenName)
		{
		case "DIGIT" :
			t =  DIGIT ;
			
			break;
		case "PLUS" :
			t =  PLUS ;
			break;
		case "TIMES" :
			t =  TIMES ;
			break;

		default:
			t = -999;
			break;
		}
		return t;
	}


	public static ArrayList<Pair> getListofTokens()
	{
		ArrayList<Pair> list = new ArrayList<Pair>();
	    list.add( new Pair( PLUS     ,RE_PLUS     ) );
	    list.add( new Pair( TIMES     ,RE_TIMES     ) );
	    list.add( new Pair( DIGIT       ,RE_DIGIT      ) );
	    
	    return list;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "< "+ tokenName+ " > : -" +value+"-" ;
	}
}
