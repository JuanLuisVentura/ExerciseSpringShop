<%! static int quantity = 10; %>

<% if (request.getParameter("remove") != null) { 
	--quantity; %>
	<%= quantity %>

<% } else if (request.getParameter("add") != null) { 
	++quantity; %>
	<%= quantity %>

<% } else { %>
	Voy a a�adir el producto <%= request.getParameter("idItem") %>
<% } %>