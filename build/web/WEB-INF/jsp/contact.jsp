<%-- 
    Document   : contact
    Created on : 27/11/2017, 19:07:11
    Author     : Adriano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Contact Manager</h2>
        <form method="post" action="iniciando">
            <table>
            <tr>
                <td><label path="firstname">Nome</label></td>
                <td><input name="firstname" id="firstname"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Contact"/>
                </td>
            </tr>
        </table> 

        </form>
    </body>
</html>
