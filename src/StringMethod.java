public class StringMethod {

    public static void main(String[] args) {
        StringMethod stringMethod = new StringMethod();
        stringMethod.concatString();
        stringMethod.charAtString();
    }

    public void concatString() {
        String strA = "This is ";
        String strB = strA.concat("FLOWERS");
        System.out.println("1 - New string: " + strB + " = " + strA + "+ " + "FLOWERS" );
    }

    public void charAtString() {
        String strName = "Ken Dai Ca";
        char strChar = strName.charAt(4);
        System.out.println("2 - Char at position 4 of string - " + strName + " - is: " + strChar);
    }

}
