package lab2;
import java.util.Scanner;
public class vendingM2
{
	public static void main(String[] args) 
	{
		{
			   {
			       int total,quarter,dime,nickel;
			       int potatoQuantity=1,cookieQuantity=5,candyQuantity=5; //quantity 
			       int potatoPrice=125,cookiePrice=85,candyPrice=95; //price
			       int change=0;
			       Scanner input =new Scanner(System.in);
			       while (true)
			       {
			       System.out.println("*****WELCOME*****");
			       System.out.println("Potato Chips $1.25");
			       System.out.println("Cookies $0.85");
			       System.out.println("Candies $0.95");
			       System.out.println("Please enter quarter dime or nickel (put space between)\n");
			       quarter= input.nextInt();
			       dime= input.nextInt();
			       nickel=input.nextInt();
			       total=quarter*25+dime*10+nickel*5;
			     
			      
			           System.out.print("Enter 1 for patato chips\n");
			           System.out.print("Enter 2 for cookies\n");
			           System.out.print("Enter 3 for candy\n");
			           int n= input.nextInt();
			           switch(n)
			           {
			               case 1:
			            	   if(potatoQuantity > 0) 
			            	   {
			            		   if(total<potatoPrice)
			            		   {
			            			   System.out.print("Not enough money\n");
			            		   }  
			            		   else if(total>=potatoPrice) 
			               			{		          
			               			total = total - potatoPrice;
			               			quarter = total / 25;
			               			total = total % 25;
			               			dime = total / 10;
			               			total = total % 10 ;
			               			nickel = total / 5;
			               			System.out.println("Your change is: " + "quarter:" + quarter + "  dime:" + dime + "  nickel: " + nickel );
			               			System.out.println("Please take your food");
			               			potatoQuantity--;
			               			}
			            	   }
			            	   else 
			            	   {
			            		   System.out.println("Sorry, potato chips is sold out. Please choose another food.");
			            		   break;
			            	   }
			               break;
			              
			                   case 2:
			                	   if(cookieQuantity>0)
			                	   {
			                	   if(total < cookiePrice)
			                	   {
			                   System.out.print("Not enough money\n");
			                	   }  
			                   else if (total >= cookiePrice)
			               
			                   		{
			                	    total = (total - cookiePrice);
			               			quarter = total / 25;
			               			total = total % 25;
			               			dime = total / 10;
			               			total = total %10 ;
			               			nickel = total / 5;
			               			System.out.println("Your change is: " + "quarter: " + quarter + "  dime: " + dime + "  nickel: " + nickel );
			               			System.out.println("Please take your food");
				               		cookieQuantity--;
			                   }
			                	   }
			                	   else
			                	   {
			                		   System.out.println("Sorry, cookie is sold out. Please choose another food.");
			                		  break;
			                	   }
			               break;
			              
			              
			              
			                   case 3:
			                	   if(candyQuantity>0)
			                	   {
			                	   if(total<candyPrice)
			                	   {
			                   System.out.print("Not enough money\n");
			                	   }  
			                   else if (total>=candyPrice)
			                   {
			                	   	total = total - candyPrice;
			               			quarter = total / 25;
			               			total = total % 25;
			               			dime = total / 10;
			               			total = total %10 ;
			               			nickel = total / 5;
			               			System.out.println("Your change is: " + "quarter: " + quarter + "  dime: " + dime + "  nickel: " + nickel );
			               			System.out.println("Please take your food");
				               		candyQuantity--;
			                   }
			                	   }
			                	   else 
			                	   {
			                		   System.out.println("Sorry, candy is sold out. Please choose another food.");
			                	   break;
			                	   }
			               break;
			              
			               default:
			            	   {
			            		   System.out.println("Sorry, the food does not exist\n");
			            	   break;
			            	   }     
			            	}
			           }
			          
			       }
			   	}
			}
	}