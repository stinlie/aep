package edu.berkeley.aep;

/*public class Reverse {

    // reverses a string of letters using recursion

    private String string = "";

    public Reverse(String string) {
        this.string = string;
        result = recursiveReverse(string); //initial question
    }

    public String result() {
        result;

    }
    private String recursiveReverse(String workingString){
        if (workingString.isEmpty()){
            return "";
        }
        else if (workingString.length() == 1){
            return workingString;
        }
        else {
            return recursiveReverse((workingString.substring(1)) + workingString.substring(0,1));
        }
    }
}*/

public class Reverse {


    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0); // recursion
    }

    public static void main(String[] args) {
        String str = "Hello";
        String reversedString = reverseString(str);
        System.out.println("The reversed string is: " + reversedString);
    }
}
