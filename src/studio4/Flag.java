package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//Canvas Size
		StdDraw.setCanvasSize(4000,700);

		//Draw Stripe
		double stripeNum = 1;
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);

		//Draw Stripe
		stripeNum+=4;
		StdDraw.setPenColor(255, 69, 0);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);

		//Draw Stripe
		stripeNum+=4;
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);

		//Draw Stripe
		stripeNum+=4;
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);
		
		//Draw Stripe
		stripeNum+=4;
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);

		//Draw Stripe
		stripeNum+=4;
		StdDraw.setPenColor(128, 0, 255);
		StdDraw.filledRectangle(0, 1.0-stripeNum/22, 1, 1.0/22);

		//Draw Rectangle
		StdDraw.picture(0.5, 0.5, "C:\\Users\\there\\OneDrive\\Documents\\CSE1301\\studio-4-rothschildaverbach-paster-khai-lin\\src\\studio4\\Washington_University_Seal.png", .1, .5);
	}
}