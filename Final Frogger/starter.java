import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Emoji character;
		static Text t = new Text(600,300,"CONGRATULATIONS");
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
				kmobs[i] = new KrabbyMobile(Canvas.rand(10000),350,.150);
				kmobs[i].fill();
			}
			for(int i1 = 3; i1 < 6; i1++)
			{
				kmobs[i1] = new KrabbyMobile(Canvas.rand(10000),1000,.150);
				kmobs[i1].fill();
			}
			for(int i2 = 6; i2 < 9; i2++)
			{
				kmobs[i2] = new KrabbyMobile(Canvas.rand(10000),1700,.150);
				kmobs[i2].fill();
			}
			for(int i3 = 9; i3 < 12; i3++)
			{
				kmobs[i3] = new KrabbyMobile(Canvas.rand(10000),2350,.150);
				kmobs[i3].fill();
			}
			for(int i4 = 12; i4 < 15; i4++)
			{
				kmobs[i4] = new KrabbyMobile(Canvas.rand(10000),3000,.150);
				kmobs[i4].fill();
			}
			for(int i5 = 15; i5 < 18; i5++)
			{
				kmobs[i5] = new KrabbyMobile(Canvas.rand(10000),3700,.150);
				kmobs[i5].fill();
			}
			character = new Emoji(675,650,50,50);
			character.fill();
			for(int i = 0; i < 18; i++)
			{
				kmobs[i].translate(3,0);
			}
			// while(true)
			// {
				// int counter1 = -1;
				// for (int i = 0; i < kmobs.length; i++)
				// {
					
					
					// if(i % 3 == 0)
					// {
						// counter1 = counter1 + 2;
					// }
					
					// Canvas.pause(counter1);
				// }	 
			// }
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
