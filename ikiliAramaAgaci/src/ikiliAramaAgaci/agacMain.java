package ikiliAramaAgaci;
//Ýkili arama aðacý main sýnýfý.
public class agacMain {

	public static void main(String[] args) {
		BST agac=new BST();
		
		agac.ekleme(5);
		agac.ekleme(13);
		agac.ekleme(255);
		agac.ekleme(12);
		agac.ekleme(25);
		agac.ekleme(42);
		agac.ekleme(1);
		
		agac.listele(agac.kok);
		

	}

}
