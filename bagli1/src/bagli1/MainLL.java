package bagli1;
//Main s�n�f�.
public class MainLL {

	public static void main(String[] args) {
		
		LinkedList d=new LinkedList();
		d.ekle("ali");
		d.ekle("ay�e");
		d.ekle("Ahmet");
		d.listele();
		System.out.println();
		d.sil("ay�e");
		d.listele();
		

	}
}