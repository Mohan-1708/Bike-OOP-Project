import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Factory {//step 11
	
	private static long engNumSeq; //step 12
//=========================================================	
	static{ //step 13
		System.out.println("\n class Factory is loaded ");
		
		try{
			//connecting to file
			DataInputStream dis = //refer screenshot step 14-16
				new DataInputStream(new FileInputStream("engNumSeq.txt"));
			//reading engNumSeq value from file
			engNumSeq = dis.readLong();
			
			dis.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println("Eng num seq initialized with " + engNumSeq);
		
	}//SB closed
//=========================================================	

	
	//================================================================
	//bike array method
	Bike[] getBikes(int noOfBikes){ //step 18  no.of.bikes[10]
		System.out.println("Factory.getBike() execution started" );
		
		Bike[] bikes = new Bike[noOfBikes];
		
		/*{ entire for loop //step 20*/ 
		
		for (int i = 0; i<noOfBikes ; i++ ){
			String engNum = "ABC123PQ" + ++engNumSeq;
			String color;
			 
			if((engNumSeq%2)==0){
				color = "RED";
			}else{
				color = "YELLOW";
			}
			
			bikes[i] = new Bike(engNum , color); //calling constructor
		}//for close 
		
		
		
	/*}*/
		
		//storing engNumSeq in file again for continuation
		
		try{
			//connecting file again to write in text doc
			DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("engNumSeq.txt"));
			//saving engNumSeq in the file
			
			dos.writeLong(engNumSeq);
			dos.flush();
			
			//closing connection
			dos.close();
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(
			noOfBikes + "bikes are manufactured ");
		System.out.println(
			"Factory.getBike() Executed successfully");
		System.out.println(
			"Bike objects are returned to class ShowRoom");
		
		return bikes;
	//================================================================
	}//gB method closed
		
		
}//class closed
