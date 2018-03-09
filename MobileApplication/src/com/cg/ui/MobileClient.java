package com.cg.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.dto.Mobile;
import com.cg.service.MobileService;
import com.cg.service.MobileServiceImpl;

public class MobileClient 
{

	public static void main(String[] args) 
	{
		MobileService mSer=new MobileServiceImpl();
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Add Mobile");
			System.out.println("2. Update Mobile");
			System.out.println("3. Search Mobile");
			System.out.println("4. Delete Mobile");
			System.out.println("5. Show All Mobiles");
			System.out.println("6. Fetch Mobile in price Range");
			System.out.println("7. Exit");
			System.out.println("Enter Your Choice");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Mobile Name: ");
				String mname=sc.next();
				System.out.println("Enter Price: ");
				double price=sc.nextDouble();
				System.out.println("Enter Quantity: ");
				int qty=sc.nextInt();
				
				Mobile mobile=new Mobile();
				mobile.setMname(mname);
				mobile.setPrice(price);
				mobile.setQty(qty);
				mSer.addMobile(mobile);
				System.out.println("Mobile Details Added");
				break;
				
			case 2:
				
				break;
				
			case 3:
				System.out.println("Enter Mobile Id to Search");
				int mid=sc.nextInt();
				Mobile mobile1=mSer.findMobile(mid);
				System.out.println(mobile1);
				break;
				
			case 4:
				System.out.println("Enter Mobile Id to Delete");
				int mid1=sc.nextInt();
				Mobile mobile2=mSer.findMobile(mid1);
				mSer.deleteMobile(mobile2);
				System.out.println("Mobile Details Deleted");
				break;
				
			case 5:
				List<Mobile> mlist=mSer.getAllMobiles();
				for(Mobile m:mlist)
				{
					System.out.println(m);
				}
				break;
				
			case 6:
				System.out.println("Enter minimum price: ");
				double minPrice=sc.nextDouble();
				System.out.println("Enter maximum price: ");
				double maxPrice=sc.nextDouble();
				
				List<Mobile> mlist1=mSer.fetchMobileInPriceRange(minPrice,maxPrice);
				for(Mobile m:mlist1)
				{
					System.out.println(m);
				}
				break;
				
			case 7:
				System.exit(0);
			}
		
		}
		while(true);
		

	}

}
