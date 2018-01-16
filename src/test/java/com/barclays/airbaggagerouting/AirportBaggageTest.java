/*package com.barclays.airbaggagerouting;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import com.barclays.airportbaggagerouting.Main;
import junit.framework.TestCase;

public class AirportBaggageTest extends TestCase {

    public void testMain(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        AirportBaggage.main(new String [] {"src/test/data/InputTestData.txt"});
        String output=baos.toString();
        assertEquals("0001 Concourse_A_Ticketing A5 A1 : 11\n" +
                "0002 A5 A1 A2 A3 A4 : 9\n" +
                "0003 A2 A1 : 1\n" +
                "0004 A8 A9 A10 A5 : 6\n" +
                "0005 A7 A8 A9 A10 A5 BaggageClaim : 12\n",output);
    }
}
*/