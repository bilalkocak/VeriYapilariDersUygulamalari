package ikiliAramaAgaci;
//Ýkili arama aðacýnýn tanýmlandýðý sýnýf.
public class BSTNode {
	int icerik;
	
	BSTNode sag;
	BSTNode sol;
	
	public BSTNode(int icerik){
		this.icerik=icerik;
		sol=null;
		sag=null;
	}
}
