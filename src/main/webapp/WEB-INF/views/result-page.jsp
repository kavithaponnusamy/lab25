<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<title>Insert title here</title>
</head>
<body>
<h1>Weather Report</h1>
<h3>Forecast for ${cityName}</h3>
<div class="table-responsive-xl">
<table class =table>
<tr>
<th>Day1</th><th>Day2</th><th>Day3</th><th>Day4</th><th>Day5</th><th>Day6</th><th>Day7</th>
<th>Day8</th><th>Day9</th><th>Day10</th><th>Day11</th><th>Day12</th><th>Day13</th><th>Day14</th>
</tr>
<tr>
<c:forEach items="${temp.temperature}" var="temp">
<td><c:out value="${temp}"/></td>
</c:forEach>
</tr>
<tr>
<c:forEach items="${result.text}" var="result">
<td><c:out value="${result}"/></td>
</c:forEach>
</tr>
</table>
</div>
</body>
</html>