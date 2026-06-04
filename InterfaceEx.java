interface Camera{
    void clickPhoto();
}
interface MusicPlayer{
    void playMusic();
}
class Phone implements Camera,MusicPlayer
{
    public void clickPhoto(){
        System.out.println("Photo taken from mobile");
    }
    public void playMusic(){
        System.out.println("Music playing in phone");
    }
}
public class InterfaceEx
{
    public static void main(String[] args) {
        Phone P = new Phone();
        P.clickPhoto();
        P.playMusic();
    }
}
