<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
    <link rel="stylesheet" href="bootstrap.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

     <style>
        * {
            margin: 0;
            padding: 0;
            font-family: poppins, sans-serif;
        }

        header ul {
            background-color: black;
            height: 80px;
            padding: 30px;
        }

        li {
            color: white;
            list-style-type: none;
            display: inline;
            font-size: 13px;
            margin: 12px;
            font-weight: 600;
        }

        .li-css li a{
            text-decoration: none;
            color: white;
        }
        

        header ul li a img {
            height: 62px;
            width: 134px;
            margin-top: -17px;
            margin-left: 10px;
            margin-right: 78px;
        }

        .li-css {
            margin-top: -48px;
            margin-left: 316px;
        }

        .icons {
            margin-top: -21px;
            margin-left: 1120px;
        }

        .icons li {
            font-size: 16px;
            margin: 25px;
        }

        .paragraph p {
            font-size: 40px;
            color: black;
            font-weight: 600;
        }

        .paragraph {
            margin-left: 250px;
            margin-top: 150px;
            animation: paragraphAnimate 1s ease-in-out 1;
        }

        .code-img img {
            margin-left: 350px;
            margin-top: 9px;
            width: 450px;
            margin-right: 72px;
            animation: codeimgAnimate 1s ease-in-out 1;
        }

        .middle-container {
            display: flex;
            /* justify-content: space-around; */
            margin-top: 64px;
            height: 30rem;
        }

        .para-but {
            display: flex;
            flex-direction: column;

        }

        .button-css {
            margin-left: 250px;
            width: 119px;
            height: 38px;
            margin-top: 35px;

            background: #f67f08;
            border-radius: 27px;
        }

        .button-css a {
            color: initial;
            text-decoration: none;
            font-weight: 500;
            font-size: 14px;
            position: static;
        }

        .button-css:hover {
            background-color: white;
            border: 2px solid red;
        }

        .button-css a:hover {
            color: #1877f2;

        }

        .li-css li a:hover {
            color: #f67f08;
        }

        .icons li:hover {
            width: 300px;
            height: 300px;
            border-radius: 100px;
            color: white;
            background-color: #1877f2;
        }

        @keyframes paragraphAnimate {
            from {
                margin-left: 350px;
                margin-top: 150px;
            }

            to {
                margin-left: 250px;
                margin-top: 150px;
            }
        }

        @keyframes codeimgAnimate {
            from {
                margin-left: 152px;

            }

            to {

                margin-left: 350px;

            }
        }

        @keyframes letterAnimate {
            from {
                color: red
            }

            to {
                color: white;
            }
        }

        .letters {
            display: flex;
            color: #ea5353;
            margin-top: -35px;
            font-size: 60px;
            font-weight: 600;
        }

       

        .text {
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 2rem;
            font-weight: 550;
        }

        .course {
            display: flex;
            justify-content: space-around;
            margin: 10px 100px 20px 100px;
            height: 10rem;
        }

        .course img {
            width: 60px;
            height: 90px;
        }

        .about {
            padding: 20px;
            height: 630px;
            background-color: #d3d3d34d;
        }

        .about .para {
            padding: 20px;
            width: 600px;
            text-align: center;
            position: relative;
            left: 422px;
            color: #999;
        }

        .imageplusdata {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 90vw;
            /* background-color: red; */
            margin-left: 50px;
        }

        .imageplusdata img {
            height: 390px;
            width: 450px;
            border-radius: 10px;
            margin: 30px;
        }

        .heading {
            font-size: 25px;
            font-weight: 550;

        }

        .data {
            width: 582px;
            display: flex;
            flex-direction: column;
            /* background-color: orange; */

        }

        .data p {
            font-size: 15px;
            margin: 28px 0px 10px 0px;
            color: #999;
        }

        .services {
            margin-top: 40px;
            height: 50rem;
        }

        .service-grid {
            height: 35rem;
            display: grid;
            grid-column-gap: 5rem;
            grid-template-columns: auto auto auto;
            justify-content: center;
            align-items: center;
            align-content: center;
        }

        .grid-box {
            background-color: black;
            border-radius: 10px;
            position: relative;
        }

        .grid-box img{
            height:400px;width:400px;border-radius: 10px;
        }

        .img-text {
            width: 404px;
            text-align: center;
            position: absolute;
            color: white;
            bottom: 10px;
            font-size: 2rem;
        }

        .services .para {
            padding: 20px;
            width: 600px;
            text-align: center;
            position: relative;
            left: 422px;
            color: #999;
        }

        .works {
            margin-top: 50px;
            height: 45rem;
        }

        .info {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            align-content: center;
            height: 100px;
        }

        .info p {
            font-size: 25px;
        }

        .works-content {
            /* height:800px; */
            display: flex;
            justify-content: center;
            align-items: center;
            align-content: center;
            justify-content: space-around;
        }

        .works-content .box {
            height: 250px;
            width: 250px;
            text-align: center;
        }

        .pricing {
            margin-top: -40px;
            height: 40rem;
        }

        .contact {
            height: 35rem;
        }

        .contact-info {
            background-color: #d3d3d34d;
            height: 35rem;
        }
        





        .footer {
            height: 610px;
            background-color: black;
            display: flex;
            justify-content: center;
            align-items: center;
            justify-content: space-around;
        }

        .footer ul {
            margin-left: -32px;
        }

        .logoside img {
            height: 100px;

        }

        .footerIcons li {
            font-size: 16px;
        }

        .infoside input {
            height: 40px;
            width: 350px;
            background-color: rgb(43, 42, 42);
            border: none;
        }

        .footernav ul li {
            color: white;
            font-size: 12px;

        }

        .infoside p {
            font-size: 15px;
            color: white;
            margin: -8px 0px 35px;
            width: 250px;
        }

        .infoside .head {
            color: white;
            font-size: 25px;
            font-weight: 550;
            margin: -126px 0px 40px 0px;
        }

        .logoside {
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .infoside {
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .footernav ul li:hover {
            color: #ff5e14;
        }

        .icons img{
            height:40px;width:40px;position: absolute;right:50px;position: fixed;
            transition-property: height,width;
            transition-duration: 0.5s;
            transition-timing-function: ease-in-out;
        }

        .icons img:hover{
            height:50px;
            width:50px;
        }
        .infoside a{
        color:white;
        text-decoration:none;
        }
        
        .infoside a:hover{
        color: #ff5e14;
        }
           @media only screen and (max-width: 768px) {
            /* Adjust styles for smaller screens */
            .middle-container{
                flex-direction: column;
    width: 100%;
    height: 20rem;
    margin-top: -121px;
    margin-left: -224px;
            }
            .paragraph p{
                font-size:25px;
            } 

            .letters .l1,.l2,.l3,.l4,.l5,.l6,.l7,.l8,.l9,.l10,.l11{
                font-size: 30px;
                display: flex;
                flex-direction: row;
                justify-content: space-around;
                margin-bottom: -15px;
            }

            .code-img{
                margin-left: -95px;
                margin-bottom: 30px;
            }
            .code-img img{
width: 340px;
            }
            .icons{
                margin-top: 256px;
            }
            .course{
                grid-template-columns: auto auto auto auto;
    display: grid;
    grid-gap: 30px;
            }
           .about .para{
                margin-left: -441px;
                width: 398px;
            }
            .about .data{
                width:395px;
            }
            .text span{
                font-size: 30px;
            }
            .about{
                margin-top: 91px;
                height: 63rem;
            }
            .services{
                height:76rem;
            }

            .imageplusdata img{
                width:350px;
                height:350px;
                margin-top:-19px;
                margin-left: -8px;
            }

            .about .imageplusdata{
                display: flex;
                flex-direction: column;
                width: 300px;
            }

            .services .service-grid{
                display: grid;
    grid-template-columns: auto;
    grid-gap: 10px;
    margin-top: 177px;
            }

            .service-grid .grid-box img{
                width:350px;
                height:350px;
            }

            .img-text{
                font-size: 20px;
                margin-left: -20px;
            }
            .pricing{
                height:55rem;
            }

            .pricing .table{
                position: relative;
    left: -90px;
            }
            .works{
                height: 95rem;
            }

            .works .works-content{
                display: grid;
                grid-template-columns: auto;
                grid-row-gap: 200px;
            }
            .works-content .box{
                flex-direction: column;
            }
            .contact{
                height: 45rem;
            }
            .contact-info{
                margin-top: 20px;
                height: 42rem;
            }
            .footer{
                display: grid;
                grid-template-columns: auto;
                grid-row-gap: 10px;
            }

            .footer .logoside{
                margin-top: 80px;
            }

            .copyright,.footernav{
                display: none;
            }
            .icons img{
            height:40px;width:40px;
            position: fixed;
           
            left: 344px;
    top: 483px;
        }

        .icons img:hover{
            height:50px;
            width:50px;
        }

        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>

<body>
    <header>
        <nav>
            <ul>
                <li><a href="#">
                        <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="">
                    </a></li>
                <div class="li-css">
                    <li><a href="">HOME</a></li>
                    <li><a href="#about">ABOUT</a></li>
                    <li><a href="#services">SERVICES</a></li>
                    <li><a href="#pricing">PRICING</a></li>
                    <li><a href="#works">HOW IT WORKS</a></li>
                    <li><a href="#contact">CONTACT US</a></li>
                </div>
                <div class="icons">
                    <li><i class="fa-brands fa-facebook"></i></li>
                    <li><i class="fa-brands fa-twitter"></i></li>
                    <li><i class="fa-brands fa-instagram"></i></li>
                    <li><i class="fa-brands fa-linkedin"></i></li>
                </div>
            </ul>
        </nav>
    </header>
    <div class="middle-container" id="home">
        <div class="para-but">
            <div class="paragraph">
                <p>WE ARE </p>

                <div class="letters">
                    <div class="l1">A</div>
                    <div class="l2">M</div>
                    <div class="l3">A</div>
                    <div class="l4">R</div>
                    <div class="l5">T</div>
                    <div class="l6">A</div>
                    <div class="l7">I</div>
                    <div class="l8">L</div>
                    <div class="l9">O</div>
                    <div class="l10">R</div>
                    <div class="l11">S</div>
                </div>
            </div>
            <button class="button-css"><a href="#contact">Enroll now</a></button>
        </div>
        <div class="code-img">
            <img src="amarimages/amar.png" alt="can't load">
        </div>
    </div>
    <div class="icons">
        <a href="https://wa.me/919019728222"><img src="amarimages/whatsapp.png" alt="" ></a>
        <a href="tel:+919449335437"><img src="amarimages/call.png" style="top:540px" alt=""></a>
    </div>
    <div class="text">
        <span style="color:#ea5353;margin:10px;">We</span>
        <span style="color:black">Make</span>
    </div>
    <div class="course">
        <img src="amarimages/attire.png" alt="">
        <img src="amarimages/trousers.png">
        <img src="amarimages/shirt.png" alt="">

        <img src="amarimages/uniform.jpg" alt="">
        <img src="amarimages/suit.png" alt="">
        <img src="amarimages/school_uniform.png" alt="">
        <img src="amarimages/kurtha.jpg" alt="">
        <img src="amarimages/police uniform.jpg" alt="">

    </div>
    <div class="about" id="about">
        <div class="text">

            <span style="color:black">About</span>
            <span style="color:#ea5353;">Us</span>
        </div>
        <div class="para">
            <p>We are professionals from IT industry, having vast experience in development
                and training of JAVA and various UI related technologies.</p>
        </div>
        <div class="imageplusdata">
            <img src="amarimages/aramtailor.jpg" alt="">

            <div class="data">
                <div class="heading">
                    <span>Seamstress Expertise Team</span>
                </div>
                <div class="data">
                    <p>We have been training and placing students over a decade now in various training institutes, we
                        are
                        the pioneers who introduced different training models which not only focus on theory but on
                        practical implementations.</p>

                    <p> We focus on providing quality training on cutting edge technologies that are used to build
                        softwares
                        in the current world.
                    </p>
                    <p>
                        Our alumni are our pride and joy. They have gone on to achieve remarkable success in the tech
                        industry, holding key positions in renowned companies and contributing to groundbreaking
                        projects.
                        Their achievements stand as a testament to the quality of education and training we provide.</p>
                </div>
            </div>
        </div>
    </div>
    <div class="services" id="services">
        <div class="text">

            <span style="color:#ea5353;margin-right: 10px">Our</span>
            <span style="color:black;">Services</span>
        </div>
        <div class="para">
            <p>From everyday clothing such as jeans to men suits or dresses, we modify and
                tailor as per your requests with great results.</p>
        </div>
        <div class="service-grid">

            <div class="grid-box">
                <img src="./amarimages/custom-tailoring-for-men.jpg"
                     alt="">
                <div class="img-text">Custom Tailoring Services for Men</div>
            </div>
            <div class="grid-box">
                <img src="./amarimages/boy.jpg"  alt="">
                <div class="img-text">Custom Tailoring Services for Kids</div>
            </div>

            <div class="grid-box">
                <img src="./amarimages/altering.jpg"  alt="">
                <div class="img-text">Alteration & Repair </div>
            </div>
        </div>
    </div>
    <div class="pricing" id="pricing">
        <div class="text">

            <span style="color:#ea5353;margin-right: 10px">Our</span>
            <span style="color:black;">Pricing</span>
        </div>
        <div class="table">
            <table style="margin-left: 250px;margin-top: 20px;" class="table table-striped w-75 table-hover">
                <tr class="text-center">
                    <td>Simple Shirt</td>
                    <td>500</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Simple Pant</td>
                    <td>900</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Simple Coat</td>
                    <td>3000</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>WaistCoat</td>
                    <td>1200</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>2 Piece Suit</td>
                    <td>4500</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>2 Piece Suit</td>
                    <td>5000</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Tuxedo Suit</td>
                    <td>6000</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Blazer</td>
                    <td>4000</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Pathani</td>
                    <td>1500</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
                <tr class="text-center">
                    <td>Kurtha Pajama</td>
                    <td>1400</td>
                    <td><a href="tel:+919449335437"><button type="button" class="btn btn-primary">Book an Appointment</button></a></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="works" id="works">
        <div class="text">
            <span style="color:#ea5353;margin-right: 10px">How it</span>
            <span style="color:black;">Works</span>
        </div>
        <div class="info">
            <h2>How Does Amar Tailors Work?</h2>
            <p>it's simple,affordable and risk free</p>
        </div>
        <div class="works-content">
            <div class="box">
                <img src="amarimages/measurement.jpg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Pick</h2>
                <p>
                    Once you book the appointment, our representative will call you and a time will be scheduled for the pickup, then tailor will take measurements and pick your fabric
                </p>
            </div>
            <div class="box">
                <img src="amarimages/stitch.jpg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Stitch</h2>
                <p>
                    Outfit will be stitched under experts guidance
                </p>
            </div>
            <div class="box">
                <img src="amarimages/deliver.jpeg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Deliver</h2>
                <p>
                    After stitching the outfit will be delivered at your place, and if there will be any alteration required, the tailor will redo again and redeliver it at your place.
                </p>
            </div>
        </div>
    </div>
    <div class="contact" id="contact">
        <div class="text">
            <span style="color:#ea5353;margin-right: 10px">Contact</span>
            <span style="color:black;">Us</span>
        </div>
        <div class="contact-info">
            <form class="row g-3 w-75 m-lg-auto" action="sendEmail">
                <div class="col-md-6">
                    <label  class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName" oninput="validateForm()" onblur="validateFirstName()">
                    <span id="fnameError"></span>
                  </div>
                  <div class="col-md-6">
                    <label  class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName" oninput="validateForm()" onblur="validateLastName()">
                     <span id="lnameError"></span>
                  </div>
                
                  <div class="col-md-6">
                    <label for="inputEmail4" class="form-label">Email</label>
                    <input type="email" class="form-control" id="inputEmail" name="inputEmail" oninput="validateForm()" onblur="validateEmail()">
                     <span id="emailError"></span>
                  </div>
                  <div class="col-md-6">
                    <label  class="form-label">Mobile</label>
                    <input type="text" class="form-control" id="mobile" name="mobile" oninput="validateForm()" onblur="validateMobile()">
                     <span id="mobileError"></span>
                  </div>
                  <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Your Message</label>
                    <textarea class="form-control" id="textArea" rows="3" name="textArea"></textarea>
                  </div>
                
                
                <div class="col-12">
                  <button type="submit" class="btn btn-primary" id="submitButton" disabled>Send</button>
                </div>
              </form>
        </div>

    </div>
    <div class="footer">
        <div class="logoside">
            <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt=""
                style="margin: -126px 0px 40px 0px;">
            <h3 style="color:white;font-size: 20px;margin: -8px 12px 35px;">Follow us</h3>
            <div class="footerIcons">
                <ul>
                    <li><i class="fa-brands fa-facebook"></i></li>
                    <li><i class="fa-brands fa-twitter"></i></li>
                    <li><i class="fa-brands fa-instagram"></i></li>
                    <li><i class="fa-brands fa-linkedin"></i></li>
                </ul>
            </div>
            <div class="footernav">
                <p style="color:white;position: relative;top: 169px;">Copyright © 2022, All Right Reserved</p>
            </div>
        </div>
         <div class="infoside">
            <div class="head">Address</div>
            <div>
                <p><i class="fa-solid fa-building-circle-arrow-right"></i> Jayadeva Circle ,Davangere</p>
                <p><i class="fa-solid fa-house"></i>Muncipality Complex, 1st building, Near Murgiswamy mata , Jayadeva circle, Davangere, 577002</p>
                <p><i class="fa-solid fa-phone-volume"></i><a href="tel:+919449335437">+91-9449335437</a></p>
                <p><i class="fa-solid fa-envelope"></i><a href="mailto:madhumohan53227@gmail.com">madhumohan53227@gmail.com</p>
            </div>
            <div class="footernav" style="position: relative;top: 120px;">
                <ul>
                    <li><a href="">HOME</a></li>
                    <li><a href="#about">ABOUT</a></li>
                    <li><a href="#services">SERVICES</a></li>
                    <li><a href="#pricing">PRICING</a></li>
                    <li><a href="#works">HOW IT WORKS</a></li>
                    <li><a href="#contact">CONTACT US</a></li>
                </ul>
            </div>

        </div>
    </div>
    <script>
    function validateForm() {
        var firstNameValid = validateFirstName();
        var lastNameValid = validateLastName();
        var emailValid = validateEmail();
        var mobileValid = validateMobile();

        // Enable the button if all fields are valid
        var submitButton = document.getElementById("submitButton");
        if (firstNameValid && lastNameValid && emailValid && mobileValid) {
            submitButton.disabled = false;
        } else {
            submitButton.disabled = true;
        }
    }

    function validateFirstName() {
        var firstName = document.getElementById("firstName").value;
        if (firstName === "") {
            document.getElementById("fnameError").innerHTML = "Please enter your first name";
            document.getElementById("fnameError").style.color = "red";
            return false;
        } else {
            document.getElementById("fnameError").style.display = "none";
            console.log(firstName);
            return true;
        }
    }

    function validateLastName() {
        var lastName = document.getElementById("lastName").value;
        if (lastName === "") {
            document.getElementById("lnameError").innerHTML = "Please enter your last name";
            document.getElementById("lnameError").style.color = "red";
            return false;
        } else {
            document.getElementById("lnameError").style.display = "none";
            console.log(lastName)
            return true;
        }
    }

    function validateEmail() {
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        var email = document.getElementById("inputEmail").value;
        if (!emailRegex.test(email)) {
            document.getElementById("emailError").innerHTML = "Please enter a valid email address.";
            document.getElementById("emailError").style.color = "red";
            return false;
        } else {
            document.getElementById("emailError").style.display = "none";
            console.log(email)
            return true;
        }
    }

    function validateMobile() {
        var mobileRegex = /^\d{10}$/;
        var mobile = document.getElementById("mobile").value;
        if (!mobileRegex.test(mobile)) {
            document.getElementById("mobileError").innerHTML = "Please enter a valid 10-digit mobile number.";
            document.getElementById("mobileError").style.color = "red";
            return false;
        } else {
            document.getElementById("mobileError").style.display = "none";
            console.log(mobile)
            return true;
        }
    }
</script>
    
</body>
</html>