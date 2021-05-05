package gameCenter;

public class Game implements Entity{
	private int id;
	private String gameName;
	private int price;
	private String description;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, int price, String description) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

}
