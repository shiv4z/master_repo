<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">

<thead>
<th>BOOK ID</th>
<th>BOOK NAME</th>
<th>BOOK PRICE</th>

</thead>
<tbody>
<c:forEach items="${bookList}" var ="obj">
 <tr>
<td>${obj.bookId}</td>
<td>${obj.bookName}</td>
<td>${obj.bookPrice}</td></br>
</tr>
</tbody>

</c:forEach>
</table>
</body>
</html>