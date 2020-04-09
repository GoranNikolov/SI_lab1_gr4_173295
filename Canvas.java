import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Point> points = new ArrayList<Point>();
    int n;

    public Canvas(List<Point> points, int n) {
        this.points = points;
        this.n = n;
    }
    public boolean addPoint (Point x){
        return points.add(x);
    }
    public boolean removePoint (Point x){
        return points.remove(x);
    }
}
