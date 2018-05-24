
public class SecondClass {
	
	//sample model class
	private String name;
	private String email;
	
	public SecondClass(String name, String email)
	{
		this.name = name;
		this.email = email;
	}
	
	public void SetUserName(String userName){
		this.name = userName;
	}
	
	//added this method on 5/24/2018
	public void showUsers(){
		System.out.println("Printing users!!");
	}
}
