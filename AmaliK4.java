import java.util.Scanner;
public class AmaliK4 {
  public static void main(String args[]){
    
Scanner input=new Scanner(System.in);
int jum;
System.out.println("Nama:");
String nama=input.next();
System.out.println("bil jam sehari");
int bil=input.nextInt();
 if(bil>9);
 {System.out.println("Bilangan jam sehari tidak bole melebihi 9 jam,sila masukkan bilangan jam yang betul");
 }
 System.out.println("bil hari");
int hari=input.nextInt();
 if(hari>30);
 {
 System.out.println("Bilangan hari bekerja tidak bole melebihi 30 hari,sila masukkan bilangan hari yang betul");
 }
System.out.println("bil jam ot");
int ot=input.nextInt();
 if(ot>30);
 {
 System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul");
 }
 jum=(bil*hari*20)+(ot*15);
  
    System.out.println("Rumusan gaji bulanan:"+nama);
System.out.println("Jumlah bilangan jam bekerja:"+bil);
System.out.println("Jumlah bilangan hari bekerja:"+hari);
System.out.println("Jumlah bilangan jam lebih masa bekerja:"+ot);
System.out.println("Jumlah gaji: RM"+jum);
 }
  }


