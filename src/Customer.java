import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Customer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new  BufferedReader(new FileReader("/Users/warakornworasiri/Documents/rec.txt"));
		//try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
		String data = null;
		List<String> line = new ArrayList<String>();
		try {
			while ((data = br.readLine())!= null) {
				Gson gson = new Gson();
				System.out.println(gson.toJson(data));
				//String date = line.get(0);
				//String starttime = line.get(1);
				//String endtime = line.get(2);
				//String phonenumber = line.get(3);
				//String promotion = line.get(4);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bill(){
		//calcuate the a customer’s calling bill
	}
}
