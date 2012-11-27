package org.olamy.maven.course;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple HelloWorld.
 */
public class HelloWorldTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     *
     */
    public void testWorld()
    {
        HelloWorld helloWorld = new HelloWorld(  );
        assertEquals( "Hello World", helloWorld.sayHello() );
    }

    public void testJohn()
    {
        HelloWorld helloWorld = new HelloWorld( "John" );
        assertEquals( "Hello John", helloWorld.sayHello() );
    }
}
