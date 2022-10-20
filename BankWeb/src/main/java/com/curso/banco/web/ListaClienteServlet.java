package com.curso.banco.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.banco.servicios.CustomerService;

import com.mybank.domain.Customer;

/**
 * Servlet implementation class ListaClienteServlet
 */
public class ListaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListaClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HOLA ESTOY EN EL INICIO DOGET DE LISTA CLIENTES");
	
		// recuperar todos los clientes
				CustomerService service = new CustomerService();
				List<Customer> lista = service.dameTodosLosClientes();
				
				// añadir el atributo lista con todos los productos  a la request
				request.setAttribute("lista", lista);
				
				// despachar la peticion a lista-productos.jsp
				RequestDispatcher rd = request.getRequestDispatcher("lista-cliente.jsp");
				rd.forward(request, response);
	
				System.out.println("HOLA ESTOY EN EL DOGET DE LISTA CLIENTES");
	}

	
	

}
