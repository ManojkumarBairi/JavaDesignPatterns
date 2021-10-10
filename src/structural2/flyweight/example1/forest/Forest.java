package structural2.flyweight.example1.forest;

import javax.swing.*;

import structural2.flyweight.example1.trees.Tree;
import structural2.flyweight.example1.trees.TreeFactory;
import structural2.flyweight.example1.trees.TreeType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}