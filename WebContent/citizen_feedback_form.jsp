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
		<form method="post" class="form1" name="feedbackform" action="Citizen_Response">

		<div id="basic-information" class="content-block-basic">
			<h1 align="center">Basic Information</h1>
			
				<label for="state">State</label>
				<span class="req">*</span><br><input type="text" name="state" placeholder="Enter State">
				<br><br>
				<label for="city">City</label>
				<span class="req">*</span><br><input type="text" name="city" placeholder="Enter City">
				<br><br>
				<label for="age">Age</label>
				<span class="req">*</span><br><input type="number" name="age" placeholder="Enter Your Age">
				<br><br>
				<label for="current_live">Have you been a resident of this City for atleast the past 6 months?</label>
				<span class="req">*</span>
				&nbsp;&nbsp;&nbsp;Yes<input type="radio" name="current_live1">   
				&nbsp;No<input type="radio" name="current_live1">
				<br><br>
				<label for="mobile">Would you have your mobile phone with you at this point in time?</label>
				<span class="req">*</span>
				&nbsp;&nbsp;&nbsp;Yes<input type="radio" name="mobile1">   
				&nbsp;No<input type="radio" name="mobile1">
				<br><br>
				<label for="name">Respondent Name</label>
				<span class="req">*</span><br><input type="text" name="name" placeholder="Enter Your Name">
				<br><br>
				<label for="number">Respondent Number</label>
				<span class="req">*</span><br><input type="number" name="number" placeholder="Enter Your Mobile Number">
				<br><br>
				<label for="gender">Respondent Gender</label>
				<span class="req">*</span>
				&nbsp;&nbsp;&nbsp;Male<input type="radio" name="gender1" value="M">   
				&nbsp;Female<input type="radio" name="gender1" value="F">
				<br><br><br>
				
			
		</div>

		<div  class="content-block">
			<h1 align="center" class="ques_head">Citizen Feedback</h1>
			
				<label for="q1" class="question">Q1: Are you aware that your Urban Local Body /City is participating in Swachh Survekshan 2020?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q1" value="100" required>Yes
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q1" value="0" required>No
					</div>
				<label for="q2" class="question">Q2: How many marks would you like to give to your city on the cleanliness level of your neighbourhood- On a scale of 0-10?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="0" required>0   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="20" required>1
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="40" required>2   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="60" required>3
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="80" required>4   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="100" required>5
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="120" required>6   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="140" required>7
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="160" required>8   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="180" required>9
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q2" value="200" required>10
					</div>
				<label for="q3" class="question">Q3: How many marks would you like to give to your city on the cleanliness level of your commercial/ public areas -On a scale of 0-10?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="0" required>0   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="20" required>1
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="40" required>2   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="60" required>3
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="80" required>4   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="100" required>5
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="120" required>6   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="140" required>7
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="160" required>8   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="180" required>9
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q3" value="200" required>10
					</div>
				<label for="q4" class="question">Q4: Whether you are always asked to give segregated dry and wet waste to your waste collector?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q4" value="200" required>Yes, Always
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q4" value="100" required>Yes, But Sometimes
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q4" value="0" required>Never
					</div>
				<label for="q5" class="question">Q5: Do you find road dividers in your city roads are appropriately covered with plants?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q5" value="100" required> Yes, all road dividers  
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q5" value="50" required>Not all road dividers, but greenery is visible in most of the road dividers
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q5" value="0" required>No such initiative seen or visible
					</div>
				<label for="q6" class="question">Q6: How many marks would you like to give to your city  on the cleanliness level of Public or Community toilet of your cities - On a scale of 0-10?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="0" required>0   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="20" required>1
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="40" required>2   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="60" required>3
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="80" required>4   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="100" required>5
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="120" required>6   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="140" required>7
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="160" required>8   
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="180" required>9
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q6" value="200" required>10
					</div>
				<label for="q7" class="question">Q7: Do you know the ODF status of your city ?</label>
					<span class="req">*</span>
					<div class="options">
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q7" value="50" required>Yes - its declared ODF   
						<br>
						<br>&nbsp;&nbsp;&nbsp;<input type="radio" name="q7" value="100" required>Yes, its declared and certified ODF
						<br>
						<br>&nbsp;&nbsp;&nbsp; <input type="radio" name="q7" value="50" required>No , its not ODF
						<br>
						<br>&nbsp;&nbsp;&nbsp; <input type="radio" name="q7" value="0" required>No , I am not aware
					</div>
				
					
				<input type="checkbox" name="accept" required>
				<label for="accept">Click To Proceed and Enter OTP</label><br><br><br><br>
		
				<input type="submit" value="Submit">
			
		</div>
		
		</form>

		<script src="script.js"></script>
	</body>
</html>