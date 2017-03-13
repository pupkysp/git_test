import java.util.Scanner;

public class Input {

	public String input() {
		    Scanner reader = new Scanner(System.in);
			System.out.print("Type your name: ");
			String value = reader.nextLine();
			reader.close();
			return value;
		}
}