
import java.util.Scanner;



public class Kahve {
   public static void main(String[] args) throws InterruptedException {

       String kahve_çeşitleri = 
               "1->Dibek Kahvesi\n" 
               + "2->Menengiç Kahvesi\n"
               + "3->Çörekotu Kahvesi\n" 
               + "4->Adana Gar Kahvesi\n" 
               + "5->Sütlü Türk Kahvesi";
       
                System.out.println(kahve_çeşitleri);
                System.out.println("Kaç Numaralı Kahveyi Almak İstersiniz ?");
             Scanner scanner = new Scanner(System.in);
    int kahve_secimi = scanner.nextInt();
    
    String seker =
            "A->Şekersiz\n"
            + "B->Az Şekerli\n"
            + "C->Orta Şekerli\n"
            + "D->Çok Şekerli";
    
                System.out.println(seker);
                System.out.println("Kahvenizin Şeker Durumunu Seçiniz:");
               scanner.nextLine();
    String seker_secimi = scanner.nextLine();
    String secim ="";
    if(seker_secimi.equals("A")){
        secim ="Şekersiz";
    }
        else if(seker_secimi.equals("B")){
            
                secim ="Az Şekerli";
                
                
          }
        else if(seker_secimi.equals("C")){
            secim = "Orta Şekerli";
    
      }
    
        else if(seker_secimi.equals("D")){
            secim = "Çok Şekerli";
            
        }
        else{
            System.out.println("Şeker seçiminizi hatalı yaptınız!");
        }
            switch(kahve_secimi){
                case 1:
                    System.out.println("Kahveniz Hazırlanıyor");
                    Thread.sleep(2000);
                    String bildirim = secim+" Dibek Kahveniz Hazır\n Afiyet Olsun";
                    System.out.println(bildirim);
                    break;
                case 2:
                    System.out.println("Kahveniz Hazırlanıyor");
                    Thread.sleep(2000);
                    String bildirim2 = secim+" Menengiç Kahveniz Hazır\n Afiyet Olsun";
                    System.out.println(bildirim2);
                    break;
                case 3:
                    System.out.println("Kahveniz Hazırlanıyor");
                    Thread.sleep(2000);
                    String bildirim3 = secim+" Çörek Otu Kahveniz Hazır\n Afiyet Olsun";
                    System.out.println(bildirim3);
                    break;
                case 4:
                    System.out.println("Kahveniz Hazırlanıyor");
                    Thread.sleep(2000);
                    String bildirim4 = secim+" Adana Gar Kahveniz Hazır\n Afiyet Olsun";
                    System.out.println(bildirim4);
                    break;
                case 5:
                    System.out.println("Kahveniz Hazırlanıyor");
                    Thread.sleep(2000);
                    String bildirim5 = secim+" Sütlü Türk Kahveniz Hazır\n Afiyet Olsun";
                    System.out.println(bildirim5);
                    break;
                    
                default:
                    System.out.println("Kahve Seçimini Hatalı Yaptınız!");
            }
    
    
    
    
    
    
    
    
    
    
    
    }
       
}
    

