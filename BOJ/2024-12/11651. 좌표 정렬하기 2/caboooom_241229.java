import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(bufferedReader.readLine());
	    List<Point> points = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	        String[] pointStr = bufferedReader.readLine().split(" ");
	        points.add(new Point(Integer.parseInt(pointStr[0]), Integer.parseInt(pointStr[1])));
	    }
	    Collections.sort(points);
	    StringBuilder builder = new StringBuilder();
	    for (Point point : points) {
	        builder.append(point).append("\n");
	    }
	    System.out.println(builder);
	}
}
class Point implements Comparable<Point> {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Point other) {
        if (this.y == other.y) {
            return Integer.compare(this.x, other.x);
        }
        return Integer.compare(this.y, other.y);
    }
    @Override
    public String toString() {
        return x + " " + y;
    }
}
