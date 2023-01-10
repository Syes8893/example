import java.util.UUID;

public class Selection {

	private UUID uuid;
	private int x1,x2,z1,z2;

	public Selection(UUID uuid, int x1, int x2, int z1, int z2){
		this.uuid = uuid;
		this.x1 = x1;
		this.x2 = x2;
		this.z1 = z1;
		this.z2 = z2;
	}

}
