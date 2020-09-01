<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />

<title>Insert title here</title>
</head>
<body>
<!--  <form action="/result-page" method="post">
<h3>be'FORE Cast</h3>
Latitude: <input type="number" name="latitude" step="0.1"/>
Longitude: <input type="number" name="longitude" step="0.1"/>
<button type="submit" >Submit</button> -->
  <div class="container">
 
		<div class="jumbotron">
			<h2 class="display-3 light">be'FORE Cast</h2>
		</div>

		<form class="form-inline" action="/result-page">
			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Latitude</label> <input
					type="number" name="latitude" class="form-control" placeholder="Lat" step="any">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Longitude</label> <input
					type="number" name="longitude" class="form-control" placeholder="Long" step="any">
			</div>
			<button type="submit" class="btn btn-primary mb-2">Whether the Weather</button>
		</form>

	</div>-


</body>
</html>
