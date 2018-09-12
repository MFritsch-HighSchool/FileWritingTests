import javax.swing.*;
import java.io.*;
import java.util.*;
public class HsScanner {
	public HsScanner(){
		
	}
		public static void printHighScores() {
			// TODO Auto-generated method stub
			Scanner ins;
			Scanner inn;
			File f = null;
		try{
			//ins = new Scanner(new File("HighScores/HSNames.txt"));
			f = new File("HighScores/HS.txt");
			inn = new Scanner(f);
			while(inn.hasNextLine())
				System.out.println(inn.nextLine());
			inn = new Scanner(f);
			int HS1 = inn.nextInt();
			int HS2 = inn.nextInt();
			int HS3 = inn.nextInt();
			int HS4 = inn.nextInt();
			int HS5 = inn.nextInt();
			
		}
		catch(IOException l){
			System.out.println(l.getMessage());
		}
		catch(java.util.NoSuchElementException e){
			System.out.println(e.getMessage());
		}
	}
}