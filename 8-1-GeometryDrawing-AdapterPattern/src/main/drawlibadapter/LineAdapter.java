// Ryan Buck
package main.drawlibadapter;

import main.draw.GeometryDraw;
import main.draw.Point;
import main.drawlib.Line;

public class LineAdapter implements GeometryDraw {
    Line line;

    public LineAdapter(Line line) {
        this.line = line;
    }

    @Override
    public void draw(Point point1, Point point2) {
        line.plot(point1.x, point1.y, point2.x, point2.y);
    }
}
