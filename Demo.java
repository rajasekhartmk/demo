package day7_session1;
class Aa{
	public static void f(){
		System.out.println("A");
	}
}
class Demo extends Aa {
	public static void f(){
		System.out.println("B");
	}
	public static void main(String[] args) {
		Aa a=new Aa();
		a.f();
	}
}
