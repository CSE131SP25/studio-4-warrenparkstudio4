package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(102, 178, 255);
		StdDraw.filledRectangle(0.3, 0.35, 0.2, 0.15);
		StdDraw.setPenColor(153, 204, 255);
		StdDraw.filledRectangle(0.7, 0.35, 0.2, 0.15);
		StdDraw.setPenColor(0, 128, 255);
		StdDraw.filledRectangle(0.3, 0.65, 0.2, 0.15);
		StdDraw.setPenColor(51, 153, 255);
		StdDraw.filledRectangle(0.7, 0.65, 0.2, 0.15);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.circle(0.5, 0.5, 0.15);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.3);
	}
}