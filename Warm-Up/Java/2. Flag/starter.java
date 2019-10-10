import pkg.*;

public class starter implements InputControl {

	

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			Rectangle r = new Rectangle(100,20,400,200);
			r.draw();
			
			Ellipse e = new Ellipse(250,75,100,100);
			e.setColor(Color.RED);
			e.fill();
			
			Rectangle d = new Rectangle(90,20,10,2000);
			d.setColor(Color.BLACK);
			d.fill();
		}


		public void onMouseClick(double x, double y){
			// and/or here
			
	
		}
}
