<%@ page import="java.util.ArrayList" %>
<%@ page import="com.unoveo.pages.*" %>
<!DOCTYPE html>
<html lang="en">
<table border="1">

			<tr>
				<th>#</th>
				<th>fname</th>
				<th>lname</th>
				<th>city</th>
				<th>age</th>
			</tr>

			<%

				ArrayList<Register> list = (ArrayList)request.getAttribute("Register");
				int i=1;

			%>

			<%
			    if(list!=null){
				for ( Register register :list) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=register.getfname()%></td>
				<td><%=register.getlname()%></td>
				<td><%=register.getcity()%></td>
				<td><%=register.getage()%></td>
			</tr>
			<%
				}
				}
			%>

	</table>


</html>