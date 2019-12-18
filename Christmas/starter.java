import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Picture snow = new Picture("Background.jpg");
		static Picture santa = new Picture("Sleigh.png");
		static Picture tree1 = new Picture("Tree.png");
		static Picture tree2 = new Picture("Tree.png");
		static Picture tree3 = new Picture("Tree.png");
		static Text phrase = new Text(santa.getX() + 50,50,"Hello!");
		static int tran = 2;
		static String saying;
		int num;

        public static void main(String args[])
        {
			System.out.println("MERRY CHRISTMAS!");
			System.out.println("Press 'p' to make Santa say a phrase!");
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
//CREATING OBJECTS

			snow.draw();
			snow.grow(1000,500);
			santa.draw();
			santa.grow(-600,-300);
			santa.translate(-500,-300);
			tree1.draw();
			tree2.draw();
			tree3.draw();
			tree1.grow(-600,-800);
			tree2.grow(-600,-800);
			tree3.grow(-600,-800);
			tree1.translate(-500,-500);
			tree2.translate(-100,-500);
			tree3.translate(300,-500);
			
//MOVING OBJECTS
			
			while(true)
			{
				santa.translate(2,0);
				phrase.translate(2,0);
				tree1.translate(tran,0);
				tree2.translate(tran,0);
				tree3.translate(tran,0);
				Canvas.pause(5);
				if(santa.getX() > 1500)
				{
					santa.translate(-3500,0);
				}
				if(santa.getX() + 50 > 1500)
				{
					phrase.translate(-3500,0);
				}
				if(tree1.getX() > 280)
				{
					tran = tran * -1;
				}
				if(tree1.getX() < 0)
				{
					tran = tran * -1;
				}
			}
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String p)
		{
			phrase.translate(0,-2000);
			num = Canvas.rand(6);
			if(num == 0)
			{
				saying = "Ho! Ho! Ho!";
			}
			if(num == 1)
			{
				saying = "Merry Christmas!";
			}
			if(num == 2)
			{
				saying = "You get coal!";
			}
			if(num == 3)
			{
				saying = "You've been goo this year!";
			}
			if(num == 4)
			{
				saying = "I want cookies!";
			}
			if(num == 5)
			{
				saying = "Feliz Navidad!";
			}
			phrase = new Text(santa.getX() + 300,40,saying);
			phrase.grow(50,50);
			phrase.setColor(Color.RED);
			phrase.draw();
		}
}
