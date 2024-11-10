import java.util.*;
class a extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("the core 1"+i);
            
            try{
                Thread.sleep(10);

            }
            catch(InterruptedException e){
                
                e.printStackTrace();
            }
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("the core 2"+i);
            try{
                Thread.sleep(10);

            }
            catch(InterruptedException e){
                
                e.printStackTrace();
            }
        }
    }
}
public class MyThread{
    public static void main(String[]args){
        a a1=new a();
        b b1=new b();
        a1.start();
        b1.start();
    }
}