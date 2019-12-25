import pkg.*;

public class starter implements InputKeyControl {
		static Rectangle r;
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			// enter code here
			r = new Rectangle(50,50,100,100);
			r.setColor(Color.CYAN);
			r.draw();
		}
		public void keyPress(String key)
		{
			// enter code here
			// note, s is the String representation of the key pressed
			if(key.equals("d"))
			{
			r.translate(5,0);	
			}	
			if(key.equals("a"))
			{
			r.translate(-5,0);	
			}
			if(key.equals("s"))
			{
			r.translate(0,5);
			}
			if(key.equals("w"))
			{
			r.translate(0,-5);
			}
		}

		
}
