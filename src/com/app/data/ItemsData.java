package com.app.data;

import java.util.Arrays;
import java.util.List;

import com.app.model.Items;

public class ItemsData {
	
	
	public Items getItem() {
		return new Items(10,"Mobile","865DASX2200",9989.98);
	}
	
	public List<Items> getAllItems(){
		return Arrays.asList(
					new Items(10,"Mobile","865DASX2200",9989.98),
					new Items(20,"TV","345DASX2278",12500.00),
					new Items(30,"Laptops","865DASX2256",52499.0),
					new Items(40,"Battries","865DASX2257",2500.00),
					new Items(50,"Bags","865DASX2223",1289.12),
					new Items(60,"Books","865DASX2236",2356.0),
					new Items(70,"Clothes","865DASX2278",6800.0),
					new Items(80,"Beds","865DASX2298",16899.0),
					new Items(90,"Watches","865DASX2288",6999.0),
					new Items(100,"Shoes","865DASX2256",2499.0),
					new Items(110,"Charges","865DASX2243",899.0),
					new Items(120,"Cameras","865DASX2228",24999.0),
					new Items(130,"Bottles","865DASX2289",120.0),
					new Items(140,"Fans","865DASX2228",1860.0),
					new Items(150,"Acs","865DASX2289",32500.0)
				); 	 
	}

}
