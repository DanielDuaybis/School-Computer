import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Emoji character;
		static Text t = new Text(600,300,"CONGRATULATIONS");
		private static Car kmob1;
		private static Car kmob2;
		private static Car kmob3;
		private static Car kmob4;
		private static Car kmob5;
		private static Car kmob6;
		private static Car kmob7;
		private static Car kmob8;
		private static Car kmob9;
		private static Car kmob10;
		private static Car kmob11;
		private static Car kmob12;
		private static Car kmob13;
		private static Car kmob14;
		private static Car kmob15;
		private static Car kmob16;
		private static Car kmob17;
		private static Car kmob18;
	
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Rectangle roads = new Rectangle(0,0,1400,700);
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
			character = new Emoji(675,650,50,50);
			character.fill();
			kmob1 = new KrabbyMobile(Canvas.rand(10000),350,.15);
			kmob1.fill();
			kmob2 = new KrabbyMobile(Canvas.rand(10000),350,.15);
			kmob2.fill();
			kmob3 = new KrabbyMobile(Canvas.rand(10000),350,.15);
			kmob3.fill();
			kmob4 = new KrabbyMobile(Canvas.rand(10000),1000,.15);
			kmob4.fill();
			kmob5 = new KrabbyMobile(Canvas.rand(10000),1000,.15);
			kmob5.fill();
			kmob6 = new KrabbyMobile(Canvas.rand(10000),1000,.15);
			kmob6.fill();
			kmob7 = new KrabbyMobile(Canvas.rand(10000),1700,.15);
			kmob7.fill();
			kmob8 = new KrabbyMobile(Canvas.rand(10000),1700,.15);
			kmob8.fill();
			kmob9 = new KrabbyMobile(Canvas.rand(10000),1700,.15);
			kmob9.fill();
			kmob10 = new KrabbyMobile(Canvas.rand(10000),2350,.15);
			kmob10.fill();
			kmob11 = new KrabbyMobile(Canvas.rand(10000),2350,.15);
			kmob11.fill();
			kmob12 = new KrabbyMobile(Canvas.rand(10000),2350,.15);
			kmob12.fill();
			kmob13 = new KrabbyMobile(Canvas.rand(10000),3000,.15);
			kmob13.fill();
			kmob14 = new KrabbyMobile(Canvas.rand(10000),3000,.15);
			kmob14.fill();
			kmob15 = new KrabbyMobile(Canvas.rand(10000),3000,.15);
			kmob15.fill();
			kmob16 = new KrabbyMobile(Canvas.rand(10000),3700,.15);
			kmob16.fill();
			kmob17 = new KrabbyMobile(Canvas.rand(10000),3700,.15);
			kmob17.fill();
			kmob18 = new KrabbyMobile(Canvas.rand(10000),3700,.15);
			kmob18.fill();
			while(character.crash())
			{
				
			}
			
			
				
			while(true)
			{
				if(character.getY==0)
				{
					break;
					while(true)
					{
						t.draw();
						t.grow(1,1);
						Canvas.pause(20);
						int redvalue = Canvas.rand(256);
						int greenvalue = Canvas.rand(256);
						int bluevalue = Canvas.rand(256);
						Color col = new Color(redvalue,greenvalue,bluevalue);
						t.setColor(col);
					}
				}
			}
			
		}
		
		public void onMouseClick(double x, double y)
		{
				
		}
		
		public void keyPress(String key)
		{
			if(key.equals("w"))
			{
				character.translate(0,-5);
			}				
			if(key.equals("a"))
			{
				character.translate(-5,0);
			}		
			if(key.equals("s"))
			{
				character.translate(0,5);
			}		
			if(key.equals("d"))
			{
				character.translate(5,0);
			}	
			
			
		}
}
