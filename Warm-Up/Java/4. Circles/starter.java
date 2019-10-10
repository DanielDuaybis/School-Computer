import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static int xx = 0;
		static int yy = 0;
		static Color c;
		
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			c = Color.BLACK;
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			Ellipse e = new Ellipse(xx,yy,50,50);
			e.setColor(c);
			e.fill();
			xx = xx + 50;
			if(xx%11==0)
			{
				xx = xx - 550;
				yy = yy + 50;
			}
			
		}
		
		public void keyPress(String key)
		{
			// temp holds the enter character
			if(key.equals("b"))
			{
				c = Color.BLUE;
			}		
			else if(key.equals("r"))
			{
				c = Color.RED;
			}
			else if(key.equals("g"))
			{
				c = Color.GREEN;
			}
			else if(key.equals("p"))
			{
				c = Color.PINK;
			}
			else if(key.equals("o"))
			{
				c = Color.ORANGE;
			}
			else if(key.equals("c"))
			{
				c = Color.CYAN;
			}
			else if(key.equals("y"))
			{
				c = Color.YELLOW;
			}
			else
			{
				c = Color.BLACK;
			}
		}
}
