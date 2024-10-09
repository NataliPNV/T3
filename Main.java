import java.util.*;

class Calculator {


    public static int eval(String s) throws Exception {
        String[] data = s.split(" ");
        if (data.length != 3) {
            throw new Exception("throws Exception");
        }
        int a, b;
        try {
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[2]);
        } catch (NumberFormatException nfe) {
            throw new Exception("throws Exception");
        }
        if ((a < 1) || (a > 10) || (b < 1) || (b > 10)) {
            throw new Exception("throws Exception");
        }
        if (data[1].equals("+")) {
            return a + b;
        } else if (data[1].equals("-")) {
            return a - b;
        } else if (data[1].equals("*")) {
            return a * b;
        } else if (data[1].equals("/")) {
            return a / b;
        } else {
            throw new Exception("throws Exception");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println(Calculator.eval(in.nextLine()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}
