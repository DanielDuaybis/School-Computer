import pkg.*;

public class starter implements InputKeyControl {
		
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			System.out.println("To generate a random number, please click once inside the canvas, then press R repeatedly");
			
		}
		public void keyPress(String r)
		{
			// enter code here
			System.out.println(Canvas.rand(10));
		}

}
