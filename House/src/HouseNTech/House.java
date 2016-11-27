package HouseNTech;

public class House {

	public int address;
	public String houseName;
	
	public House(int address, String houseName){
		
		this.address = address;
		this.houseName = houseName;
	}
	
	public void watchMovie(){
		
		System.out.println("Watching Pirates of Carribean");
	}
	public void goToSleep(){
		
		System.out.println("People sleeps at bed room");
	}
	public void cookDinner(){
		
		System.out.println("Cooking chicken with broccoli");
	}
	public int houseArea(int length, int height){
		return length*height;
	}
	
	public String houseName(){
		
		return houseName;
	}
	public int address(){
		
		return address;
	}
	
}
