<%-- 
    Document   : veiculos
    Created on : 11/05/2021, 10:52:44
    Author     : Portes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="paginaerro.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    

        <%
           String chassis_passeio, placa_passeio, combustivel_passeio,
                   passageiro_passeio_txt,automatico_passeio,modelo;
           int passageiro_passeio;
          
           
           modelo = request.getParameter("modelo");
           chassis_passeio = request.getParameter("chassis");
           placa_passeio = request.getParameter("placa");
           combustivel_passeio = request.getParameter("combustivel");
           passageiro_passeio_txt = request.getParameter("passageiro");
           passageiro_passeio = Integer.parseInt(passageiro_passeio_txt);
           automatico_passeio = request.getParameter("automatico");
           
           out.println("Veiculo Passeio:</br>");
           out.println("- Modelo: "+modelo+"</br>");
           out.println("- Chassis: "+chassis_passeio+"</br>");
           out.println("- Placa: "+placa_passeio+"</br>");
           out.println("- Combustivel: "+combustivel_passeio+"</br>");
           out.println("- Passageiro: "+passageiro_passeio+"</br>");
           out.println("- Automatico: "+automatico_passeio+"</br></br>");
           
           %>
        
           
            
 
          
    
</html>
