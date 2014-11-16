/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanutilstest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.Converter;

/**
 *
 * @author jgshun
 */
public class DateConverter implements Converter{
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Object convert(Class type, Object o) {
        System.err.println("=============================="+o);
        try {
            return fmt.parse((String)o);
        } catch (ParseException ex) {
            Logger.getLogger(DateConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
