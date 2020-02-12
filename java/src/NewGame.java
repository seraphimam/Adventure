package adventure;

import processing.core.PApplet;
import processing.core.PFont;

public class NewGame extends PApplet{
	
	PFont font;
	
	private float side_margin, height_margin;
	
	public NewGame(){
		}
	
	
	public void setup(){
		colorMode(HSB, 100);
		font = loadFont("menu_font.vlw");
		textFont(font, 60);
	}
	
	public void draw(){
		background(0);
		fill(0, 0, 100);
		
		rect(250, 200, 400, 50);
		fill(0);
		
		text("New Game", 300, 250);
		
	}
}
