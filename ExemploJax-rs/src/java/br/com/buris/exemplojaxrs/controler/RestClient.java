/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buris.exemplojaxrs.controler;

import br.com.buris.exemplojaxrs.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Luiz Henrique Buris
 */
@Path("resources")
public class RestClient {

    @GET
    @Path("/cliente")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public List<Cliente> getCliente() {
        
      return  getListCliente();
    }

    public List<Cliente> getListCliente() {
        List<Cliente> lc = new ArrayList<>();

        Cliente c1 = new Cliente();
        c1.setNome("clente1");
        c1.setEmail("clente1@");
        lc.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("clente2");
        c2.setEmail("clente2@");
        lc.add(c2);
        return lc;
    }

}
