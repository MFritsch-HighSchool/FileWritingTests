import javax.swing.*;

import java.io.*;
import java.util.*;
public class FileWrites {

	public static void main(String[] args) {
		new FileWrites().start();

	}
	HsScanner h = new HsScanner();
	private void start() {
		h.printHighScores();
		try{
			File he = new File("HighScores/HS.txt");
			FileWriter n = new FileWriter(he);
			File ho = new File("HighScores/HSNames.txt");
			FileWriter s = new FileWriter(ho);
			//if(when I compare the integers to the time in minesweeper, mine is smaller)
			//then I want you to reset the integers, and also the strings for names!
			//done!
			
			
		}
		catch(IOException l){
			System.out.println(l.getMessage());
		}
	}

}
