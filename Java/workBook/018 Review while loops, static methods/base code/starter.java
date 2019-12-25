import pkg.*;

public class starter implements InputKeyControl {
		
		static Rectangle r;
		static int msecs = Canvas.rand(50);
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			//KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			r = new Rectangle(10,10,100,100);
			r.setColor(Color.CYAN);
			r.fill();
			while(true)
			{
				r.translate(2,0);
				Canvas.pause(msecs);
			}
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
