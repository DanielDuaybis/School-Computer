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
		private static Car[] kmobs = new KrabbyMobile[18];
		
		// for (int i = 0; i < 3; i++) 
		// {
			// kmobs[i] = new KrabbyMobile(Canvas.rand(10000),350,.15);
			// kmobs[i].fill();
		// }
	
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
			
			while(true)
			{
				kmob1.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob2.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob3.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob4.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob5.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob6.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob7.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob8.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob9.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob10.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob11.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob12.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob13.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob14.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob15.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob16.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob17.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				kmob18.translate(3,0);
				Canvas.pause(Canvas.rand(1));
				if(kmob1.getX()>1400)
				{
					kmob1.translate(-1450,0);
				}
				if(kmob2.getX()>1400)
				{
					kmob2.translate(-1450,0);
				}
				if(kmob3.getX()>1400)
				{
					kmob3.translate(-1450,0);
				}
				if(kmob4.getX()>1400)
				{
					kmob4.translate(-1450,0);
				}
				if(kmob5.getX()>1400)
				{
					kmob5.translate(-1450,0);
				}
				if(kmob6.getX()>1400)
				{
					kmob6.translate(-1450,0);
				}
				if(kmob7.getX()>1400)
				{
					kmob7.translate(-1450,0);
				}
				if(kmob8.getX()>1400)
				{
					kmob8.translate(-1450,0);
				}
				if(kmob9.getX()>1400)
				{
					kmob9.translate(-1450,0);
				}
				if(kmob10.getX()>1400)
				{
					kmob10.translate(-1450,0);
				}
				if(kmob11.getX()>1400)
				{
					kmob11.translate(-1450,0);
				}
				if(kmob12.getX()>1400)
				{
					kmob12.translate(-1450,0);
				}
				if(kmob13.getX()>1400)
				{
					kmob13.translate(-1450,0);
				}
				if(kmob14.getX()>1400)
				{
					kmob14.translate(-1450,0);
				}
				if(kmob15.getX()>1400)
				{
					kmob15.translate(-1450,0);
				}
				if(kmob16.getX()>1400)
				{
					kmob16.translate(-1450,0);
				}
				if(kmob17.getX()>1400)
				{
					kmob17.translate(-1450,0);
				}
				if(kmob18.getX()>1400)
				{
					kmob18.translate(-1450,0);
				}
				if(character.getY()<=0)
				{
					Text cool = new Text(550,300,"YAY");
					cool.grow(500,500);
					cool.setColor(Color.CYAN);
					cool.draw();
					break;
				}
				if(character.crash(kmob1))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob2))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob3))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob4))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob5))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob6))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob7))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob8))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob9))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob10))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob11))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob12))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob13))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob14))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob15))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob16))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob17))
				{
					crash.draw();
					break;
				}
				if(character.crash(kmob18))
				{
					crash.draw();
					break;
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
