
public class ClientClass {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
//		Factory factor=new AFactory();
		Factory factor=(Factory)XMLUtil.getBean();
		Fruit fruit=factor.CreateFruit();
//		Factory factor=new Factory();
//		Fruit fruit=factor.CreateFruit("A");
		fruit.eat();
	}
	public String factory(String fruitname){
//		if(fruitname.equals("Apple"))
//			return "Apple";
//		if(fruitname.equals("Banana"))
//			return "Banana";
		return null;
	}
}
