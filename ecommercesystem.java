
import java.util.Scanner;
public class ecommercesystem {
public static void main(String[] args) {
		electronicproduct electronic= new electronicproduct("Smartphone",1, 599.99,"Samsung",1);
		clothingproduct clothing= new clothingproduct("tshirt",2, 19.99,"medium","Cotton");
	    bookproduct book= new bookproduct("Object oriented programming",3, 39.99,"O'reilly","X publicatoions");
 Scanner input= new Scanner(System.in);
 System.out.println("Please Enter your ID:");
 int customerID = input.nextInt();
 System.out.println("Please Enter your name:");
 String custname=input.next();
 System.out.println("Enter your address:");
 String address=input.next();
 customer cust1 = new customer(customerID,custname,address);
 System.out.println("How many products you want to add to your cart?");
 int nproducts=input.nextInt();
 cart cart1= new cart(cust1.getcustomerID(),nproducts);
 for ( int i = 0 ; i<nproducts ;i++) {
	 System.out.println("Which product would you like to add? 1- Smartphone 2- T-shirt 3-Book");
     int choice = input.nextInt();
     switch (choice) {
     case 1:
    	 cart.addproduct(new electronicproduct("Smartphone",1,599.9,"Samsung",1),i);
         break; 
     case 2:
    	 cart.addproduct( new clothingproduct("tshirt",2,19.99,"medium","Cotton"),i);
    	 break;
     case 3:
    	 cart.addproduct(new bookproduct("OOP",3,39.99,"O'reilly","X publicatoions"),i);
         break;    
     default :
    	 System.out.println("invalid input, please choose 1 or 2 or 3 ");
     }
     
 }
 float totalprice = cart.calcprice();
 System.out.println("Your total is "+(float)totalprice+"$." );
 System.out.println("Would you like to place order ? 1- Yes, 2-No");
 int choicetoplace=input.nextInt();
 if (choicetoplace ==1) {
	 order order1 = new order (cust1.getcustomerID(),1,cart1.getproducts(),totalprice);
	 System.out.println("Here is your order's summary:");
	 order1.printOrderInfo();
 }else {
	 System.out.println("order not placed");
 }}}