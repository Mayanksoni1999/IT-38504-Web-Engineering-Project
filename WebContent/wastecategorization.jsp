<!DOCTYPE html>
<html>
	<head>
		<title>Swachh Survekshan</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" media="screen and (min-width: 840px)" href="style.css">
		<link rel="stylesheet" media="screen and (max-width: 840px)" href="style-screenmax840px.css">
		<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
	</head>

	<body>
		<div id="nav" class="nav">
			<img class="nav-logo" src="images/logo.png" alt="Logo">
			<span class="nav-menuopt" onclick="toggleMenu()">
				<img type="image/svg+xml" src="icons/menuopen.svg" width="25" height="25" />
			</span>
			<div class="nav-links">
				<a href="home_page.jsp">Home</a>
				<a href="feedback_home_page.jsp">Feedback</a>
				<a class="nav-active" href="wastecategorization.jsp">Waste Management</a>
			</div>
		</div>
		<div class="content-block">
			<center><h1>
				<embed type="image/svg+xml" src="icons/bluebin.svg" width="50" height="50" /> 
				Gila Kachra / Bio-Degradable Waste
			</h1></center>
			<div id="bio-photos" class="img-grid"></div>
			<br>
			<center><h1>
				<embed type="image/svg+xml" src="icons/greenbin.svg" width="50" height="50" /> Sukha Kachra / Non Bio-Degradable Waste
			</h1></center>
			<div id="nonbio-photos" class="img-grid"></div>

			<img id="gilasukha-img" src="images/gilasukha.jpg" alt="gilasukha">
		</div>
		<script src="script.js"></script>
	</body>
</html>
