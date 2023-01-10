public class Selection {

	private String name;

	//Constructor, allows for passing values when creating a new instance of this class
	public Selection(String name){
		//set local variable (this.name) to variable passed in the constructor (name)
		this.name = name;
	}

	//Also a constructor, but no variables required
	public Selection(){
		//Do something
	}

	//A constructor with 2 variables
	public Selection(String name, int age){
		System.out.println(age);
	}

}
