 
<%
String message=(String)session.getAttribute("message");
if(message!=null){
	
	%>
	
<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=message %></strong> You should check in on some of those fields below.
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>

<%
	session.removeAttribute("message");
}
%>