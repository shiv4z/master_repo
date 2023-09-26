package in.shiv.convertor;

import com.google.gson.Gson;
 
import in.shiv.Order;

public class ConvertJavaObjToJson {
	public static void main(String[] args) {

		Order order = new Order();
		order.setId(101);
		order.setItemName("Book");
		order.setAmount(400.0);
		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);
		
		System.out.println("Json serialization usin gson api..");
		
		
		Order fromJson = gson.fromJson(json, Order.class);
		System.out.println(fromJson);
		System.out.println("Json deserialization completed..");
		
	}

}
