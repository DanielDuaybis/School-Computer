import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Emoji character;
		static Text t = new Text(600,300,"CONGRATULATIONS");
		// private static Car kmob1;
		// private static Car kmob2;
		// private static Car kmob3;
		// private static Car kmob4;
		// private static Car kmob5;
		// private static Car kmob6;
		// private static Car kmob7;
		// private static Car kmob8;
		// private static Car kmob9;
		// private static Car kmob10;
		// private static Car kmob11;
		// private static Car kmob12;
		// private static Car kmob13;
		// private static Car kmob14;
		// private static Car kmob15;
		// private static Car kmob16;
		// private static Car kmob17;
		// private static Car kmob18;
		private static Car[] kmobs = new KrabbyMobile[18];
	
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Rectangle roads = new Rectangle(0,0,1400,700);
			
		
			Text crash = new Text(550,300,"CRASH");
			crash.setColor(Color.RED);
			crash.grow(500,500);
			roads.setColor(Color.BLACK);
			roads.fill();
			Rectangle land1 = new Rectangle(0,0,1400,50);
			land1.setColor(Color.GREEN);
			land1.fill();
			Rectangle land2 = new Rectangle(0,100,1400,50);
			land2.setColor(Color.GREEN);
			land2.fill();
			Rectangle land3 = new Rectangle(0,200,1400,50);
			land3.setColor(Color.GREEN);
			land3.fill();
			Rectangle land4 = new Rectangle(0,300,1400,50);
			land4.setColor(Color.GREEN);
			land4.fill();
			Rectangle land5 = new Rectangle(0,400,1400,50);
			land5.setColor(Color.GREEN);
			land5.fill();
			Rectangle land6 = new Rectangle(0,500,1400,50);
			land6.setColor(Color.GREEN);
			land6.fill();
			Rectangle land7 = new Rectangle(0,600,1400,100);
			land7.setColor(Color.GREEN);
			land7.fill();
			for(int i = 0; i < 3; i++) 
			{
				kmobs[i] = new KrabbyMobile(Canvas.rand(10000),350,.15);
				kmobs[i].fill();
			}
			for(int i1 = 0; i1 < 3; i1++)
			{
				kmobs[i1] = new KrabbyMobile(Canvas.rand(10000),1050,.150);
				kmobs[i1].fill();
			}
			character = new Emoji(675,650,50,50);
			character.fill();
			
			
		}
		
		public void onMouseClick(double x, double y)
		{
				
		}
		
		public void keyPress(String key)
		{
			if(key.equals("w"))
			{
				character.translate(0,-10);
			}				
			if(key.equals("a"))
			{
				character.translate(-10,0);
			}		
			if(key.equals("s"))
			{
				character.translate(0,10);
			}		
			if(key.equals("d"))
			{
				character.translate(10,0);
			}	
			
			
		}
}
