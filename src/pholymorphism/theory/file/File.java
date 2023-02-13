package pholymorphism.theory.file;

/**
 * Polymorphism within a class hierarchy
 * The same thing works with methods that are used only within a hierarchy and are not accessible from the outside.
 *
 * In the following example, we have a hierarchy of files.
 * The parent class File represents a description of a single file in the file system.
 * It has a subclass named ImageFile. It overrides the method getFileInfo of the parent class.
 *
 * The parent class has a public method printFileInfo and a protected method getFileInfo.
 * The second method is overridden in the subclass, but the subclass doesn't override the first method.
 */
public class File {
    public static void main(String[] args) {
        // create an instance of ImageFile and assign it to a variable of File.
        byte[] someBytes = {1, 5, 50};
        File img = new ImageFile("/path/to/file/img.png", 480, 640, someBytes); // assigning an object

        // call the method printFileInfo, it invokes the overridden version of the method getFileInfo.
        img.printFileInfo(); // Image: /path/to/file/img.png, width: 480, height: 640
        // run-time polymorphism allows you to invoke an overridden method of a subclass having a reference to the base class.
    }
    protected String fullName;

    // constructor with a single parameter

    public File(String fullName) {
        this.fullName = fullName;
    }


    // getters and setters


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void printFileInfo() {
        String info = this.getFileInfo(); // here is polymorphic behavior!!!
        System.out.println(info);
    }

    protected String getFileInfo() {
        return "File: " + fullName;
    }
}
class ImageFile extends File {

    protected int width;
    protected int height;
    protected byte[] content;

    // constructor, obligatoire
    public ImageFile(String fullName, int width, int height, byte[] content) {
        super(fullName);
        this.width = width;
        this.height = height;
        this.content = content;
    }

    // getters and setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    protected String getFileInfo() {
        return String.format("Image: %s, width: %d, height: %d", fullName, width, height);
    }
}
