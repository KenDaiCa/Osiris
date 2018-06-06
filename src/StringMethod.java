public class StringMethod {

    public void concatString() {
        String strA = "This is demo ";
        strA = strA.concat("- Ken");
        System.out.println("New string is: " + strA);
    }

    public void charAtString() {
        String strName = "Ken Dai Ca";
        char strChar = strName.charAt(4);
        System.out.println("char at position 4 is: " + strChar); //[0, , n-1]
    }

    public void arrList() {

    }

    public static void main(String[] args) {
        StringMethod stringMethod = new StringMethod();
        System.out.println("Hello word");
        stringMethod.concatString();
        stringMethod.charAtString();
    }
}
