import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] options = {"Linear (1 variable)", "System (2 variables)", "Quadratic (2nd degree)"};
        int choice = JOptionPane.showOptionDialog(null,
                "Choose the type of equation to solve:",
                "Equation Solver",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0: solveLinearEquation(); break;
            case 1: solveSystemOfEquations(); break;
            case 2: solveQuadraticEquation(); break;
            default: JOptionPane.showMessageDialog(null, "No equation selected.");
        }
    }

    // Giải phương trình bậc nhất: ax + b = 0
    public static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b:"));

        if (a == 0) {
            String message = (b == 0) ? "Infinite solutions." : "No solution.";
            JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Solution: x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Giải hệ phương trình bậc nhất hai ẩn
    public static void solveSystemOfEquations() {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a1:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter c1:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a2:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter c2:"));

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        String result;
        if (D == 0) {
            result = (Dx == 0 && Dy == 0) ? "Infinite solutions." : "No solution.";
        } else {
            double x = Dx / D;
            double y = Dy / D;
            result = "Solution: x = " + x + ", y = " + y;
        }
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    // Giải phương trình bậc hai: ax² + bx + c = 0
    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient c:"));

        if (a == 0) {
            solveLinearEquation(); // Nếu a = 0 thì trở thành phương trình bậc nhất
            return;
        }

        double delta = b * b - 4 * a * c;
        String result;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            result = "Two distinct roots: x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            result = "One double root: x = " + x;
        } else {
            result = "No real solutions.";
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
