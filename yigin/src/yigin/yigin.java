package yigin;

public class yigin {
	
	private yiginnode ust,temp;
	
	public  yigin(){
		ust=null;
	}
	
	public void koy(int eleman){
		yiginnode x =new yiginnode(eleman);
		x.sonraki=ust;
		ust=x;
	}
	
	public boolean bosMu(){
		if(ust==null){
			return true;
			
		}
		else{
			return false;
		}
	}
	
	public int al(){
		if(bosMu()){
			System.out.println("liste boþþþ");
			return -1;
		}
		temp=ust;
		ust=ust.sonraki;
		return temp.eleman;
	}
	
	public void listele(){
		if(bosMu()){
			System.out.println("liste boooþ");
		}
		System.out.println("----LÝSTE----");
		temp=ust;
		while(temp!=null){
			
			System.out.println(temp.eleman);
			temp=temp.sonraki;
		}
	}
}
