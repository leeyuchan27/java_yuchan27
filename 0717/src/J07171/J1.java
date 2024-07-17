package J07171;

public class J1 {

	public static void main(String[] args) {
		
		FruitBox<Apple> appleBox=new FruitBox<>();
		
		appleBox.setFruit(new Apple());
		
		FruitBox<Banana> bananaBox=new FruitBox<>();
		
		bananaBox.setFruit(new Banana() );
		
		FruitBox<Grape> grapeBox=new FruitBox<>();
		
		grapeBox.setFruit(new Grape());
		
		Apple apple=appleBox.getFruit();
		
//		FruitBox<Toy> toyBox=new FruitBox<>();
//		
//		toyBox.setFruit(null);
		
		Juice j=new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		Fruit a=new Apple();
			  a=new Banana();
			  a=new Grape();
		

	}

}
