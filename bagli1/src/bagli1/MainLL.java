package bagli1;
//Main sýnýfý.
public class MainLL {

	public static void main(String[] args) {
		
		LinkedList d=new LinkedList();
		d.ekle("ali");
		d.ekle("ayþe");
		d.ekle("Ahmet");
		d.listele();
		System.out.println();
		d.sil("ayþe");
		d.listele();
		

	}
}