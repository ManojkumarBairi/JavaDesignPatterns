package behavioral3.visitor.example1.shapes;

import behavioral3.visitor.example1.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}