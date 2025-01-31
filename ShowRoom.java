import java.util.Scanner;
public class ShowRoom { //step 6
	/* ============================== */
	  private Scanner   scn;
	  private Factory   Hero;        //all variables provided 
	  private Bike[]    bikes;       //with memory "step 9"
	  private int        index;
	  
    /* ============================== */
	  
	  
	  static{ //step 7
		  System.out.println("\n ShowRoom class is loaded");
	  }
	 
	/* ============================== */
	  public ShowRoom(){  //step 8 //No param Constructor()
		  scn = new Scanner(System.in);
		  Hero = new Factory(); //step 10
		  bikes = Hero.getBikes(10);
		  index = 0;
		  System.out.println("Bikes are stored in showroom");
		  System.out.println("Showroom class obj is created");
		   
		  
	  }
	/* ============================== */
	  
	  public Bike buy(){
		  System.out.println("ShowRoom.buy() executed is started");
		  
		  //checking available or not , if not generates new 10 bikes 
		  if((bikes == null || (index == bikes.length))){
			  
			  bikes = Hero.getBikes(10);  //step 17
		  }
		   
		  System.out.println("Customer is selecting one bike ....");
		  
		  //selecting one obj from Bike array 
		  Bike bike = bikes[index];
		  
		  System.out.println("Customer has selected one bike...");
		  
		  
		  System.out.println("Registering Bike on customer Name...");
		  System.out.print("Enter Owner Name : ");
		  
		  //Getting owner names 
		  bike.setOwnerName(scn.nextLine());
		  System.out.println("Bike has Registered on this customer Name");
		  
		  System.out.println("Removing Bike from ShwoRoom");
		  
		  //removing that bike obj from array
		  bikes[index] = null;
		  index++; 
		  
		  
		  System.out.println("Bike has removed from ShowRoom");
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  
		  return bike;
	  }//buy() method close
	   
} //class close
