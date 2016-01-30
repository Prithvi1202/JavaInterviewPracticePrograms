class Test{
	public static void main(String [] args){
		Auther ath = new Auther("James", 55, "US");
		Book b = new Book("Java", 550, ath);
		b.showDetail();
	}
}