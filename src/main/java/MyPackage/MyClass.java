package MyPackage;

import java.util.Locale;

public class MyClass {
    private String inString;

    MyClass(String inString){
        this.inString = inString;
    }
    public String toUpper(){
        return inString.toUpperCase();
    }
}
