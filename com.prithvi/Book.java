class Book{
	String name;
	int price;
	Auther auth;

	Book(String n , int p, Auther at){
		this.name = n;
		this.price = p;
		this.auth = at;
	}
	public void showDetail(){
		System.out.println("Book is "+ name);
		System.out.println("Price " + price);
		System.out.println("Auther is " + auth.getAutherName());
	}
	}
