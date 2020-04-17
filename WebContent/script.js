function toggleMenu() {
     var ele = document.getElementById("nav");
     if(ele.getBoundingClientRect().height == 50){
          ele.style.height = "120px";
     }
     else{ele.style.height = "50px"}
}

function toQuePage(){
     var state = document.forms["feedbackform"]["state"].value;
     var city = document.forms["feedbackform"]["city"].value;
     var age = document.forms["feedbackform"]["age"].value;
     var current_live1 = document.forms["feedbackform"]["current_live1"].checked;
     var current_live2 = document.forms["feedbackform"]["current_live2"].checked;
     var mobile1 = document.forms["feedbackform"]["mobile1"].checked;
     var mobile2 = document.forms["feedbackform"]["mobile2"].checked;
     var name = document.forms["feedbackform"]["name"].value;
     var number = document.forms["feedbackform"]["number"].value;
     var gender1 = document.forms["feedbackform"]["gender1"].checked;
     var gender2 = document.forms["feedbackform"]["gender2"].checked;
     //console.log(state, city, age, current_live1, current_live2, mobile1, mobile2, name, number, gender1, gender2);

     if(state.length!=0 && city.length!=0 && age.length!=0 && (current_live1 || current_live2)
     && (mobile1 || mobile2) && name.length!=0 && number.length!=0 && (gender1 || gender2)){
          if(number.length!=10){
               alert("Please provide a 10 digit mobile number");
          }
          else{
               var p1 = document.getElementById("basic-information");
               var p2 = document.getElementById("citizen-feedback");
               p1.style.display = "none";
               p2.style.display = "block";
               window.scrollTo(0, 0);
          }
     }
     else{
          alert("Please fill all Fields");
     }
}

function validate_otp(otp){
     if (otp == "123"){
          return true;
     }
     return false;
}

function validateForm(){
     var mobn = document.forms["feedbackform"]["number"].value;
     var otp = prompt("OTP sent to mobile no. " + mobn + "\nEnter OTP");
     if(validate_otp(otp)){
          alert("OTP CORRECT\nSubmitting Form...");
          return true;
     }
     else{
          alert("OTP WRONG\nSubmit Again!");
          return false;
     }
}

var container1 = document.getElementById("bio-photos");

for (var i=0; i < 15; i++) {
     // var img = new Image();
     var img = document.createElement("img");
     img.src = "images/biowaste/bio" + i + ".png";
     img.alt = "Bio Degradable Waste Examples";
     if(screen.width > 800){
          img.width = "200";
          img.height = "140";
     }
     else{
          img.width = "130";
          img.height = "90";
     }
     img.style.marginLeft = "25px";
     container1.appendChild(img);
}

var container2 = document.getElementById("nonbio-photos");

for (var i=0; i < 15; i++) {
     // var img = new Image();
     var img = document.createElement("img");
     img.src = "images/nonbiowaste/nonbio" + i + ".png";
     img.alt = "Non Bio Degradable Waste Examples";
     if(screen.width > 800){
          img.width = "200";
          img.height = "140";
     }
     else{
          img.width = "130";
          img.height = "90";
     }
     img.style.marginLeft = "25px";
     container2.appendChild(img);
}