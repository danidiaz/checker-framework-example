package danisoft;

import org.checkerframework.checker.nullness.qual.NonNull;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(foo());
    }
    
    public static @NonNull Integer foo() {
        return null;
    }
}
