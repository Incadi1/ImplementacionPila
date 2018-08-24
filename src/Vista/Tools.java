
package Vista;

import Data.Persona;
import Model.OperacionesPila;
import Model.Pila;

public class Tools {
       public static String convertirPilaAHtml(Pila<Persona> Personas) {
        StringBuilder sb = new StringBuilder("<html>");
        Pila<Persona> q = OperacionesPila.duplicar(Personas);

        sb.append("<noscript>").append("</noscript>");

        if (!q.estaVacio()) {
            sb.append("<table align=\"center\" border=\"2\">");
//            sb.append("<tr><td>Nombre</td><td>Indentificacion</td><td>Edad</td></tr>");
            do {
//                Persona e = q.desapilar();
                sb.append("<tr><td>");
             
//                sb.append(e.getNombre()).append("</td>");
//                sb.append("<td>").append(e.getId()).append("</td>");
//                sb.append("<td>").append(e.getEdad()).append("</td>");
                sb.append("</td></tr>");
            } while (!q.estaVacio());
            sb.append("</table>");
        } else {
            sb.append("<h1 align=\"center\">").append("Pila Vacia").append("</h1>");
        }

        sb.append("</html>");

        return sb.toString();
    }
}
