package ControlFlowStatements;

public class LabeledContinueStatement {
  public static void main(String[] args) {

    String searchMe = "This is a search me string";
    String substring = "string";
    boolean foundIt = false;

    int max = searchMe.length() - substring.length();

  test:
    for (int i = 0; i <= max; i++) {
        int n = substring.length();
        int j = i;
        int k = 0;
        while (n-- != 0) {
            if (searchMe.charAt(j++) != substring.charAt(k++)) {
                continue test;
            }
        }
        foundIt = true;
            break test;
    }
    System.out.println(foundIt ? "Found it" : "Didn't find it");
}
}
