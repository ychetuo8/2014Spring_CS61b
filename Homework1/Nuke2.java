import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuke2 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String firstPart=str.substring(0,1);
		int length=str.length();
		String seconPart=str.substring(2, length);
		
		System.out.println(firstPart+seconPart);
	}
}
