package org.olamy.maven.course;

/**
 * Hello world!
 */
public class HelloWorld
{

    private String who;

    public HelloWorld()
    {
        this.who = "World";
    }

    public HelloWorld( String who )
    {
        this.who = who;
    }

    public String sayHello()
    {
        return "Hello " + ( this.who == null ? "World" : this.who );
    }

    public static void main( String[] args )
    {
        HelloWorld helloWorld = new HelloWorld( args.length > 0 ? args[0] : null );
        System.out.println( helloWorld.sayHello() );
    }
}
