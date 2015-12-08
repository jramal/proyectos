/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author YESM
 */
/** Mascara para fecha/hora a nuestro gusto */
public class FormatoFecha extends MaskFormatter {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Se construye con el patrón deseado */
    public FormatoFecha() throws ParseException {
        // Las # son cifras y representa "dd/mm/yy hh:mm:ss"
        super("##-##-####");
    }
    /** Una clase adecuada para convertir Date a String y viceversa de forma cómoda. Puedes ver cómo se hace el patrón "dd/MM/yy kk:mm:ss" en la API.
    El patrón que pongamos aquí debe cuadrar correctamente con la máscara que hemos puesto en el constructor */
    private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

    /** Convierte el texto del editor en un Date */
    @Override
    public Object stringToValue(String text) throws ParseException {
        return formato.parseObject(text);
    }

    /** Redibe un Date o null y debe convertirlo a texto que cumpla el patrón indicado anteriormente */
    @Override
    public String valueToString(Object value) throws ParseException {
        if (value instanceof Date) {
            return formato.format((Date) value);
        }
        return formato.format(new Date());
    }
}