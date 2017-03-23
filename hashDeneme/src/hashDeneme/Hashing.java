package hashDeneme;

public class Hashing {

	private final static int Boyut=128;
	
	HashHash[] tablo;
	Hashing(){
		tablo=new HashHash [Boyut];
		for(int i=0;i<Boyut;i++){
			tablo[i]=null;
		}
	}
	
	public int get(int key) {
		int hash=(key%Boyut);
		while (tablo[hash]!=null&&tablo[hash].getKey()!=key) {
			hash=(hash+1)%Boyut;
		}

		if(tablo[hash]==null)
			return -1;
		else
			return tablo[hash].getValue();
	}
	public void put(int key, int value){
		int hash=(key%Boyut);
		while (tablo[hash]!=null&&tablo[hash].getKey()!=key) {
			hash=(hash+1)%Boyut;
			tablo[hash]=new HashHash(key, value);
		}
	}
}