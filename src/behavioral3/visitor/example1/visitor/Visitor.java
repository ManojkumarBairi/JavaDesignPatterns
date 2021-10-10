package behavioral3.visitor.example1.visitor;

import behavioral3.visitor.example1.shapes.Circle;
import behavioral3.visitor.example1.shapes.CompoundShape;
import behavioral3.visitor.example1.shapes.Dot;
import behavioral3.visitor.example1.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}