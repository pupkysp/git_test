/**
 * @author zwaclaw
 *
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
	public static void main(String[] args) {
		Input i = new Input();
		System.out.println("HELLO UGLY WORLD!");
		System.out.println("The World is not ugly!");
		System.out.println("Hello " + i.input());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}
}
