import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        // Nhập số thứ nhất
        String strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        // Nhập số thứ hai
        String strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        // Chuyển đổi chuỗi sang số thực (double)
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Hiển thị hộp thoại để chọn phép toán
        String[] options = {"Sum (+)", "Difference (-)", "Product (*)", "Quotient (/)"};
        int choice = JOptionPane.showOptionDialog(null,
                "Choose an operation:", "Select Operation",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        String resultMessage = "You've entered: " + num1 + " and " + num2 + "\n";

        // Thực hiện phép toán dựa trên lựa chọn của người dùng
        switch (choice) {
            case 0: // Tổng
                resultMessage += "Sum: " + (num1 + num2);
                break;
            case 1: // Hiệu
                resultMessage += "Difference: " + (num1 - num2);
                break;
            case 2: // Tích
                resultMessage += "Product: " + (num1 * num2);
                break;
            case 3: // Thương (kiểm tra chia cho 0)
                resultMessage += (num2 != 0) ? "Quotient: " + (num1 / num2) : "Error: Cannot divide by zero!";
                break;
            default:
                resultMessage += "No operation selected.";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, resultMessage,
                "Calculation Result", JOptionPane.INFORMATION_MESSAGE);

        // Thoát chương trình
        System.exit(0);
    }
}
