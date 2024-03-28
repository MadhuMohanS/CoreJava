<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body class="bg-primary">
    <nav class="navbar navbar-expand-lg navbar-light bg-primary">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="IplDetails.jsp">IPLform</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-1 py-4">
            <div class="card-body">
                <h6 class="information mt-4">Please provide following information about your Degree</h6>
                <form name="registration" action="ipl" method="post">
                    <div class="mb-3">
                        <label for="name" class="form-label">Team A</label>
                        <input type="text" class="form-control" name="teamA" id="teamA" onblur="setTeamA()">
                        <span id="teamAError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="name" class="form-label">Team B</label>
                        <input type="text" class="form-control" name="teamB" id="teamB" onblur="setTeamB()">
                        <span id="teamBError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="name" class="form-label">Team A Captain</label>
                        <input type="text" class="form-control" name="ACaptain" id="ACaptain" onblur="setCaptainA()">
                        <span id="captainAError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="name" class="form-label">Team B Captain</label>
                        <input type="text" class="form-control" name="BCaptain" id="BCaptain" onblur="setCaptainB()">
                        <span id="captainBError"></span>
                    </div>

                    <div class="input-group mb-4 mt-5">
                        <label class="input-group-text" for="location">Match</label>
                        <select class="form-select" id="match" name="match" onblur="setMatch()">
                            <option selected value="0">Match</option>
                            <option value="BTM">SemiFinal</option>
                            <option value="APMC Market">Final</option>
                            <option value="Banashankari  ">QuarterFinal </option>


                        </select>

                        <span id="matchError"></span>
                    </div>
                    <div class="input-group mb-4 mt-5">
                        <label class="input-group-text" for="location">Location</label>
                        <select class="form-select" id="location" name="location" onblur="setLocation()">
                            <option selected value="0">Location</option>
                            <option value="BTM">BTM</option>
                            <option value="APMC Market">APMC Market</option>
                            <option value="Banashankari">Banashankari </option>


                        </select>

                        <span id="locationError"></span>
                    </div>
                    <div class="input-group mb-4 mt-5">
                        <label class="input-group-text" for="city">City</label>
                        <select class="form-select" id="city" name="city" onblur="setCity()">
                            <option selected value="0">Choose...</option>
                            <option value="BTM">Bengaluru</option>
                            <option value="MG Road">Davangere</option>
                            <option value="Bengaluru  ">Bengaluru </option>
                            <option value="Jayanagara">Davangere</option>
                            <option value="Bengaluru">Bengaluru</option>

                        </select>

                        <span id="cityError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="Name" class="form-label">Pincode:</label>
                        <input type="text" class="form-control" name="pincode" id="pincode" onblur="setPincode()">
                        <span id=pincodeError></span>
                    </div>

                    <div class="mb-3">
                        <label for="Name" class="form-label">Area:</label>
                        <input type="text" class="form-control" name="area" id="area" onblur="setArea()">
                        <span id="areaError"></span>
                    </div>
                    <div class="mb-3">
                        <div class="mb-3">
                            <label for="name" class="form-label">Stadium</label>
                            <input type="text" class="form-control" name="stadium" id="stadium" onblur="setStadium()">
                            <span id="stadiumError"></span>
                        </div>
                        <div class="mb-3">
                            <label for="Name" class="form-label">MatchNo:</label>
                            <input type="text" class="form-control" name="matchNo" id="matchNo" onblur="setMatchNo()">
                            <span id="matchNoError"></span>
                        </div>
                        <div class="mb-3">
                            <label for="Name" class="form-label">No of Batsmen in Team A:</label>
                            <input type="text" class="form-control" name="batsmenA" id="batsmenA"
                                onblur="setBatsmenA()">
                            <span id="batsmenAError"></span>
                        </div>
                        <div class="mb-3">
                            <label for="Name" class="form-label">No of Batsmen in Team B:</label>
                            <input type="text" class="form-control" name="batsmenB" id="batsmenB"
                                onblur="setBatsmenB()">
                            <span id="batsmenBError"></span>
                        </div>
                        <div class="mb-3">
                            <label for="Name" class="form-label">No of Bowlers in Team A:</label>
                            <input type="text" class="form-control" name="bowlersA" id="bowlersA"
                                onblur="setBowlersA()">
                            <span id="bowlersAError"></span>
                        </div>
                        <div class="mb-3">
                            <label for="Name" class="form-label">No of Bowlers in Team B:</label>
                            <input type="text" class="form-control" name="bowlersB" id="bowlersB"
                                onblur="setBowlersB()">
                            <span id="bowlersBError"></span>
                        </div>



                        <button type="submit" disabled class="btn btn-primary" id="btn">Submit</button>
                </form>
            </div>
        </div>
    </div>

</body>
<script>
    let getFields = {
        "teamA": false,
        "teamB": false,
        "ACaptain": false,
        "BCaptain": false,
        "match": false,
        "location": false,
        "city": false,
        "pincode": false,
        "area": false,
        "stadium": false,
        "matchNo": false,
        "batsmenA": false,
        "batsmenB": false,
        "bowlersA": false,
        "bowlersB": false,
    }

    function validate() {

        let flag = false;

        for (let [key, value] of Object.entries(getFields)) {
            if (value === false) {

                flag = true;
                break;
            }
        }
        if (!flag) {
            document.getElementById("btn").removeAttribute("disabled");
        } else {
            document.getElementById("btn").setAttribute("disabled", "");
        }
    }

    function setTeamA() {
        let a = document.getElementById("teamA");
        let error = document.getElementById("teamAError");

        if (a.value.trim() === "") {
            error.innerHTML = "Please enter a valid name";
            error.style.color = 'red';
            getFields["teamA"] = false;
        } else if (a.value.trim().length < 5 || a.value.trim().length > 20) {
            error.innerHTML = "Name must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["teamA"] = false;
        } else {
            getFields["teamA"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setTeamB() {
        let b = document.getElementById("teamB");
        let error = document.getElementById("teamBError");

        if (b.value.trim() === "") {
            error.innerHTML = "Please enter a valid name";
            error.style.color = 'red';
            getFields["teamB"] = false;
        } else if (b.value.trim().length < 5 || b.value.trim().length > 20) {
            error.innerHTML = "Name must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["teamB"] = false;
        } else {
            getFields["teamB"] = true;
            error.innerHTML = "";
        }
        validate();
    }

    function setCaptainA() {
        let captainA = document.getElementById("ACaptain");
        let error = document.getElementById("captainAError");

        if (captainA.value.trim() === "") {
            error.innerHTML = "Please enter a valid name";
            error.style.color = 'red';
            getFields["ACaptain"] = false;
        } else if (captainA.value.trim().length < 5 || captainA.value.trim().length > 20) {
            error.innerHTML = "Name must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["ACaptain"] = false;
        } else {
            getFields["ACaptain"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setCaptainB() {
        let captainB = document.getElementById("BCaptain");
        let error = document.getElementById("captainBError");

        if (captainB.value.trim() === "") {
            error.innerHTML = "Please enter a valid name";
            error.style.color = 'red';
            getFields["BCaptain"] = false;
        } else if (captainB.value.trim().length < 5 || captainB.value.trim().length > 20) {
            error.innerHTML = "Name must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["BCaptain"] = false;
        } else {
            getFields["BCaptain"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setMatch() {
        let fruit = document.getElementById("match");
        let error = document.getElementById("matchError");

        if (fruit.value != "0") {
            error.innerHTML = "";
            getFields["match"] = true;
        }
        else {
            error.innerHTML = "Please select a Location";
            error.style.color = 'red';
            getFields["match"] = false;
        }
        validate();
    }

    function setLocation() {
        let fruit = document.getElementById("location");
        let error = document.getElementById("locationError");

        if (fruit.value != "0") {
            error.innerHTML = "";
            getFields["location"] = true;
        }
        else {
            error.innerHTML = "Please select a Location";
            error.style.color = 'red';
            getFields["location"] = false;
        }
        validate();
    }

    function setCity() {
        let city = document.getElementById("city");
        let error = document.getElementById("cityError");

        if (city.value != "0") {
            error.innerHTML = "";
            getFields["city"] = true;
        }
        else {
            error.innerHTML = "Please select city";
            error.style.color = 'red';
            getFields["city"] = false;
        }
        validate();
    }



    function setPincode() {
        let pincode = document.getElementById("pincode");
        let error = document.getElementById("pincodeError");

        if (pincode.value.trim().length == 6) {
            getFields["pincode"] = true;
            error.innerHTML = "";

        }
        else {
            error.innerHTML = "Please enter valid Pincode";
            error.style.color = 'red';
            getFields["pincode"] = false;

        }
        validate();
    }



    function setArea() {
        let area = document.getElementById("area");
        let error = document.getElementById("areaError");

        if (area.value.trim().length < 5 || area.value.trim().length > 20) {
            error.innerHTML = "Area must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["area"] = false;
        } else if (area.value.trim() === "") {
            error.innerHTML = "Please enter a valid area";
            error.style.color = 'red';
            getFields["area"] = false;
        } else {
            getFields["area"] = true;
            error.innerHTML = "";
        }
        validate();
    }

    function setStadium() {
        let std = document.getElementById("stadium");
        let error = document.getElementById("stadiumError");

        if (std.value.trim() === "") {
            error.innerHTML = "Please enter a valid name";
            error.style.color = 'red';
            getFields["stadium"] = false;
        } else if (std.value.trim().length < 5 || std.value.trim().length > 20) {
            error.innerHTML = "Name must be between 5 and 20 characters long";
            error.style.color = 'red';
            getFields["stadium"] = false;
        } else {
            getFields["stadium"] = true;
            error.innerHTML = "";
        }
        validate();
    }


    function setMatchNo() {
        let mtchno = document.getElementById("matchNo");
        let error = document.getElementById("matchNoError");

        let matchNumber = parseInt(mtchno.value.trim()); // Convert input value to a number

        if (isNaN(matchNumber) || matchNumber < 1 || matchNumber > 1000) {
            error.innerHTML = "match number must be a valid number between 1 and 1000";
            error.style.color = 'red';
            getFields["matchNo"] = false;
        } else if (mtchno.value.trim() === "") {
            error.innerHTML = "Please enter a valid match number";
            error.style.color = 'red';
            getFields["matchNo"] = false;
        } else {
            getFields["matchNo"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setBatsmenA() {
        let btsA = document.getElementById("batsmenA");
        let error = document.getElementById("batsmenAError");

        let batsmen = parseInt(btsA.value.trim()); // Convert input value to a number

        if (isNaN(batsmen) || batsmen < 1 || batsmen > 6) {
            error.innerHTML = "no of Batsmens must be a valid between 1 and 6";
            error.style.color = 'red';
            getFields["batsmenA"] = false;
        } else if (btsA.value.trim() === "") {
            error.innerHTML = "Please enter a valid match number";
            error.style.color = 'red';
            getFields["batsmenA"] = false;
        } else {
            getFields["batsmenA"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setBatsmenB() {
        let btsB = document.getElementById("batsmenB");
        let error = document.getElementById("batsmenBError");

        let batsmen = parseInt(btsB.value.trim()); // Convert input value to a number

        if (isNaN(batsmen) || batsmen < 1 || batsmen > 6) {
            error.innerHTML = "no of Batsmens must be a valid between 1 and 6";
            error.style.color = 'red';
            getFields["batsmenB"] = false;
        } else if (btsB.value.trim() === "") {
            error.innerHTML = "Please enter a valid match number";
            error.style.color = 'red';
            getFields["batsmenB"] = false;
        } else {
            getFields["batsmenB"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setBowlersA() {
        let bwlsA = document.getElementById("bowlersA");
        let error = document.getElementById("bowlersAError");

        let bwls = parseInt(bwlsA.value.trim()); // Convert input value to a number

        if (isNaN(bwls) || bwls < 1 || bwls > 4) {
            error.innerHTML = "no of Bowlers must be a valid between 1 and 4";
            error.style.color = 'red';
            getFields["bowlersA"] = false;
        } else if (bwlsA.value.trim() === "") {
            error.innerHTML = "Please enter a valid match number";
            error.style.color = 'red';
            getFields["bowlersA"] = false;
        } else {
            getFields["bowlersA"] = true;
            error.innerHTML = "";
        }
        validate();
    }
    function setBowlersB() {
        let bwlsB = document.getElementById("bowlersB");
        let error = document.getElementById("bowlersBError");

        let bwls = parseInt(bwlsB.value.trim()); // Convert input value to a number

        if (isNaN(bwls) || bwls < 1 || bwls > 4) {
            error.innerHTML = "no of Bowlers must be a valid between 1 and 4";
            error.style.color = 'red';
            getFields["bowlersB"] = false;
        } else if (bwlsB.value.trim() === "") {
            error.innerHTML = "Please enter a valid match number";
            error.style.color = 'red';
            getFields["bowlersB"] = false;
        } else {
            getFields["bowlersB"] = true;
            error.innerHTML = "";
        }
        validate();

        console.log(getFields)
    }



</script>

</html>