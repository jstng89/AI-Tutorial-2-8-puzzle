import java.util.*;

public class Board {
private char[][] Board;
private char[] LineForm;
public Board(String userInput){
	LineForm = userInput.toCharArray();
}
void SetBoard(){
	for(int i=0;i<9;i++){
		int j=0;
		int k=0;
		if(j<=2){
			Board[j][k]=LineForm[i];
			j++;
		}
		else {
			j=0;
			k++;
			Board[j][k]=LineForm[i];
		}
	}	
}

public static void main(String[] args) {

	Board b1 = new Board("hello1234");
	b1.SetBoard();
    System.out.println(b1.Board[0][0]);
}
String search(){
	 List list = Collections.synchronizedList(new LinkedList());
	 list.add(LineForm);
	 
	 String Iterations = null;
	 return Iterations;
}
}



