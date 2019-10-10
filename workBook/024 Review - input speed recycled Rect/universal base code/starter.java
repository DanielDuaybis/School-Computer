import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Text tex;
		static Rectangle rec;
		static int delay;

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			System.out.print("Please enter delay time:      ");
			EasyReader input = new EasyReader();
			delay = input.readInt();
			rec = new Rectangle(0,0,200,100);
			rec.fill();
			tex = new Text(95,40,"Daniel");
			tex.setColor(Color.CYAN);
			tex.draw();
			tex.grow(50,50);
			while(true)
			{
				rec.translate(5,0);
				tex.translate(5,0);
				Canvas.pause(delay);
				if(rec.getX()==400)
				{
					rec.translate(-400,0);
					tex.translate(-400,0);
				}
			}
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
