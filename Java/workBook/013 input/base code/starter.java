import java.util.*;

class starter {
	
		static String name;
        public static void main(String args[])
        {
			// put your code here
			System.out.print("Who's birthday is it?      ");
			EasyReader input = new EasyReader();
			name = input.readWord();
			String linea = ("Happy Birthday, to you.");
			String lineb = ("Happy Birthday dear ");
			System.out.println(linea);
			System.out.println(linea);
			System.out.println(lineb + name);
			System.out.print(linea);
        }
        
}
