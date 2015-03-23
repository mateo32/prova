/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat12uf3;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mateo
 */
public class EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL connection = new URL("http://www.puigcerda.cat/policialocal/gencat.gif");
        long ultimModificat = 12555;
        System.out.println(ultimModificat);
        Map mapa = connection.openConnection().getHeaderFields();
        Iterator iterator = mapa.keySet().iterator();

        while (iterator.hasNext()) {
            String thing = (String) iterator.next();
            List<String> string = (List<String>) mapa.get(thing);
            for (int i = 0; i < string.size(); i++) {
                System.out.println(string.get(i));

            }

        }
        String name="http";
        System.out.println(connection.openConnection().getHeaderField(name));

    }
}
