package ikiliAramaAgaci;
//Ikili arama agacinin tanimlandigi sinif.
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
