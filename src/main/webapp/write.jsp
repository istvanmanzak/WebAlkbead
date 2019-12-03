<%@page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset-UTF8">
<title>Beteg felvétele</title>
</head>
<body>

		<form action="addBeteg" id="form3">
				<label for="taj">Tajszám: </label>
				<input type="text" name="taj" id="taj"><br>
				<label for="vnev">Vezetéknév: </label>
				<input type="text" name="vnev" id="vnev"><br>
				<label for="knev">Keresztnév: </label>
				<input type="text" name="knev" id="knev"><br>
				<label for="irsz">Irányítószám: </label>
				<input type="number" name="irsz" id="irsz"><br>
				<label for="varos">Város: </label>
				<input type="text" name="varos" id="varos"><br>
				<label for="utca">Utca: </label>
				<input type="text" name="utca" id="utca"><br>
				<label for="hsz">Házszám: </label>
				<input type="number" name="hsz" id="hsz"><br>
				<label for="tel">Telefonszám: </label>
				<input type="number" name="tel" id="tel"><br>
				<button type="submit" form="form3">Bevitel</button>
		</form>

</body>
</html>