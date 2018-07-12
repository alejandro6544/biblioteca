/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Libro;

/**
 *
 * @author dacastro
 */
public class ControllerLibros {

    public ControllerLibros() {
    }

    public boolean insertLibro(Libro objL) {
        boolean ins = false;
        String sql="INSERT INTO libros VALUES ('"+objL.getIdlibro()+"', '"+objL.getNombrelibro()+"', '"+
                objL.getNumpaginaslibro()+"', '"+objL.getPreciolibro()+"', '"+objL.getAnioedicionlibro()+"', '"+objL.getNumEdicion()+"')";
        Libro objL1 = new Libro();
        ins = objL1.insertLibro(sql,objL);

        return ins;
    }

}
