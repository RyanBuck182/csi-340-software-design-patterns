// Ryan Buck
package test;

import main.draw.*;
import main.drawlib.*;
import main.drawlibadapter.*;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args) {
        DrawEngine drawEngine = new DrawEngine();
        List<GeometryDraw> drawList = new ArrayList<GeometryDraw>();

        GeoSquare square = new GeoSquare();
        GeoCircle circle = new GeoCircle();

        Line line = new Line();
        Rectangle rectangle = new Rectangle();
        LineAdapter lineDraw = new LineAdapter(line);
        RectangleAdapter rectangleDraw = new RectangleAdapter(rectangle);

        drawList.add(square);
        drawList.add(circle);
        drawList.add(lineDraw);
        drawList.add(rectangleDraw);

        drawEngine.startDrawing(drawList);
    }
}
