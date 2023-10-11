package LSP;

public class Square extends Rectangle {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return this.width ^ 2;
    }

}
