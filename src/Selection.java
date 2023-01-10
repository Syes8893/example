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

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getZ1() {
		return z1;
	}

	public void setZ1(int z1) {
		this.z1 = z1;
	}

	public int getZ2() {
		return z2;
	}

	public void setZ2(int z2) {
		this.z2 = z2;
	}
}
