<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
    <link rel="stylesheet" href="bootstrap.css">

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
            margin-left: 1200px;
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
            height:30rem;
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

        .li-css li:hover {
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
        }

        .l1 {
            height: 45px;
            width: 40px;
            /* animation: letterAnimate 1s ease-in-out infinite; */
            font-size: 60px;
            font-weight: 600;
            margin-right: 1px;

        }

        .l2 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 1s infinite; */
            margin-right: 1px;
        }

        .l3 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 2s infinite; */
            margin-right: 1px;
            margin-left: 6px;
        }

        .l4 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 3s infinite; */
            margin-right: 1px;
        }

        .l5 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 4s infinite; */
            margin-right: 1px;
            margin-left: 16px;
        }

        .l6 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 5s infinite; */
            margin-right: 1px;
            margin-left: -10px;
        }

        .l7 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 6s infinite; */
            margin-right: 1px;
        }

        .l8 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 7s infinite; */
            margin-right: 1px;
            margin-left: -27px;
        }

        .l9 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 8s infinite; */
            margin-right: 1px;
            margin-left: -9px;
        }

        .l10 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 9s infinite; */
            margin-right: 1px;
        }

        .l11 {
            height: 45px;
            width: 40px;
            font-size: 60px;
            font-weight: 600;
            /* animation: letterAnimate 1s ease-in-out 10s infinite; */
            margin-right: 1px;
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
            height:10rem;
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
        .services{
            margin-top:40px;
            height:50rem;
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
            height: 400px;
            width: 400px;
            background-color: black;
            border-radius: 10px;
            position: relative;
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
        .works{
            margin-top: 50px;
            height:45rem;
        }

        .info{
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            align-content: center;
            height:100px;
        }
        .info p{
            font-size: 25px;
        }
        .works-content{
            /* height:800px; */
            display: flex;
            justify-content: center;
            align-items: center;
            align-content: center;
            justify-content: space-around;
        }
        .works-content .box{
  height:250px;
  width:250px;
  text-align: center;
        }

        .pricing{
            margin-top:-40px;
            height:40rem;
        }

        .contact{
            height:30rem;
        }
        .contact-info{
            background-color: #d3d3d34d;
            height: 27rem;
        }





        .footer {
            height: 500px;
            background-color: black;
            display: flex;
            justify-content: center;
            align-items: center;
            justify-content: space-around;
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
                    <li>HOME</li>
                    <li>ABOUT</li>
                    <li>SERVICES</li>
                    <li>PRICING</li>
                    <li>HOW IT WORKS</li>
                    <li>CONTACT US</li>
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
    <div class="middle-container">
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
            <button class="button-css"><a href="#">Enroll now</a></button>
        </div>
        <div class="code-img">
            <img src="amar.png" alt="can't load">
        </div>
    </div>
    <div class="text">
        <span style="color:#ea5353;margin:10px;">We</span>
        <span style="color:black">Make</span>
    </div>
    <div class="course">
        <img src="attire.png" alt="">
        <img src="trousers.png">
        <img src="shirt.png" alt="">

        <img src="uniform.jpg" alt="">
        <img src="suit.png" alt="">
        <img src="school_uniform.png" alt="">
        <img src="kurtha.jpg" alt="">
        <img src="police uniform.jpg" alt="">

    </div>
    <div class="about">
        <div class="text">

            <span style="color:black">About</span>
            <span style="color:#ea5353;">Us</span>
        </div>
        <div class="para">
            <p>We are professionals from IT industry, having vast experience in development
                and training of JAVA and various UI related technologies.</p>
        </div>
        <div class="imageplusdata">
            <img src="aramtailor.jpg" alt="">

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
    <div class="services">
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
                <img src="./amarimages/custom-tailoring-for-men.jpg" style="height:400px;width:400px;border-radius: 10px;" alt="">
                <div class="img-text">Custom Tailoring Services for Men</div>
            </div>
            <div class="grid-box">
                <img src="./amarimages/boy.jpg" style="height:400px;width:400px;border-radius: 10px;" alt="">
                <div class="img-text">Custom Tailoring Services for Kids</div>
            </div>

            <div class="grid-box">
                <img src="./amarimages/altering.jpg" style="height:400px;width:400px;border-radius: 10px;" alt="">
                <div class="img-text">Alteration & Repair </div>
            </div>
        </div>
    </div>
    <div class="pricing">
        <div class="text">

            <span style="color:#ea5353;margin-right: 10px">Our</span>
            <span style="color:black;">Pricing</span>
        </div>
        <div class="table">
            <table style="margin-left: 250px;margin-top: 20px;" class="table table-striped w-75 table-hover">
                <tr class="text-center">
                    <td>Simple Shirt</td>
                    <td>500</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Simple Pant</td>
                    <td>900</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Simple Coat</td>
                    <td>3000</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>WaistCoat</td>
                    <td>1200</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>2 Piece Suit</td>
                    <td>4500</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>2 Piece Suit</td>
                    <td>5000</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Tuxedo Suit</td>
                    <td>6000</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Blazer</td>
                    <td>4000</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Pathani</td>
                    <td>1500</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
                <tr class="text-center">
                    <td>Kurtha Pajama</td>
                    <td>1400</td>
                    <td><button type="button" class="btn btn-primary">Book an Appointment</button></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="works">
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
                <img src="./amarimages/measurement.jpg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Pick</h2>
                <p>
                    Once you book the appointment, our representative will call you and a time will be scheduled for the pickup, then tailor will take measurements and pick your fabric
                </p>
            </div>
            <div class="box">
                <img src="./amarimages/stitch.jpg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Stitch</h2>
                <p>
                    Outfit will be stitched under experts guidance
                </p>
            </div>
            <div class="box">
                <img src="./amarimages/deliver.jpeg" alt="" style="height:250px;width: 250px;border-radius: 10px;">
                <h2>Deliver</h2>
                <p>
                    After stitching the outfit will be delivered at your place, and if there will be any alteration required, the tailor will redo again and redeliver it at your place.
                </p>
            </div>
        </div>
    </div>
    <div class="contact">
        <div class="text">
            <span style="color:#ea5353;margin-right: 10px">Contact</span>
            <span style="color:black;">Us</span>
        </div>
        <div class="contact-info">
            <form class="row g-3 w-75 m-lg-auto" action="sendEmail">
                <div class="col-md-6">
                    <label  class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName">
                  </div>
                  <div class="col-md-6">
                    <label  class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName">
                  </div>
                
                  <div class="col-md-6">
                    <label for="inputEmail4" class="form-label">Email</label>
                    <input type="email" class="form-control" id="inputEmail" name="inputEmail">
                  </div>
                  <div class="col-md-6">
                    <label  class="form-label">Mobile</label>
                    <input type="text" class="form-control" id="mobile" name="mobile">
                  </div>
                  <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Your Message</label>
                    <textarea class="form-control" id="textArea" rows="3" name="textArea"></textarea>
                  </div>
                
                
                <div class="col-12">
                  <button type="submit" class="btn btn-primary">Send</button>
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
            <div>
                <p style="color:white;position: relative;top: 169px;">Copyright © 2022, All Right Reserved</p>
            </div>
        </div>
        <div class="infoside">
            <div style="color:white;font-size: 25px;font-weight: 550;margin: -126px 0px 40px 0px;">Subscribe</div>
            <div>
                <p style="font-size: 15px;color:white;margin: -8px 0px 35px;">Don’t miss to subscribe to our new feeds,
                    kindly fill the form
                    below.</p>
            </div>
            <div><input type="email" placeholder="Email Address"><i class="fa-brands fa-telegram" style="color: #ff5e14;
            font-size: 28px;
            border-width: 6px;
            border-style: solid;
            position: relative;
            top: 6px;
            left: -39px;"></i>
            </div>
            <div class="footernav" style="position: relative;top: 190px;">
                <ul>
                    <li>HOME</li>
                    <li>ABOUT</li>
                    <li>SERVICES</li>
                    <li>PRICING</li>
                    <li>HOW IT WORKS</li>
                    <li>CONTACT US</li>
                </ul>
            </div>

        </div>
    </div>
<!--     <script src="https://smtpjs.com/v3/smtp.js"></script> -->
<!--     <script> -->
//         function sendEmail(){
//             Email.send({
//     Host : "smtp.elasticemail.com",
//     Username : "madhumohan53227@gmail.com",
//     Password : "F2157FC604264EE00F474728E58D554D9A3A",
//     To : 'madhumohan53227@gmail.com',
//     From : document.getElementById("inputEmail").value,
//     Subject : "contact form data",
//     Body : "Name:"+document.getElementById("firstName").value
//     +" "+document.getElementById("lastName").value+"<br> Email:"+document.getElementById("inputEmail").value+"<br> Mobile: "+document.getElementById("mobile").value
//     +"<br> Message: "+document.getElementById("textArea").value
// }).then(
//   message => alert(message)
// );
//         }
<!--     </script> -->
</body>
</html>