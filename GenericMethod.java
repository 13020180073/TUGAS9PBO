public class GenericMethod {
public static void main (String [] args) {
	Integer[] angka= {1,2,3,4,5};
	String[] kata = {"jakarta","Bogor","Bandung","Bekasi"};

	GenericMethod.<Integer>print(angka);
	GenericMethod.<String>print(kata);
	}

public static <E> void print(E[] list){
	for(int i=0 ; i < list.length ; i++)
	System.out.print(list[i]+ " ");
	System.out.println();
	}
}
