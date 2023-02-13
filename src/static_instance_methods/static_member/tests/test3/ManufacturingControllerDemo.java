package static_instance_methods.static_member.tests.test3;

import java.util.Scanner;

public class ManufacturingControllerDemo {
    static int requestsCount = 0;

    public static String requestProduct(String product) {
        return String.format("%d. Requested %s", ++requestsCount, product);
    }

    public static int getNumberOfProducts() {
        return requestsCount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
