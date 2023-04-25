
import java.util.Scanner;

public class PizzaFactory
{
	public static void main(String[] args) 
	{
		String PizzaName=null;
		String PizzaTopping=null;
		String Size=null;
		String ExtraCheese="NA";
		String Side="NA";
		int price=0;
		int more=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("---------------------------Welocome to PizzaFactory-----------------------------");
		System.out.println("--------------------------------------------------------------------------------");
		do
		{
			System.out.println("Which type of Pizza would you like to have");
			System.out.println("1.VEG");
			System.out.println("2.NON-VEG");
			int pizzatype =sc.nextInt();
			switch(pizzatype)
			{
			case 1:
			{
				System.out.println("------------Please select Pizza(Press the serial number)---------");
				System.out.println("1.DeluxeVeggie");
				System.out.println("2.Cheese and corn");
				System.out.println("3.Paneer Tikka");
				int pizzaname=sc.nextInt();
				
				System.out.println("------------Please select Pizza(Press the serial number)---------");
				System.out.println("1.New hand Tossed");
				System.out.println("2.Wheat thin crust");
				System.out.println("3.cheese Brust");
				System.out.println("4.Fresh pan pizza");
				int pizzacrust=sc.nextInt();
				
				System.out.println("------------Please Size of Pizza(Press the serial number)---------");
				System.out.println("1.Regular");
				System.out.println("2.Medium");
				System.out.println("3.Large");
				int pizzasize=sc.nextInt();
				
				switch(pizzaname)
				{
					
					case 1:
				   {
					   PizzaName="Deluxe Veggie";
							switch(pizzasize)
							{
							case 1:{price=150;Size="Regular";}break;
							case 2:{price=200;Size="Medium";}break;
							case 3:{price=325;Size="Large";}break;
							}
					}break;
					case 2:
					{
						PizzaName="Cheese and corn";
						switch(pizzasize)
						{
						case 1:{price=175;Size="Regular";}break;
						case 2:{price=375;Size="Medium";}break;
						case 3:{price=475;Size="Large";}break;
						}
				    }break;
					case 3:
					{
						PizzaName="Paneer Tikka";
						switch(pizzasize)
						{
						case 1:{price=160;Size="Regular";}break;
						case 2:{price=290;Size="Medium";}break;
						case 3:{price=340;Size="Large";}break;
						}
				    }break;
				}
				
				System.out.println("------------Please select topping(Press the serial number)---------");
				System.out.println("1.Black olive");
				System.out.println("2.Capsicum");
				System.out.println("3.Paneer");
				System.out.println("4.Mushroom");
				System.out.println("5.Fresh tomato");
				System.out.println("6.No I don't want to add topping");
				int pizzatopping=sc.nextInt();
				switch(pizzatopping)
				{
				case 1:{ price=price+20;PizzaTopping="Black olive";}break;
				case 2:{ price=price+25;PizzaTopping="Capsicum";}break;
				case 3:{ price=price+35;PizzaTopping="Paneer";}break;
				case 4:{ price=price+30;PizzaTopping="Mushroom";}break;
				case 5:{ price=price+10;PizzaTopping="Fresh tomato";}break;
				default :{ PizzaTopping="NA";}break;
				}
					
			}break;
			case 2:
			{
				System.out.println("1.Non-Veg Supreme");
				System.out.println("2.Chicken Tikka");
				System.out.println("3.Pepper Barbecue Chicken");
				int pizzaname=sc.nextInt();
				
				System.out.println("------------Please select Pizza(Press the serial number)---------");
				System.out.println("1.New hand Tossed");
				System.out.println("2.Wheat thin crust");
				System.out.println("3.cheese Brust");
				System.out.println("4.Fresh pan pizza");
				int pizzacrust=sc.nextInt();
				
				System.out.println("------------Please Size of Pizza(Press the serial number)---------");
				System.out.println("1.Regular");
				System.out.println("2.Medium");
				System.out.println("3.Large");
				int pizzasize=sc.nextInt();
				
				switch(pizzaname)
				{	
					case 1:
					{
						PizzaName="Non-Veg Supreme";
						switch(pizzasize)
						{
						case 1:{price=190;Size="Regular";}break;
						case 2:{price=325;Size="Medium";}break;
						case 3:{price=425;Size="Large";}break;
						}
				    }break;
					case 2:
					{
						PizzaName="Chicken Tikka";
						switch(pizzasize)
						{
						case 1:{price=210;Size="Regular";}break;
						case 2:{price=370;Size="Medium";}break;
						case 3:{price=500;Size="Large";}break;
						}
				    }break;
					case 3:
					{
						PizzaName="Pepper Barbecue Chicken";
						switch(pizzasize)
						{
						case 1:{price=220;Size="Regular";}break;
						case 2:{price=380;Size="Medium";}break;
						case 3:{price=525;Size="Large";}break;
						}
				    }break;
				}
					System.out.println("------------Please select topping(Press the serial number)---------");
					System.out.println("1.Chicken tikka");
					System.out.println("2.Barbeque chicken");
					System.out.println("3.Grilled chicken");
					System.out.println("4.No I don't want to add topping");
					int pizzatopping=sc.nextInt();
					switch(pizzatopping)
					{
					
					case 1:{ price=price+35;PizzaTopping="Chicken tikka";}break;
					case 2:{ price=price+45;PizzaTopping="Barbeque chicken";}break;
					case 3:{ price=price+40;PizzaTopping="Grilled chicken";}break;
					default :{ PizzaTopping="NA";}break;
					}	
			}break;
			
			}
				
			System.out.println("------------Extra Cheese(Enter yes/no)---------");
			System.out.println("1.Yes");
			System.out.println("2.No");
			int cheese=sc.nextInt();
			if(cheese==1)
			{
				ExtraCheese="Added";
				price=price+35;
			}
			
			System.out.println("------------Please select side(Press the serial number)---------");
			System.out.println("1.cold drink");
			System.out.println("2.Mousse cake");
			System.out.println("3.Both");
			System.out.println("4.No");
			int siden=sc.nextInt();
			if(siden==1)
				{price=price+55;
				Side="Cold Drink";
				}
			else if(siden==2)
				{price=price+90;
				Side="Mousse cake";
				
				}
			else if(siden==3)
				{price=price+145;Side="Cold Drink and Mousse cake";
				}
			
			System.out.println("---------------------------------------------------------------");
			System.out.print("How many Pizza do you want:");
			int quantity=sc.nextInt();
			
			price = price*quantity;
			
			System.out.println("---------------------------------------------------------------");
			System.out.println("Your Pizza:"+PizzaName);
			System.out.println("	 Topping:"+PizzaTopping);
			System.out.println(" 	 Size:"+Size);
			System.out.println(" 	 Extra Cheese:"+ExtraCheese);
			System.out.println(" 	 Side:"+Side);
			System.out.println(" 	 Quantity:"+quantity);
			System.out.println(" 	 Price:"+price+ "  is order Successfully, \n              Thank You");
			System.out.println("---------------------------------------------------------------");
			
			System.out.println("---------------------------------------------------------------");
			System.out.println("Would you like to buy more Pizza?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			more=sc.nextInt();
				
		}while(more==1);
	}

}
