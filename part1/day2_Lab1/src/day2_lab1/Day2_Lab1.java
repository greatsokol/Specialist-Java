package day2_lab1;

// ASCII Table
public class Day2_Lab1 {
    private static String getSymbol(int i) {
        return switch (i) {
            case 0 -> "NUL (\\0)";
            case 1 -> "SOH";
            case 2 -> "STX";
            case 3 -> "ETX";
            case 4 -> "EOT";
            case 5 -> "ENQ";
            case 6 -> "ACK";
            case 7 -> "BEL (\\a)";
            case 8 -> "BS (\\b)";
            case 9 -> "TAB (\\t)";
            case 10 -> "LF (\\n)";
            case 11 -> "VT (\\v)";
            case 12 -> "FF (\\f)";
            case 13 -> "CR (\\r)";
            case 14 -> "SO";
            case 15 -> "ST";
            case 16 -> "DLE";
            case 17 -> "DC1";
            case 18 -> "DC2";
            case 19 -> "DC3";
            case 20 -> "DC4";
            case 21 -> "NAK";
            case 22 -> "SYN";
            case 23 -> "ETB";
            case 24 -> "CAN";
            case 25 -> "EM";
            case 26 -> "SUB";
            case 27 -> "ESC (\\e)";
            case 28 -> "FS";
            case 29 -> "GS";
            case 30 -> "RS";
            case 31 -> "US";
            case 32 -> "Space (\\s)";
            case 127 -> "Delete";
            default -> String.valueOf((char)i);
        };
    }
    
    private static void printAscii() {
        int i=0;
        int columns = 10;
        do {
            for (int j = 0; j <= columns; j++) {
                if (i > 127) break;
                System.out.printf("%3d - %-10s", i, getSymbol(i));
                i++;
            }
            System.out.println("");
        } while (i<128);
    }
    
    public static void main(String[] args) {
        printAscii();
    }
}
