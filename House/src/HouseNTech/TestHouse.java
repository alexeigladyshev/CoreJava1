package HouseNTech;

public class TestHouse {

	public static void main(String[] args) {

		House myHouse = new House(3213, "Foxvale");
		
		myHouse.watchMovie();
		myHouse.cookDinner();
		myHouse.goToSleep();
		System.out.println("House name is "+ myHouse.houseName);
		System.out.println("Address is " + myHouse.address);
		System.out.println("House area is "+myHouse.houseArea(110, 155)+
				" sq meters");
		System.out.println(myHouse.toString() ); //method from Object class
	}

}
