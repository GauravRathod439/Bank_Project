package Bank_Proj;
import java.util.*;


public class BankApplication {

	public static void main(String[] args) {
		 System.out.println("List Of The Customers Who Opened Account In Bank:");
		 System.out.println("=================================================================================================");
		Customer c1=new Customer(232145812,"Gaurav");
		Customer c2=new Customer(232325812,"Ram");
		Customer c3=new Customer(23455812,"Rocky");
		Customer c4=new Customer(2524732,"Onkar");
		Customer c5=new Customer(2232342,"Pavan");
		
		LinkedList<Customer> ls=new LinkedList<Customer>();
		ls.add(c1);
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		ls.add(c5);
		System.out.println(ls);
		
		
        BankAccount ob=new BankAccount("Gaurav","194088");
        ob.showmenu();
	}

}
