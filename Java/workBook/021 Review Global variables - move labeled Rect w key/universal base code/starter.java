import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Text tex;
		static Rectangle rec;

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			rec = new Rectangle(0,0,200,100);
			rec.fill();
			tex = new Text(95,40,"Daniel");
			tex.setColor(Color.CYAN);
			tex.draw();
			tex.grow(50,50);
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			
		}
		
		public void keyPress(String key)
		{
			// temp holds the enter character
			if(key.equals("d"))
			{
				rec.translate(5,0);
				tex.translate(5,0);
			}
			if(key.equals("a"))
			{
				rec.translate(-5,0);
				tex.translate(-5,0);
			}
			if(key.equals("w"))
			{
				rec.translate(0,-5);
				tex.translate(0,-5);
			}
			if(key.equals("s"))
			{
				rec.translate(0,5);
				tex.translate(0,5);
			}
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
