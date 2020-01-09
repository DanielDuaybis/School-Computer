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
		public void keyPress(String d)
		{
			// enter code here
			// note, s is the String representation of the key pressed
			r.translate(5,0);
		}

}
