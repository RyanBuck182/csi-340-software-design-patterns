// Ryan Buck
package main.draw;

public class GeoSquare implements GeometryDraw {
    @Override
    public void draw(Point startPoint, Point endPoint) {
        System.out.println("Square::draw() " + startPoint + " " + endPoint);
    }
}
