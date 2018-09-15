package ProxyPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {

    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
