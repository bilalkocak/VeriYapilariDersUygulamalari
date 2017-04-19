package kuyruk;
//Kuyruk main sinifi.
public class kuyrukMain {

	public static void main(String[] args) {
		
		kuyruk mreko=new kuyruk();
		
		mreko.ekle("analucia");
		mreko.ekle("goodwin");
		mreko.ekle("bernard");
		mreko.listele();
		mreko.dequeue();
		mreko.listele();

	}

}
