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
				int redvalue = Canvas.rand(256);
				int greenvalue = Canvas.rand(256);
				int bluevalue = Canvas.rand(256);
				Color col = new Color(redvalue,greenvalue,bluevalue);
				t.setColor(col);
				
			}
		}
		
		public void onMouseClick(double x, double y)
		{
			// and/or here

		}
		
		public void keyPress(String key)
		{
			// temp holds the enter character
			if(key.equals(p)
			{
				t.grow(-1,-1);
			}
			if(key.equals(d)
			{
				t.grow(-2,-2);
			}
		}
}
