import pkg.*;

public class starter implements InputKeyControl {
		
		static EasyReader guessinput;
		static int num = (Canvas.rand(11));
		static int guess;
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			System.out.println("I am thinking of a number between 0 and 10");
			while(true)
			{
				System.out.print("Please enter your guess:      ");
				EasyReader guessinput = new EasyReader();
				guess = guessinput.readInt();
				if(num==guess)
				{
					System.out.print("Congratulations! The number was " + num + "!");
					break;
				}
			}
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
