//Seth Torralba
//Mosaic Tile Class

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;



public class MosaicTile extends JPanel {
	private int red;
	private int green;
	private int blue;
	private String letter;
	
	
	public MosaicTile() {
		super();
	}
	
	public final void SetRandom() {
		red = GetNumbersBetween(0,255);
		green = GetNumbersBetween(0,255);
		blue = GetNumbersBetween(0,255);
		
		//Use a Case system for letter randomization 
	}
	
	//Helper Function
	private static int GetNumbersBetween(int min, int max) {
		Random myRandom = new Random();
		return min+ myRandom.nextInt(max-min+1);
	}
	
	private static int GetContrastColor(int colorIN) {
		return((colorIN+128)%256);
	}

}
