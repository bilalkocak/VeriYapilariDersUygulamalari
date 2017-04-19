package ciftyonlu;
//Çift yönlü baðlý liste main sýnýfý.
public class DMain {

	public static void main(String[] args) {
		DLinkedList d=new DLinkedList();
		d.ekle("Ömer");
		d.ekle("Oðhuzhan");
		d.ekle("Fatih");
		d.ekle("Ali Osman");
		d.listele();
		d.sil("Fatih");
		d.listele();
	}

}
