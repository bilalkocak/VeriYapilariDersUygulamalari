package yigin;
//Y���n�n fonksiyonlar�n�n bulundu�u s�n�f.
public class yigin {
	
	private yiginnode ust,temp;
	
	public  yigin(){
		ust=null;
	}
	//Y���na eleman ekleyen fonksiyon.
	public void koy(int eleman){
		yiginnode x =new yiginnode(eleman);
		x.sonraki=ust;
		ust=x;
	}
	//Y���n�n bo�lu�unu kontrol eden fonksiyon.
	public boolean bosMu(){
		if(ust==null){
			return true;
			
		}
		else{
			return false;
		}
	}
	//Y���ndan eleman alan fonksiyon.
	public int al(){
		if(bosMu()){
			System.out.println("liste bo���");
			return -1;
		}
		temp=ust;
		ust=ust.sonraki;
		return temp.eleman;
	}
	//Y���n� listeleyen fonksiyon.
	public void listele(){
		if(bosMu()){
			System.out.println("liste booo�");
		}
		System.out.println("----L�STE----");
		temp=ust;
		while(temp!=null){
			
			System.out.println(temp.eleman);
			temp=temp.sonraki;
		}
	}
}
