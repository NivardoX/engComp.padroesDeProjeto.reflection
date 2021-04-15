public class UFOEnemyShip extends EnemyShip{
	
	private String idCode = "100";
	
	private String getPrivate() { return "How did you get this"; }
	
	private String getOtherPrivate(int thisInt, String thatString){
		
		return "How did you get here " + thisInt + " " + thatString;
		
	}
	
	public UFOEnemyShip(int number, String randString){
		
		System.out.println("You sent: " + number + " " + randString);
		
	}

	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		
		this.shipFactory = shipFactory;
		
	}

	void makeShip() {
		
		System.out.println("Making enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
		
	}
	
}