package ChangeNumber.src.common;

import java.util.Scanner;
import ChangeNumber.src.model.Number;

public class Algorithm {
    Scanner sc = new Scanner(System.in);

    // change decimal to binary
    public void decimalToBinary(String inputValue) {
        System.out.print("Enter decimal number: ");
        int decimalNumber = Integer.parseInt(inputValue);
        Number number = new Number();
        number.setDecimalNumber(decimalNumber);
        StringBuilder binaryNumber = new StringBuilder();

        if (decimalNumber == 0) {
            binaryNumber.append(0);
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryNumber.insert(0, remainder);
                decimalNumber /= 2;
            }
        }

        System.out.println("Binary number: " + binaryNumber.toString());
    }

    public void deciamlToHexadecimal(String inputValue) {
        System.out.print("Enter decimal number: ");
        int decimalNumber = Integer.parseInt(inputValue);
        Number number = new Number();
        number.setDecimalNumber(decimalNumber);
        StringBuilder hexadecimalNumber = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            char hexDigit;

            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder);
            } else {
                hexDigit = (char) ('A' + remainder - 10);
            }

            hexadecimalNumber.insert(0, hexDigit);
            decimalNumber /= 16;
        }

        System.out.println("Hexadecimal number: " + hexadecimalNumber.toString());
    }

    // change binary to decimal
    public void binaryToDecimal(String inputValue) {
        Number number = new Number();
        number.setBinaryNumber(inputValue);
        int decimalNumber = 0;
        int length = inputValue.length();

        for (int i = length - 1; i >= 0; i--) {
            char binaryDigit = inputValue.charAt(i);
            if (binaryDigit == '1') {
                decimalNumber += Math.pow(2, length - 1 - i);
            } else if (binaryDigit != '0') {
                System.out.println("Invalid binary input.");
                return;
            }
        }

        System.out.println("Decimal number: " + decimalNumber);
    }

    // change binary to hexadecimal
    public void binaryToHexadecimal(String inputValue) {
        String hexadecimalNumber = "";
        Number number = new Number();
        number.setBinaryNumber(inputValue);

        String[] binaryToHexTable = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };

        int length = inputValue.length();

        while (length % 4 != 0) {
            inputValue = "0" + inputValue;
            length++;
        }

        for (int i = 0; i < length; i += 4) {
            String fourBits = inputValue.substring(i, i + 4);
            for (int j = 0; j < binaryToHexTable.length; j++) {
                if (fourBits.equals(binaryToHexTable[j])) {
                    if (j < 10) {
                        hexadecimalNumber += j;
                    } else {
                        hexadecimalNumber += (char) ('A' + j - 10);
                    }
                    break;
                }
            }
        }

        System.out.println("Hexadecimal number: " + hexadecimalNumber);
    }

    // change hexadecimal to decimal
    public void hexadecimalToDecimal(String inputValue) {
        Number number = new Number();
        number.setHexNumber(inputValue);
        int decimalNumber = 0;
        int length = inputValue.length();

        for (int i = 0; i < length; i++) {
            char hexChar = inputValue.charAt(i);
            int digitValue;

            if (hexChar >= '0' && hexChar <= '9') {
                digitValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                digitValue = 10 + (hexChar - 'A');
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                digitValue = 10 + (hexChar - 'a');
            } else {
                System.out.println("Invalid hexadecimal input.");
                return;
            }

            decimalNumber = decimalNumber * 16 + digitValue;
        }

        System.out.println("Decimal number: " + decimalNumber);
    }

    // change hexadecimal to binary
    public void hexadecimalToBinary(String inputValue) {
        Number number = new Number();
        number.setHexNumber(inputValue);
        StringBuilder binaryNumber = new StringBuilder();
        int length = inputValue.length();

        for (int i = 0; i < length; i++) {
            char hexChar = inputValue.charAt(i);
            int digitValue;

            if (hexChar >= '0' && hexChar <= '9') {
                digitValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                digitValue = 10 + (hexChar - 'A');
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                digitValue = 10 + (hexChar - 'a');
            } else {
                System.out.println("Invalid hexadecimal input.");
                return;
            }

            for (int j = 3; j >= 0; j--) {
                int bit = (digitValue >> j) & 1;
                binaryNumber.append(bit);
            }
        }

        System.out.println("Binary number: " + binaryNumber.toString());
    }

    public void inputBase() {
        System.out.println("Choose the base for input:");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int inputBase = sc.nextInt();
    
        System.out.println("Choose the base for output:");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int outputBase = sc.nextInt();
    
        sc.nextLine();
    
        String inputValue;
        
        switch (inputBase) {
            case 1:
                System.out.print("Enter binary number: ");
                inputValue = sc.nextLine();
                break;
            case 2:
                System.out.print("Enter decimal number: ");
                inputValue = Integer.toString(sc.nextInt());
                break;
            case 3:
                System.out.print("Enter hexadecimal number: ");
                inputValue = sc.nextLine();
                break;
            default:
                System.out.println("Invalid input base choice.");
                return;
        }
    
        switch (outputBase) {
            case 1:
                if (inputBase == 2) {
                    decimalToBinary(inputValue);
                } else if (inputBase == 3) {
                    hexadecimalToBinary(inputValue);
                } else {
                    System.out.println("No more");
                }
                break;
            case 2:
                if (inputBase == 1) {
                    binaryToDecimal(inputValue);
                } else if (inputBase == 3) {
                    deciamlToHexadecimal(inputValue);
                } else {
                    System.out.println("No more");
                }
                break;
            case 3:
                if (inputBase == 1) {
                    binaryToHexadecimal(inputValue);
                } else if (inputBase == 2) {
                    hexadecimalToDecimal(inputValue);
                } else {
                    System.out.println("No more");
                }
                break;
            default:
                System.out.println("Invalid output base choice.");
                return;
        }
    }
    

    public static void main(String[] args) {
        Algorithm alg = new Algorithm();
        alg.inputBase();
    }
}
