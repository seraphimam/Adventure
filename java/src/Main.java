package adventure;

public class Main
{   
	public void start()
    {
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StartMenu());
    }
	
    public static void main(String[] arg)
    {
        Main main = new Main();
		main.start(); 
    }
}