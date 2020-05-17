public class anynomous {
    public static void main(String[] args){
        DemoAnonymous demo = new DemoAnonymous() {
            
            public void LakukanSesuatuCoy(String data1, int data2, boolean data3) {
                System.out.println("Nama Saya: "+data1);
                System.out.println("Usia Saya: "+data2);
                System.out.println("Kondisi Saya: "+data3);
            }
        };
        //Menjalankan Method serta Memberikan Nilai Pada Parameter
        demo.LakukanSesuatuCoy("Viranti", 20, true);
    }
}
