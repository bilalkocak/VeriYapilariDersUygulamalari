package ciftyonlu;
//�ift y�nl� ba�l� liste main s�n�f�.
public class DMain {

	public static void main(String[] args) {
		DLinkedList d=new DLinkedList();
		d.ekle("�mer");
		d.ekle("O�huzhan");
		d.ekle("Fatih");
		d.ekle("Ali Osman");
		d.listele();
		d.sil("Fatih");
		d.listele();
	}

}
