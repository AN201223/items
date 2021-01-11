package javafx;

public class Item {

    private String name;
    private String material;
    private String prevOwner;

    public Item(String name, String material, String prevOwner) {
        this.name = name;
        this.material = material;
        this.prevOwner = prevOwner;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getPrevOwner() {
        return prevOwner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrevOwner(String prevOwner) {
        this.prevOwner = prevOwner;
    }


    
}
