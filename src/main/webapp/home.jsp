<!DOCTYPE html>
<html lang="en">
<table border="1">
		<thead>
			<tr>
				<th>#</th>
				<th>User Name</th>
				<th>Password</th>
				<th>Email</th>
				<th>Display Name</th>
			</tr>
		</thead>
		<tbody>
			<%
				int i = 1;
				List<User> list = (List) request.getAttribute("list");
			%>

			<%
				for (User u : list) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=u.getUserName()%></td>
				<td><%=u.getPassword()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getDisplayName()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>


</html>