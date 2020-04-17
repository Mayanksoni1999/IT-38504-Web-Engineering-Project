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
				<a class="nav-active" href="home_page.jsp">Home</a>
				<a href="feedback_home_page.jsp">Feedback</a>
				<a href="wastecategorization.jsp">Waste Management</a>
				
			</div>
		</div>
		<div class="content-block">
			<img class="con-image" src="images/swachhbharat.jpg"alt="Swacch Bharat Logo">
			<marquee id="marq">Welcome To Swacch Bharat 2020. For Official website <a href="https://swachhbharatmission.gov.in/sbmcms/index.htm">Click Here</a>. For Filling the form for Swachh Survekshan <a href="feedback_home_page.jsp">Click Here</a> For Live results <a href="Result.jsp">Click Here.</a>.</marquee>
			<div class="main">
				<img class="photo" src="https://d1whtlypfis84e.cloudfront.net/guides/wp-content/uploads/2019/07/25111005/source-zeebiz.jpg" width="700px" height="300px">
				<img class="photo" src="https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2019/10/02/Pictures/ludhiana-participating-october-college-ludhiana-gurusar-thursday_f564f7b8-e50b-11e9-939f-ba4a7f73df5c.jpg" width="700px" height="300px">
				<img class="photo" src="https://lh3.googleusercontent.com/vlOIk6hPvqbom2APiEh5IkQsox5Fi_ke1MDXAaATC4pxJAHGk5dZdSAPDlVpT6B9pYuQ_rxsEAyW4qJgPYvmGaRA1wK-2ssYkOrl8gYlyFGOl_e27akfubtV6TVEFnXU5TK845Iu" width="700px" height="300px">
				<img class="photo" src="https://cdn.narendramodi.in/cmsuploads/0.72136100_1570033685_banner.png" width="700px" height="300px">
			</div>
			<script>
				var myIndex = 0;
				carousel();

				function carousel() {
				  var i;
				  var x = document.getElementsByClassName("photo");
				  for (i = 0; i < x.length; i++) {
				    x[i].style.display = "none";  
				  }
				  myIndex++;
				  if (myIndex > x.length) {myIndex = 1}    
				  x[myIndex-1].style.display = "block";  
				  setTimeout(carousel, 4000);    
				}
			</script>
			<div id="para">
				<h2 id="heading2">About SBM</h2>
				<p>To accelerate the efforts to achieve universal sanitation coverage and to put focus on sanitation, the Prime Minister of India, Shri Narendra Modi, launched the Swachh Bharat Mission on 2nd October, 2014. The Mission Coordinator shall be Secretary, Department of Drinking Water and Sanitation (DDWS), Ministry of Jalshakti with two Sub-Missions – the Swachh Bharat Mission (Gramin) and the Swachh Bharat Mission (Urban). The Mission aims to achieve a Swachh Bharat by 2019, as a fitting tribute to Mahatma Gandhi on his 150th birth anniversary.</p><br><br><br><br>
			</div>
			<div id="swacch_para">
				<h2 id="heading1">Swachh Survekshan 2020</h2>
				<ul>
					<li>World's largest cleanliness survey</li>
					<li><span class="make_larger">4370+</span> Cities to be covered</li>
					<li><span class="make_larger">28</span> days Timebound Nationwide Survey duration</li>
					<li><span class="make_larger">50 Lakhs+</span> Geotagged Photos will be captured from field</li>
					<li><span class="make_larger">5 Lakhs+</span> ULB Document Evidences to be evaluated</li>
					<li><span class="make_larger">4 Crores+</span> Citizens Engagement (Social Media and Feedback)</li>
					<li>Completely digitized and paperless survey</li>
				</ul>
			</div>
			<div>
				<iframe id="video" src="https://www.youtube.com/embed/4ejhMX4bXBY"></iframe>
			</div>
		</div>
		<script src="script.js"></script>
	</body>
</html>
