package kuyruk;
//Kuyruk icin fonksiyonlarin bulundugu s�n�f.
public class kuyruk {
	
	kuyrukNode bas,son;
	int boyut;
	public kuyruk(){
		bas=null;
		boyut=0;
	}
	//Kuyruga eleman ekleyen fonksiyon.
	public void ekle (String ad){
		kuyrukNode yeni = new kuyrukNode(ad);
		
		if(bas==null){
			bas=yeni;
			bas.sonraki=bas;
			son=bas;
		}else{
			son.sonraki=yeni;
			son=yeni;
		}
		boyut++;
	}
	//Kuyruktan eleman silen fonksiyon.
	public kuyrukNode dequeue(){
		kuyrukNode b;
		b=bas;
		bas=bas.sonraki;
		return b;
	}
	//Kuyrugu listeleyen fonksiyon.
	public void listele(){
		kuyrukNode temp;
		temp=bas;
		System.out.println("----Liste----");
		if(temp==null)
			System.out.println("kuyruk bo��");
		else{
			while(temp!=null){
				System.out.println(temp.ad);
				temp=temp.sonraki;
			}
		}
	}

}
