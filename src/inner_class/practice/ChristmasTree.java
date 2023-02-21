package inner_class.practice;

import inheritance.referencing_subclass.test.assignement.C;

/**
 * Christmas tree
 * You have an outer class ChristmasTree and an inner class TreeTopper. Both classes have the field color.
 *
 * In the TreeTopper class create a method void sparkle.
 *
 * For silver tree topper and green Christmas tree the output of sparkle should be:
 *
 * Sparkling silver tree topper looks stunning with green Christmas tree!
 * In the outer class create a method void putTreeTopper with one string parameter color.
 * In this method, you should create an instance of an inner class with the parameter color, then call the method sparkle of TreeTopper.
 *
 * Please, don't use private access modifier for methods.
 */
public class ChristmasTree {
    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()
    void putTreeTopper(String color) {
        TreeTopper treeTopper = new TreeTopper(color);
        treeTopper.sparkle(this.color);
    }
    class TreeTopper {

        private String color;

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        void sparkle(String color) {
            System.out.println("Sparkling " + this.color + " tree topper looks stunning with " + color + " Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}
/*
public class ChristmasTree {
    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()

    class TreeTopper {

        private String color;

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()

    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}

 */