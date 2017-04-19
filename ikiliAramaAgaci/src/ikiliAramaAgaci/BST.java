package ikiliAramaAgaci;

//Ýkili arama aðacýnýn fonksiyonlarýnýn bulunduðu sýnýf.
public class BST {
	
	BSTNode kok;
	public BST(){
		kok=null;
	}
	//Aðaca elaman ekleyen fonksiyon.
	public void ekleme(int sayi){
		BSTNode newBSTNode=new BSTNode(sayi);
		if(kok==null){
			kok=newBSTNode;
			return;
		}
		BSTNode current=kok;
		BSTNode parent=null;
		while(true){
			parent=current;
			if(sayi<current.icerik){
				current=current.sol;
				if(current==null){
					parent.sol=newBSTNode;
					return;
				}
			}else{
				current=current.sag;
				if(current==null){
					parent.sag=newBSTNode;
					return;
				}
			}
		}
	}
	//Aðacý küçükten büyüðe listeleyen fonksiyon.
	public void listele(BSTNode kok){
			
		if(kok!=null){
			listele(kok.sol);
			System.out.println(" "+kok.icerik);
			listele(kok.sag);
		}
	}	
}

