package edu.escuelaing.arep.betterspring.ws;
import edu.escuelaing.arep.betterspring.annotations.Web;


/**
 * A simple hello web service
 *
 * @author luis.benavides
 */

public class WebServiceHello {

    @Web
    public static String hello() {

        return    "<!doctype html>" 
                + "<html lang=en>"
                + "<head>"
                + "<meta charset=utf-8>"
                + "<title>blah</title>"
                + "</head>"
                + "<body>"
                + "<p>Hello</p>"
                + "</body>"
                + "</html>";
    }

}
