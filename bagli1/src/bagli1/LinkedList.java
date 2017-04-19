package bagli1;
//Ba�l� listenin fonksiyonlar�n�n bulundu�u s�n�f.
public class LinkedList {
	//ListNode t�r�nde ba� ve kuyruk tan�mland�.
	ListNode head,tail;
	
	//Listeye eleman ekleyen fonksiyon.
	public void ekle(String ad){
		ListNode yeniNode= new ListNode(ad);
		//�lk eleman kontrol�.
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
			System.out.println("Liste bo�");
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
			System.out.println("Liste bo�");
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
