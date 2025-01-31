import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Bike {
	
	//Static fields 
	private static String brand;
	private static int wheels;
	private static int count;
	
	//non static fields
	private String engNum; // values returned by factory
	private String color;  // values returned by factory
	private String ownerName;  // value returned by showroom 
	private String bikeNum;  // value returned by RTO
	
	static{
		try{
			Scanner scn = new Scanner(new File("companydetails.txt"));
			brand = scn.nextLine();
			wheels = scn.nextInt();
			System.out.println("Brand initialized \t: " + brand);
			System.out.println("wheel initialized \t: " + wheels);
			}catch( FileNotFoundException e){
				e.printStackTrace();
		    }
		
	} //SB closed
	
	{
		count++;
	}
	
	
	
	public static String getBrand(){ 
		return brand;
	}
	
	public static int getWheels(){
		return wheels;
	}
	
	public static int getCount(){
		return count;
	}
	//Static fields initialization completed above 
	
	
	//non static fields get and set methods below
	
	public Bike(String engNum, String color){ //2 param constructor 
		if(brand == null){
			count--;
			throw new RuntimeException("companydetails.text not fount ");
		}
		this.engNum = engNum;
		this.color = color;
	}
	
	public String getEngNum(){ 
		return engNum;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public void setBikeNum(String bikeNum){
		this.bikeNum = bikeNum;
	}
	
	public String getBikeNum(){
		return bikeNum;
	}
	
		
	//Business logic below 
	
	public void start(){
		System.out.println(ownerName + " Bike Started " + bikeNum);
	}
	public void stop(){
		System.out.println(ownerName + " Bike Stop " + bikeNum);
	}
	public void move(){
		System.out.println(ownerName + " Bike moving on bike  " + bikeNum);
	}
	
	public void display(){
		System.out.println("Brand \t\t: " + brand);
		System.out.println("EngNum \t\t: " + engNum);
		System.out.println("Color \t\t: " + color);
		System.out.println("OwnerName \t\t: " + ownerName);
		System.out.println("BikeNum \t\t: " + bikeNum);
	}
		
	/*
	
	private static String brand;
	private static String wheels;
	private static int count;
	
	//non static fields
	private String engNum;
	private String color;
	private String ownerName;
	private String bikeNum;
	
	*/
	
}
