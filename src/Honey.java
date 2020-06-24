/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmanv
 */
public class Honey extends Product implements Clonable
{
private String type;
private String jarSize;

    public Honey() {
    }

    public Honey(String type, String jarSize) {
        this.type = type;
        this.jarSize = jarSize;
    }

    public Honey(String type, String jarSize, String productName, String flavour, String cost) {
        super(productName, flavour, cost);
        this.type = type;
        this.jarSize = jarSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJarSize() {
        return jarSize;
    }

    public void setJarSize(String jarSize) {
        this.jarSize = jarSize;
    }

    @Override
    public String toString() {
        return "Honey{" + "type=" + type + ", jarSize=" + jarSize + '}';
    }

    
  public Honey clone() throws CloneNotSupportedException{
        return (Honey)super.clone();
  }
}
