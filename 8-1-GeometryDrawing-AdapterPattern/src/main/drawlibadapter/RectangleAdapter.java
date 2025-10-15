// Ryan Buck
package main.drawlibadapter;

import main.draw.GeometryDraw;
import main.draw.Point;
import main.drawlib.Rectangle;

public class RectangleAdapter implements GeometryDraw {
    Rectangle rect;

    public RectangleAdapter(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public void draw(Point point1, Point point2) {
        int width = Math.abs(point2.x - point1.x);
        int height = Math.abs(point2.y - point1.y);

        rect.produce(point1.x, point1.y, width, height);
    }
}
