import pkg.*;

public class starter implements InputKeyControl {
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			Rectangle rec = new Rectangle(10,10,100,50);
			rec.fill();
			Text tex = new Text(50,25,"Daniel");
			tex.setColor(Color.CYAN);
			tex.draw();
			tex.grow(20,20);
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
