import pkg.*;

public class starter implements InputControl {
		static Rectangle r;
		static int a = 0;

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			r = new Rectangle(10,20,400,400);
			r.setColor(Color.BLUE);
			r.fill();
		
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
			if(a<10) {
				r.translate(5,0);
				a = a + 1;
			}
	
		}
}
