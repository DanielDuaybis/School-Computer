import pkg.*;

public class starter implements InputKeyControl {
		
		static int number = (Canvas.rand(11));
		static EasyReader input;
		static int input2;
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			System.out.println("I am thinking of a number greater than or equal to 0, and less than or equal to 10");
			//CHEAT CHEAT LINE: System.out.println("I am thinking of " + number);
			System.out.print("What number is it?      ");
			EasyReader input = new EasyReader();
			input2 = input.readInt();
			if(number==(input2))
			{
				System.out.println("Congratulations, You guessed the right number!");
			}
			else
			{
				System.out.println("You got the number wrong, the number I was thinking of was " + number);
			}
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
