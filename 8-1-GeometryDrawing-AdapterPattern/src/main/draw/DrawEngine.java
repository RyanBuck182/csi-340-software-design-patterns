// Ryan Buck
package main.draw;

import java.util.List;

public class DrawEngine {
    final Point startPoint = new Point(3, 5);
    final Point endPoint = new Point(7, 9);

    public void startDrawing(List<GeometryDraw> drawList) {
        for (GeometryDraw drawing : drawList) {
            drawing.draw(startPoint, endPoint);
        }
    }
}
