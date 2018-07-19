package quadraticEquation;

public class Application {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -4, 3);
        double delta = quadraticEquation.getDiscriminant();

        System.out.println("The first coefficient is: " + quadraticEquation.getA());
        System.out.println("The second coefficient is: " + quadraticEquation.getB());
        System.out.println("The third coefficient is: " + quadraticEquation.getC());

        System.out.println("Program calculated delta: " + delta);

        if (delta < 0) {
            System.out.println("Equation has no any root!");
        } else if (delta == 0) {
            System.out.printf("Equation has only one root : %.2f",quadraticEquation.getRoot1());
        } else {
            System.out.println("Equation has 2 roots");
            System.out.printf("The first root: %.2f",quadraticEquation.getRoot1());
            System.out.printf("\nThe second root: %.2f",quadraticEquation.getRoot2());
        }


    }
}


