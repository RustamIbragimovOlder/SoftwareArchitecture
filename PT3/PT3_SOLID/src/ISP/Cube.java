package ISP;

public class Cube implements VolumeShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
