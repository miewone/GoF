package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class GarageDoor {
    String place;
    public GarageDoor(String place){
        this.place = place;
    }
    public void up(){
        System.out.println("문이 열리네요 그대가 들어오죠~");
    }
    public void down(){}
    public void stop(){}
    public void lightOn(){
        System.out.println("문이 열리네요~ 그대가 들어오죠!");
    }
    public void lightOff(){}
}
