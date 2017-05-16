package heapTree;

public class heap {
	heapNode dizi [];
	int tane;
	
	public heap(int n){
		dizi=new heapNode[n];
		tane=0;
	}
	
	public void ekle(int a){
		heapNode yeni=new heapNode(a);
		tane++;
		dizi[tane-1]=yeni;
		yukariCik(tane-1);
	}
	
	public void yukariCik(int no){
		int ustdal;
		ustdal=(no-1)/2;
		while (ustdal>=0 && dizi[ustdal].icerik<dizi[no].icerik) 
		{
			yerDegistir(ustdal,no);
			no=ustdal;
			ustdal=(no-1)/2;
		}
	}
	
	public void yerDegistir(int ustdal,int no){
		int eski=dizi[ustdal].icerik;
		dizi[ustdal].icerik=dizi[no].icerik;
		if(eski>dizi[no].icerik)
			asagiIn(ustdal);
		else
			yukariCik(ustdal);
	}
	
	public void asagiIn(int no){
		int altsol,altsag;
		altsol=(2*no)+1;
		altsag=(2*no)+2;
		
		while ((altsol<tane && dizi[no].icerik<dizi[altsol].icerik)||(altsag<tane && dizi[no].icerik < dizi[altsag].icerik)) {
			
			if (altsag<tane ||  dizi[altsol].icerik>dizi[altsag].icerik) {
				yerDegistir(no, altsol);
				no=altsol;
			}else{
				yerDegistir(no, altsag);
				no=altsag;
			}
			altsol=(2*no)+1;
			altsag=(2*no)+2;
			
		}
	}
	
	public static void main(String[]args){
		heap a=new heap(5);
		
		a.ekle(70);
		a.ekle(600);
		a.ekle(12);
		a.ekle(35);
		a.ekle(19);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a.dizi[i].icerik);
		}
	}
	
	

}
