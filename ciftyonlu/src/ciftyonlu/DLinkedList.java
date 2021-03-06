package ciftyonlu;
//Cift yonlu bagli liste fonksiyonlarinin bulundugu sinif.
public class DLinkedList {
	public DListNode head,tail;
	//Eleman ekleme fonksiyonu.
	public void ekle(String ad){
		DListNode yeniNode=new DListNode(ad);
		if(head==null){
			head= yeniNode;
			head.sonraki=tail;
			head.onceki=null;
			tail=head;
			tail.onceki=null;
			tail.sonraki=null;
		}
		else if (head!=null){
			
			yeniNode.onceki=tail;
			tail.sonraki=yeniNode;
			tail=yeniNode;
			tail.sonraki=null;
		}
	}
	//Listeyi listeleyen fonksiyon
	public void listele(){
		if(head==null){
			System.out.println("liste bo�");
			System.out.println();
			return;
		}
		
		DListNode temp=head;
		while(temp.sonraki!=null){
			System.out.println(temp.isim);
			temp=temp.sonraki;
			System.out.println();
			
		}
	}
	//Listeden eleman silen fonksiyon
	public void sil(String ad){
		
		if(head==null){
			System.out.println("Liste Bo�");
		
		}else{
			DListNode temp=head;
			while(temp.isim!= ad.toString()){
				temp=temp.sonraki;
			}
			temp.onceki.sonraki=temp.sonraki;
			temp.sonraki.onceki=temp.onceki;
		}
		
	}

}
