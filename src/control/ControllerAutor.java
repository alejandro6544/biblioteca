/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Autor;

/**
 *
 * @author dacastro
 */
public class ControllerAutor {

    public ControllerAutor() {
    }

    public boolean insertAutor(LinkedList<Autor> listaAutores) {
        boolean ins = false;

        for (int i = 0; i < listaAutores.size(); i++) {
            String sql = "INSERT INTO autores (idautores,nombreautor,apellidoautor,paisautor) VALUES ("+listaAutores.get(i).getIdautores() +", '"+ listaAutores.get(i).getNombreautor() + "', '" + listaAutores.get(i).getApellidoautor() + "', '"
                    + listaAutores.get(i).getPaisautor() + "')";
            Autor objA = new Autor();
            ins = objA.insert(sql);
        }

        return ins;
    }

}
