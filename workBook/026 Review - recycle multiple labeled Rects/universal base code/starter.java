import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			int y1 = Canvas.rand(1000);
			int y2 = Canvas.rand(1000);
			int y3 = Canvas.rand(1000);
			Rectangle r1 = new Rectangle(0,y1,0,y1);
			Rectangle r2 = new Rectangle(0,y2,0,y2);
			Rectangle r3 = new Rectangle(0,y3,0,y3);
			Text t1 = new Text(0,y1+30,"WEEEE");
			Text t2 = new Text(0,y2+30,"WEEEE");
			Text t3 = new Text(0,y3+30,"WEEEE");
			r1.setColor(Color.BLUE);
			r2.setColor(Color.RED);
			r3.setColor(Color.GREEN);
			r1.fill();
			r2.fill();
			r3.fill();
			t1.draw();
			t2.draw();
			t3.draw();
			while(true)
			{
				r1.translate(5,0);
				r2.translate(5,0);
				r3.translate(5,0);
				t1.translate(5,0);
				t2.translate(5,0);
				t3.translate(5,0);
				Canvas.pause(50);
				if(r1.getX==550)
				{
					r1.translate(-550,0);
					r2.translate(-550,0);
					r3.translate(-550,0);
					t1.translate(-550,0);
					t2.translate(-550,0);
					t3.translate(-550,0);
				}
			}
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
