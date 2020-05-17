public class interface {
    public static void main(String[] args) {
        List<integer> arrList = new ArrayList<integer>();        
        for (int i = 0; i < 10; i++) {
        arrList.add(i);        
}

        Iterator<integer> i = arrList.iterator();
        System.out.println("Deretan Angka Genap");        
        System.out.println("===================");        
        while (i.hasNext()) {
        int a;            
        a = i.next() * 2;            
        System.out.print("Hasil = " + a + "\n");       
       }
    }
}
