/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.LibroPorAutor;

/**
 *
 * @author dacastro
 */
public class ControllerLibroPorAutor {

    public ControllerLibroPorAutor() {
    }

    public boolean asociarAutorLibro(String codL, int[] idsAutores) {
        boolean ins = false;
        LibroPorAutor objlpa=new LibroPorAutor();
        String sql="";
        for (int i = 0; i < idsAutores.length; i++) {
            sql="INSERT INTO libroporautor (idlibrolp,idautorlp)"+
                    "Values ('"+codL+"', "+idsAutores[i]+")";
            ins=objlpa.insert(sql);
        }
        return ins;
    }
    
}
