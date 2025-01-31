class Customer{ //step 2
	
	static{ //step 3
		System.out.println("Class Customer is loaded");
	}
	public static void main(String[] args) { //step 4
		System.out.println("\nCustomer.main() Exceution started");
		
		System.out.println("\nShowRoom.buy() is called");
		
		//to call buy method we need "ShowRoom" obj 
		
		ShowRoom bajajShowRoom = new ShowRoom(); //step 5
		 
		//in class Bike we creating var bike calls buy();
		Bike bike = bajajShowRoom.buy();
		
		System.out.println("Back in customer.main() method ");
		
		System.out.println("Bike object is return to customer" + 
			"\n with engNum , color and ownerName values");
	
		System.out.println("we must initialize Bike obj with bikeNNum");
		
		System.out.println("Rto.setBikeNUM() is called");
		
		RTO krto = new RTO();
		
		krto.setBikeNum(bike);
		System.out.println("Back to customer.main() method"); 
	    
		System.out.println("Bike obj is fully initialized");
		
		System.out.println("\nBike Object Details");
		
		bike.display();
		
		System.out.println("\n" + bike.getOwnerName() + "Performing bike operation ");
		
		bike.start();
		bike.move();
		bike.stop();
		
		System.out.println("Main() method execution completed"); 
		
	}//main close
}//class close
