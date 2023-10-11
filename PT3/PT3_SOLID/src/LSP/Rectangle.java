package LSP;

public class Rectangle implements Area {
    private int width;
    private int height;

    // public Rectangle(int width, int height) {
    // this.width = width;
    // this.height = height;
    // }

    @Override
    public int area() {
        return this.width * this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
