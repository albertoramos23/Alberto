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
 * Servlet implementation class ListaClientesServlet
 */
public class ListaClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    CustomerService customerService = new CustomerService();
	
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public ListaClientesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Customer> listaCustomer = customerService.dameTodosLosClientes();
		
		request.setAttribute("lista", listaCustomer);
		
		RequestDispatcher rd = request.getRequestDispatcher("prueba.jsp");
		rd.forward(request, response);
	}

	
	
	
	
	
	
	
	
	}


