import pkg.*;

public class starter implements InputKeyControl {
		static EasyReader nameinput;
		static EasyReader numinput;
		static String name;
		static int num;
		static int repeat;
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			System.out.println("What is the word that should be outputted?      ");
			EasyReader nameinput = new EasyReader();
			name = nameinput.readWord();
			System.out.println("How many times should " + name + " be repeated?      ");
			EasyReader numinput = new EasyReader();
			num = numinput.readInt();
			repeat = 0;
			while(true)
			{
				System.out.println(name);
				if(repeat==num)
				{
					break;
				}
				repeat = repeat + 1;
			}
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
