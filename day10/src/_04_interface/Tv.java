package _04_interface;
/*
  -interface를 상속 받을 때 키워드는 implemnets
  -다중상속 가능
 */

public class Tv implements RemoteControl {
   private int volume;
   
   @Override
   public void turnOn() {
      System.out.println("Tv를 켭니다");

   }

   @Override
   public void turnOff() {
      System.out.println("Tv를 끕니다");

   }

   @Override
   public void setVolume(int volume) {
      if(volume > RemoteControl.MAX_VOLUME) 
         this.volume = RemoteControl.MAX_VOLUME;
      else if (volume < RemoteControl.MIN_VOLUME)
         this.volume = RemoteControl.MIN_VOLUME;
      else
         this.volume = volume;
      
      System.out.println("현재 음량 : " + this.volume);

   }
   @Override
   public void search(String msg) {
      System.out.println("msg");
   }

   @Override
   public void search1(String msg) {
      // TODO Auto-generated method stub
      
   }

}
