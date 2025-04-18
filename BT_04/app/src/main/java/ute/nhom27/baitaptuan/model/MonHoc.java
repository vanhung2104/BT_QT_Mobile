package ute.nhom27.baitaptuan.model;

public class MonHoc {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public MonHoc(String name, int pic) {
        this.name = name;
        this.pic = pic;
    }

    String name;
    int pic;

}
