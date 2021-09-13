import java.util.Scanner;
public class Account {

	private String accountoption;
    private long balance;
    private Customer customer =new Customer();
    
    Scanner inp1 = new Scanner(System.in);
    
    void openNewAccount() {
        System.out.print("Enter your Name: ");
        customer.setCustomerName(inp1.nextLine()); 
        System.out.print("Enter your account id: ");
       customer.setaccountId(inp1.next());
        System.out.print("Enter the type of account you want:  S for savings and C for checkings  : ");
        accountoption = inp1.next();
        System.out.print("Enter your balance : ");
        balance = inp1.nextLong();
        System.out.print("Enter your addressID   : ");
        customer.setAddress(inp1.next()); 
        System.out.print("Enter your contact number  : \n");
        customer.setcontactNumber(inp1.next()); 
       
        
    }

	public String getAccountoption() {
		return accountoption;
	}

	public void setAccountoption(String accountoption) {
		this.accountoption = accountoption;
	}

	public long getBal() {
		return balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setBal(long bal) {
		this.balance = bal;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Scanner getInp1() {
		return inp1;
	}

	public void setInp1(Scanner inp1) {
		this.inp1 = inp1;
	}
    
	 void makeDeposite()
	{
		long D;
		System.out.println("Enter balance you want to deposite");
		Scanner inp= new Scanner(System.in);
        D=inp.nextLong();
		this.setBal(D+this.getBal());
	}
	 void Withdrawl()
	 {
		 long D;
			System.out.println("Enter balance you want to withdrawl");
			Scanner inp= new Scanner(System.in);
	        D=inp.nextLong();
			this.setBal(this.getBal()-D);
	 }
	 void transferAmount()
	 {
		 long D;
			System.out.println("Enter amount you want to transfer");
			Scanner inp= new Scanner(System.in);
	        D=inp.nextLong();
			this.setBal(this.getBal()-D);
			System.out.println(" you   have transfer the amount successfully");
			
	 }
	 void calculatezakat()
	 {
		 System.out.println("The amount of Zakat is ="+(this.getBal()*2.5)/100);
	 }
	 void amountDeduction()
	 {
		 int Deduction=10;
		 
			 System.out.println(" This amount is deducted= "+Deduction);
			 Deduction=Deduction+10;
	 }
	 void calculateinterrestrate()
	 {
		 System.out.println("interest rate of 5.5 on this amount is ="+(this.getBal()*5.5)/100);
	 }
	 
}

