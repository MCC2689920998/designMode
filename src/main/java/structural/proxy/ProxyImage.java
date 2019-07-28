package structural.proxy;

import structural.proxy.impl.RealImage;

/**
 * @Author MCC
 * @Create 2019/7/28 10:55
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
