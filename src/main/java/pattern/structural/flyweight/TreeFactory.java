package pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    private static final List<TreeType> TREE_TYPES_CACHE = new ArrayList<>();

    public static TreeType getTreeType(String name, String color) {
        return TREE_TYPES_CACHE.stream()
                .filter(treeType -> treeType.equals(name, color))
                .findFirst().orElseGet(() -> {
                    TreeType treeType = new TreeType(name, color);
                    TREE_TYPES_CACHE.add(treeType);
                    return treeType;
                });
    }

    public static int getCacheSize() {
        return TREE_TYPES_CACHE.size();
    }

}
