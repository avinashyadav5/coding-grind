class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int plus1 = num1.indexOf('+');
        int plus2 = num2.indexOf('+');
        int a = Integer.parseInt(num1.substring(0, plus1));
        int b = Integer.parseInt(num1.substring(plus1 + 1, num1.length() - 1));
        int c = Integer.parseInt(num2.substring(0, plus2));
        int d = Integer.parseInt(num2.substring(plus2 + 1, num2.length() - 1));
        
        int real = a * c - b * d;
        int imag = a * d + b * c;

        return real + "+" + imag + "i";
    }
}