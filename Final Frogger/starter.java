import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Emoji character;
		static Text t = new Text(600,300,"CONGRATULATIONS");
	
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
			KrabbyMobile car1 = new KrabbyMobile(0,50,50);
			car1.fill();
			
			
		
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
			if(character.getY()==0)
			{
				t.draw();
				while(character.getY()==0)
				{
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
