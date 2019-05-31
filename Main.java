/* LiudmilaPlita
 * Student#1896003
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main {

    public static void main(String[] args) throws IOException {
        ZipFile zipFile = new ZipFile("shapes.zip");
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        LinkedList<Shape> shapesList = new LinkedList<>();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            InputStream stream = zipFile.getInputStream(entry);
            Scanner scanner = new Scanner(stream);
            while (scanner.hasNext()) {
                String shapeType = scanner.nextLine();
                switch (shapeType) {
                    case "Rectangle":
                        Rectangle rectangle = new Rectangle();
                        rectangle.width = scanner.nextDouble();
                        rectangle.lenght = scanner.nextDouble();
                        shapesList.add(rectangle);
                        break;
                    case "Triangle":
                        Triangle triangle = new Triangle();
                        triangle.base = scanner.nextDouble();
                        triangle.height = scanner.nextDouble();
                        shapesList.add(triangle);
                        break;
                    case "Circle":
                        Circle circle = new Circle();
                        circle.radius = scanner.nextDouble();
                        shapesList.add(circle);
                        break;
                    case "Square":
                        Square square = new Square();
                        square.size = scanner.nextDouble();
                        shapesList.add(square);
                        break;
                }
            }
        }
        List<Shape> shapesArrayList = new ArrayList<>(shapesList);
        shapesArrayList.sort(Collections.reverseOrder());
        for (Shape shape : shapesArrayList) {
            System.out.println(shape);
        }
    }


}
