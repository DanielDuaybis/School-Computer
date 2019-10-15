import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Rectangle[] recs = new Recangle[Canvas.rand(100)]

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			while(counter<recs.length)
			{
				if(recs[i].getX90 <= x)
				{
					if(x <=
				}
			}
		}
		
		public void keyPress(String r)
		{
			// temp holds the enter character
			int counter = 0;
			
			while(counter<Canvas.rand(25))
			{
				int redvalue, greenvalue, bluevalue;
				int val3, val4;
				
				val3 = Canvas.rand(1400);
				val4 = Canvas.rand(700);
				
				redvalue = Canvas.rand(256);
				greenvalue = Canvas.rand(256);
				bluevalue = Canvas.rand(256);
				
				Color randcol = new Color(redvalue,greenvalue,bluevalue);
				
				Rectangle r1 = new Rectangle(val3,val4,50,50);
				r1.fill();
				r1.setColor(randcol);
				counter = counter + 1;
			}
			
		}
}
