public class Parameter  <T1, T2>{ 
private T1 nama;
 private T2 ktp;

public Parameter(T1 nama, T2 ktp)
{ 
this.nama = nama;
 this.ktp = ktp;
 }
public T1 getNama() { 
return nama;
 }
public void setNama(T1 nama){
 this.nama = nama;
 }
 public T2 getKtp() {
 return ktp;
 }
public void setKtp(T2 ktp) {
 this.ktp = ktp; 
} 
}
public class Klien {
 public static void main(String[] args) {
//parameter parameterGen = new Orang("Ali");
 parameter parameterGen = new Orang<>("Ali“,130)
orangGen.setNama("Susi"); 
orangGen.setKtp(123);
System.out.println(orangGen.getNama());
 System.out.println(orangGen.getKtp());
 } }

