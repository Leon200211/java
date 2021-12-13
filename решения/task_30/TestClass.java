package task_30;


public class TestClass {
    static int num1, num2;

    public TestClass(int operand1, int operand2) {
        TestClass.num1 = operand1;
        TestClass.num2 = operand2;
    }

    public int getOperand1() {
        return num1;
    }

    public void setOperand1(int operand1) {
        TestClass.num1 = operand1;
    }

    public int getOperand2() {
        return num2;
    }

    public void setOperand2(int operand2) {
        TestClass.num2 = operand2;
    }

    public static int sum() {
        return num1 + num2;
    }
}