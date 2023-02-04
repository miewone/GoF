package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class Stereo {
    String place;

    public Stereo(String place){
        this.place =place;
    }

    int volume;

    public void on(){}
    public void off(){}
    public void setCd(){}
    public void setDvd(){}
    public void setRadio(){}
    public void setVolume(int volume){
        this.volume = volume;
    }
}
