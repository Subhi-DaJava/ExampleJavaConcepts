package out_exemple.parent_child;

import java.util.logging.Logger;

public class Child {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Child.class.getName());
        Parent parent = new Parent();
        logger.info("Number: " + parent.number);
        logger.info("Text: " + parent.text);
    }
}
