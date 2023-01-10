import java.util.UUID;

public class OtherClass {

	public void updateSelection(UUID uuid){
		HelloWorld.selections.put(uuid, new Selection(uuid, 0, 0, 15, 15));
	}

}
