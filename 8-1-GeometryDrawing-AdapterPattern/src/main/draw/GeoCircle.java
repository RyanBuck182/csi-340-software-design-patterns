// Ryan Buck
package main.draw;

public class GeoCircle implements GeometryDraw {
    @Override
    public void draw(Point startPoint, Point endPoint) {
        System.out.println("Circle::draw() " + startPoint + " " + endPoint);
    }
}
