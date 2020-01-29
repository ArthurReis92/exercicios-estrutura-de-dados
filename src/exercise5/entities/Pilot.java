package exercise5.entities;

public class Pilot {
	private String name;
	private int id;

	public Pilot() {
	}

	public Pilot(String name) {
		super();
		this.name = name;
	}

	public Pilot(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name;
	}

}
