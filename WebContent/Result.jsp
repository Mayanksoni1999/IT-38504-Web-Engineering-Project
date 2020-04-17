<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen and (min-width: 840px)" href="style.css">
<link rel="stylesheet" media="screen and (max-width: 840px)" href="style-screenmax840px.css">
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}
</style>

</head>

<body>
	<center><h1>Live Rankings Of Swachh Survekshan</h1></center>
	<br>
	<br>
	<h3>For Viewing results of Swachh Survekshan</h3>
	<form action="Result_Processing" method="post">
		<input type="submit" value="Click Here">
	</form>

	<%-- <c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if> --%>

	<%!public int index = 1;%>

	<c:if test="${not empty ranks}">
		<center>
		<table>
			<tr>
				<th>Rank</th>
				<th>City</th>
				<th>Score</th>
			</tr>
			<c:forEach var="rank" items="${ranks}"  varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
					<td>${rank.key}</td>
					<td>${rank.value}</td>
				</tr>
			</c:forEach>
		</table>
		</center>
	</c:if>

</body>
</html>