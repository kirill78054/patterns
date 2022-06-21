package pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/*
Легковес(Flyweight)

Позволяет вместить бóльшее количество объектов в отведён-
ную оперативную память. Легковес экономит память, разделяя
общее состояние объектов между собой, вместо хранения оди-
наковых данных в каждом объекте.
*/
public class Forest {

    private final List<Tree> treeList = new ArrayList<>();

    public void planTree(int x, int y, String name, String color) {
        TreeType treeType = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    public int getCacheSize() {
        return TreeFactory.getCacheSize();
    }

    public void draw() {
        treeList.forEach(Tree::draw);
    }

}
