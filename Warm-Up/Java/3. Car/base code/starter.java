import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Ellipse c;
		static Ellipse w1;
		static Ellipse w2;
		static int Clicks = 0;
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			c = new Ellipse(20,20,180,80);
			w1 = new Ellipse(30,60,60,60);
			w2 = new Ellipse(130,60,60,60);
			c.setColor(Color.BLUE);
			c.fill();
			w1.fill();
			w2.fill();
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			if(Clicks%2==0)
			{
				c.setColor(Color.RED);
			}
			if(Clicks%2==1)
			{
				c.setColor(Color.BLUE);
			}
			c.translate(5,0);
			w1.translate(5,0);
			w2.translate(5,0);
			Clicks = (Clicks+1);
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
