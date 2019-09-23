package com.app.streams;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.app.data.ItemsData;
import com.app.model.Items;

public class Streams_List_Demo {

	public static void main(String[] args) {
		
		List<Items> itemsLst=new ItemsData().getAllItems();
		
		itemsLst.forEach(System.out::println);
		
		//item price changes in streams
		Items item=itemsLst.stream()
							.filter(itemm->"865DASX2200".equalsIgnoreCase(itemm.getItemcode()))
							.findAny()
							.orElse(null);
		System.out.println("Mobile -> "+item);
		
		itemsLst.stream()
				.forEach(itemm->{ //mobile price change
					if("865DASX2200".equalsIgnoreCase(itemm.getItemcode())){
							item.setPrice(item.getPrice()+2000);
					} 
				});
		Items itemm=itemsLst.stream()
				.filter(itemms->"865DASX2200".equalsIgnoreCase(itemms.getItemcode()))
				.findAny()
				.orElse(null);
		System.out.println("Mobile -> "+itemm);
		
		
		Items min_items=itemsLst.stream()
			.min((item1,item2)->item1.getPrice()>item2.getPrice()?1:-1).get();
		
		System.out.println(min_items);
		
		Items max_items=itemsLst.stream()
				.max((item1,item2)->item1.getPrice()>item2.getPrice()?1:-1).get();
			
			System.out.println(max_items);
			
		Long itemscount=itemsLst.stream().count();
		System.out.println("items count -> "+itemscount);
		
		
		String itemname=itemsLst.stream()
				.filter(itm->"Mobilee".equalsIgnoreCase(itm.getItemname()))
				.map(Items::getItemname)
				.findAny()
				.orElse("Items not found");
				//.orElse(null);
				System.out.println(itemname);
				
		List<Items> anotherItemsLst=itemsLst.stream()
											.filter(itm->itm.getPrice()>10000)
											.collect(Collectors.toList());
				
		System.out.println(anotherItemsLst);		
			
		List<String> itemsLstNames=itemsLst.stream()
											.filter(itm->itm.getPrice()<15000)
											.map(Items::getItemname)
											.collect(Collectors.toList());
			System.out.println(itemsLstNames);	
				
		Double cartTotalPrice=itemsLst.stream()
									.map(Items::getPrice)
									.reduce((double) 0,Double::sum);
		Double cartTotalPrice1=itemsLst.stream()
				.map(Items::getPrice)
				.reduce((double) 0,(sum,price)->sum+price);
		System.out.println(cartTotalPrice);
		System.out.println(cartTotalPrice1);
		
		DoubleSummaryStatistics cartTotalPrice2=itemsLst.stream()
													.collect(Collectors.summarizingDouble(Items::getPrice));
		
		System.out.println(cartTotalPrice2);
		
		
		
		
		
		
		
	}
}
