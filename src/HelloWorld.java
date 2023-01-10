import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class HelloWorld {

	public static HashMap<UUID, Selection> selections = new HashMap<>();

	public static void main (String[] args){
		UUID uuid = UUID.randomUUID();
		Selection selection = new Selection(uuid, 0, 0, 10, 10);
		selections.put(uuid, selection);
	}

}
