<!DOCTYPE html>
<html>
	<head>
		<title>Swachh Survekshan</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen and (min-width: 840px)" href="style.css">
        <link rel="stylesheet" media="screen and (max-width: 840px)" href="style-screenmax840px.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
		<style>
		
            .childbox{
                height: 200px;
                width: 200px;
                border: 5px solid #FB09D4;
                text-align: center;
                font-size: 22px;
                font-weight: bold;
                transition-timing-function: linear;
                transition-duration: 1s;

                background: linear-gradient(to left, #ff99cc 0%, #ffff99 100%);
            }
            .childbox:hover{
        
                font-size: 25px;
            }
            .boxcontainer{
                margin-left: 500px;
                margin-top: 200px;
            }
            a{
                color: #FB09D4;
            }
            
		</style>
	</head>

	<body>
<div id="nav" class="nav">
            <img class="nav-logo" src="images/logo.png" alt="Logo">
            <span class="nav-menuopt" onclick="toggleMenu()">
                <img type="image/svg+xml" src="icons/menuopen.svg" width="25" height="25" />
            </span>
            <div class="nav-links">
                <a  href="home_page.jsp">Home</a>
                <a class="nav-active" href="feedback_home_page.jsp">Feedback</a>
                <a href="wastecategorization.jsp">Waste Management</a>
            </div>
        </div>  
	
		<table class="boxcontainer">
            <tr>    
                <th></th>
                <th></th>
            </tr>
            <tr>
                <td class="childbox"><a href="official_service_level_form.jsp">Service Level
                Progress</a> </td>
            <td class="childbox">
                <a href="official_direct_observation_form.jsp">Direct Observation </a></td>
            </tr>
            <tr>
            <td class="childbox"><a href="citizen_feedback_form.jsp">Citizen Feedback</a></td>
            <td class="childbox"><a href="official_certification_form.jsp">Certification</a></td>
            </tr>
		</table>
		<script src="script.js"></script>
	</body>
</html>
