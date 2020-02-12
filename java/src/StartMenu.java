package adventure;

import processing.core.PApplet;
import processing.core.PFont;
import java.io.*;

public class StartMenu extends PApplet{
	PrintWriter output;
	BufferedReader read;
	String[] profile;
	PFont font;
	
	private float side_margin, height_margin;
	private int ng = 0;
	private boolean nosave = false;
	
	public void settings(){
		size(900, 600);
	}
	
	public void setup(){
		colorMode(HSB, 100);
		font = loadFont("menu_font.vlw");
		textFont(font, 60);
		try{
			output = new PrintWriter(new BufferedWriter(new FileWriter("bin/data/save.txt", true)));;
		}catch(IOException e){
			System.out.println("file");
		}
		
		try{
			profile = loadStrings("bin/data/save.txt");
		}catch(Exception e){
			text("this error", 100, 200);
		}
		read = createReader("bin/data/save.txt");
	}
	
	public void draw(){
		if(ng == 0){
		background(0);
		fill(0, 0, 100);
		
		rect(250, 200, 400, 50);
		rect(250, 300, 400, 50);
		rect(250, 400, 400, 50);
		fill(0);
		text(Boolean.toString(nosave), 400, 100);
		text("New Game", 300, 250);
		
		text("Load Game", 300, 350);
		
		text("Exit", 300, 450);
		fill(0, 0, 100);
		
		}else if(ng == 1){
			newGame();
			
		}else {
			load();
		}
		
		if(nosave){
			text("No save, please start new game.", 220, 150);
		}
	}
	
	public void mousePressed(){
		float x = mouseX;
		float y = mouseY;
		
		if( (x >= 250 && x <= 650) && (y >= 200 && y <= 250) ){
			ng = 1;
		}
		
		if( (x >= 250 && x <= 650) && (y >= 300 && y <= 350) ){
			ng = 2;
		}
		
		if( (x >= 250 && x <= 650) && (y >= 400 && y <= 450) ){
			exit();
		}
	}
	
	public void newGame(){
		background(0);
		fill(0, 0, 100);
		
		rect(250, 200, 400, 50);
		fill(0);
		
		text("New Game", 300, 250);
		output.println("new game!");
			output.close();
	}
	
	public void load(){
		
		if(profile.length != 0){
			for(int i = 0; i < profile.length; i++){
				text(profile[i], 300, 300);
			}
		}else{
			
			nosave = true;
			ng = 0;
			
		}
	}
}