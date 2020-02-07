
package edu.escuelaing.arep.betterspring;

import edu.escuelaing.arep.betterspring.annotations.Web;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Objects of this class are responsible of the
 * initialization process of the application server
 * @author luis.benavides
 */
public class BetterSpringBoot {
    
    static public void main(String[] args){
        String className = "edu.escuelaing.arep.betterspring.ws.WebServiceHello";
        try {
            Class c = Class.forName(className);
            Method[] methods= c.getMethods();
            for(Method m: methods){
            
                if(m.isAnnotationPresent(Web.class)){
                    System.out.println("Ejecutando método" + m.getName());
                    System.out.println("en clase " + c.getName());
                    try {
                        System.out.println(m.invoke(null));
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvocationTargetException ex) {
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
