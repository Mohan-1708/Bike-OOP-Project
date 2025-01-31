import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RTO{
	private static long bikeNumSeq;
	
	static{
		System.out.println("Class RTO is Loaded ");
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("bikeNumSeq.txt"));
			
			bikeNumSeq = dis.readLong();
			
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(
			"BikeNumSeq is initialized with " + bikeNumSeq);
		
		
	}//SB closed
	
	
	public void setBikeNum(Bike Bike){
		System.out.println("RTO.setBikeNum() execution started");
		
		Bike.setBikeNum("TS 09 BJ " + ++bikeNumSeq);
		
		System.out.println("bike num is stored in bike object");
		
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("bikeNumSeq.txt"));
			
			dos.writeLong(bikeNumSeq);
			dos.flush();
			
			dos.close();
			
		}
		catch(FileNotFoundException e ){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("RTO.SetBikeNum() execution completed ");
		System.out.println("Control is returned to class customer ");
		
	}//setBikeNum() method close 
	
		
	
			
}//class close
