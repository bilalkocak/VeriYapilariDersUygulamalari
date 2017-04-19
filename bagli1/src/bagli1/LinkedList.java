package bagli1;
//Baðlý listenin fonksiyonlarýnýn bulunduðu sýnýf.
public class LinkedList {
	//ListNode türünde baþ ve kuyruk tanýmlandý.
	ListNode head,tail;
	
	//Listeye eleman ekleyen fonksiyon.
	public void ekle(String ad){
		ListNode yeniNode= new ListNode(ad);
		//Ýlk eleman kontrolü.
		if(head==null){
			head=yeniNode;
			tail=yeniNode;
			head.sonraki=null;
		}
		else if(head!=null){
			yeniNode.sonraki=head;
			head=yeniNode;
		}
		return;
	}
	//Listeyi listeleyen fonksiyon :)
	public void listele(){
		if(head==null){
			System.out.println("Liste boþ");
			return;
		}
		System.out.println("Listesi: ");
		ListNode temp = head;
		while(temp != null){
			System.out.println(temp.isim);
			temp=temp.sonraki;
		}
		return;
	}
	//Listeden eleman silen fonksiyon.
	public void sil(String ad){
		if(head==null){
			System.out.println("Liste boþ");
		}
		else{
			ListNode temp=head;
			ListNode onceki=head;
			while(temp.isim!=ad.toString()){
				onceki=temp;
				temp=temp.sonraki;
			}
			onceki.sonraki=temp.sonraki;
		}
	}

}
