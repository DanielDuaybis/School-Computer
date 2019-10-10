import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Text t;
		static int counter = 0;
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			System.out.print("Please type a word:  ");
			EasyReader input = new EasyReader();
			String word = input.readWord();
			t = new Text(250,230,word);
			t.draw();
			while(true)
			{
				t.grow(1,1);
				Canvas.pause(20);
				Canvas.snapshot();
				if(counter==0)
				{
					t.setColor(Color.BLUE);
					t.setText("WOW");
				}
				if(counter==1)
				{
					t.setColor(Color.RED);
				}
				if(counter==2)
				{
					t.setColor(Color.GREEN);
					t.setText(word);
				}
				if(counter==3)
				{
					t.setColor(Color.YELLOW);
				}
				if(counter==4)
				{
					t.setColor(Color.PINK);
				}
				counter = counter + 1;
				if(counter>4)
				{
					counter = counter - 5;
				}
				
			}
		}
		
		public void onMouseClick(double x, double y)
		{
			// and/or here

		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
