import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Rectangle[] recs = new Rectangle[Canvas.rand(20)];
		static int redvalue, greenvalue, bluevalue;
		static int val3, val4;

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			Rectangle erase = new Rectangle(x,y,1,1);
			if(recs.contains(erase))
			{
				recs.translate(10000,1000000);
			}
		}
		public void keyPress(String r)
		{
			// temp holds the enter character
			int counter = 0;
			
			while(counter<5)
			{				
				val3 = Canvas.rand(1400);
				val4 = Canvas.rand(700);
				
				redvalue = Canvas.rand(256);
				greenvalue = Canvas.rand(256);
				bluevalue = Canvas.rand(256);
				
				Color randcol = new Color(redvalue,greenvalue,bluevalue);
				
				recs[counter] = new Rectangle(val3,val4,50,50);
				recs[counter].fill();
				recs[counter].setColor(randcol);
				counter = counter + 1;
			}
			
		}
}
