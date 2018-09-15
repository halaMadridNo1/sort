package ProxyPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    @Override
    public void display() {
        if (realImage ==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

}
