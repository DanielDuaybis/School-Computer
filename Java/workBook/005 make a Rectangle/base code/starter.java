import pkg.*;

public class starter implements InputControl {

	

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			Rectangle r = new Rectangle(10, 20, 100, 200);
			r.setColor(Color.BLUE);
			r.fill();
			
			Rectangle a = new Rectangle(-1000,-2000, 200, 100);
			a.draw();
		
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
			
	
		}
}
