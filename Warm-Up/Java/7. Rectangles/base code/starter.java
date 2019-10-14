import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String r)
		{
			// temp holds the enter character
			int counter = 0;
			while(counter<20)
			{
				int redvalue, greenvalue, bluevalue;
				int val3, val4;
				val3 = Canvas.rand(1401);
				val4 = Canvas.rand(700);
				redvalue = Canvas.rand(256);
				greenvalue = Canvas.rand(256);
				bluevalue = Canvas.rand(256);
				Color randcol = new Color(redvalue,greenvalue,bluevalue);
				Rectangle r1 = new Rectangle(100,50,val3,val4);
				r1.draw();
				r1.setColor(randcol);
				counter = counter + 1;
			}
			
		}
}
