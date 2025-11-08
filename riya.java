<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Patients - Hospital Management System</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/styles.css">
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Arial, sans-serif;
            background: #f8f9fa;
        }
        .container {
            max-width: 900px;
            margin: 30px auto;
            padding: 20px;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.04);
        }
        .search-bar {
            display: flex;
            gap: 10px;
            margin-bottom: 25px;
            flex-wrap: wrap;
        }
        .search-bar input {
            flex: 1 1 200px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 20px;
            font-size: 1em;
        }
        .search-bar button {
            padding: 10px 20px;
            border: none;
            background: #007bff;
            color: #fff;
            border-radius: 20px;
            cursor: pointer;
            font-size: 1em;
            transition: background 0.2s;
        }
        .search-bar button:hover {
            background: #0056b3;
        }
        .patients-table {
            width: 100%;
            border-collapse: collapse;
            background: #fff;
        }
        .patients-table th, .patients-table td {
            padding: 14px 8px;
            text-align: left;
            border-bottom: 1px solid #eee;
            font-size: 1em;
        }
        .patients-table th {
            background: #f1f3f6;
        }
        .profile-circle {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            background: #e0e0e0;
            display: inline-flex;
            align-items: center;
            justify-content: center;
            font-weight: bold;
            color: #555;
            margin-right: 10px;
            font-size: 1.1em;
        }
        .hero {
            text-align: center;
            padding: 30px 10px 10px 10px;
        }
        .hero h1 {
            margin: 0 0 10px 0;
            font-size: 2.2em;
        }
        .hero p {
            color: #555;
            font-size: 1.1em;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background: #007bff;
            color: #fff;
            padding: 12px 20px;
            flex-wrap: wrap;
        }
        .nav-logo {
            font-weight: bold;
            font-size: 1.2em;
        }
        .nav-links {
            list-style: none;
            display: flex;
            gap: 18px;
            margin: 0;
            padding: 0;
        }
        .nav-links li a {
            color: #fff;
            text-decoration: none;
            padding: 6px 12px;
            border-radius: 6px;
            transition: background 0.2s;
        }
        .nav-links li a.active, .nav-links li a:hover {
            background: #0056b3;
        }

        /* Responsive Styles */
        @media (max-width: 900px) {
            .container {
                margin: 16px;
                padding: 12px;
            }
        }
        @media (max-width: 700px) {
            .navbar {
                flex-direction: column;
                align-items: flex-start;
                padding: 10px 8px;
            }
            .nav-links {
                flex-direction: column;
                gap: 8px;
                width: 100%;
                margin-top: 8px;
            }
            .container {
                margin: 8px;
                padding: 8px;
            }
            .hero h1 {
                font-size: 1.4em;
            }
            .patients-table, .patients-table thead, .patients-table tbody, .patients-table th, .patients-table td, .patients-table tr {
                display: block;
                width: 100%;
            }
            .patients-table thead {
                display: none;
            }
            .patients-table tr {
                margin-bottom: 18px;
                border: 1px solid #eee;
                border-radius: 8px;
                padding: 10px;
                background: #fff;
                box-shadow: 0 1px 4px rgba(0,0,0,0.03);
            }
            .patients-table td {
                padding: 10px 0 10px 40%;
                border: none;
                position: relative;
                font-size: 1em;
                min-height: 38px;
            }
            .patients-table td:before {
                content: attr(data-label);
                font-weight: bold;
                display: block;
                position: absolute;
                left: 12px;
                top: 10px;
                width: 38%;
                color: #333;
                font-size: 0.98em;
                white-space: nowrap;
            }
            .profile-circle {
                margin-right: 0;
                margin-bottom: 6px;
            }
            .search-bar {
                flex-direction: column;
                gap: 8px;
            }
            .search-bar input, .search-bar button {
                width: 70%;
                font-size: 1em;
            }
        }
        @media (max-width: 400px) {
            .hero h1 {
                font-size: 1.1em;
            }
            .container {
                padding: 4px;
            }
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="nav-logo">Hospital Management System</div>
        <ul class="nav-links">
            <li><a href="../index.html">Home</a></li>
            <li><a href="doctors.html">Doctors</a></li>
            <li><a class="active" href="patients.html">Patients</a></li>
            <li><a href="about.html">About</a></li>
        </ul>
    </nav>
    <div class="hero">
        <h1>Patients</h1>
        <p>This system shows all patient records and their associated doctors.</p>
    </div>
    <div class="container">
        <form class="search-bar" onsubmit="event.preventDefault(); searchPatients();">
            <input type="text" id="searchInput" placeholder="Search by Name or Patient ID">
            <button type="submit">Search</button>
        </form>
        <table class="patients-table" id="patientsTable">
            <thead>
                <tr>
                    <th>Serial No.</th>
                    <th>Profile</th>
                    <th>Name</th>
                    <th>Patient ID</th>
                    <th>Problem</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td data-label="Serial No.">1</td>
                    <td data-label="Profile"><span class="profile-circle">AK</span></td>
                    <td data-label="Name">Akshay Kumar</td>
                    <td data-label="Patient ID">P1001</td>
                    <td data-label="Problem">Fever</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">2</td>
                    <td data-label="Profile"><span class="profile-circle">SJ</span></td>
                    <td data-label="Name">Sonia Jain</td>
                    <td data-label="Patient ID">P1002</td>
                    <td data-label="Problem">Diabetes</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">3</td>
                    <td data-label="Profile"><span class="profile-circle">RK</span></td>
                    <td data-label="Name">Rahul Kumar</td>
                    <td data-label="Patient ID">P1003</td>
                    <td data-label="Problem">Asthma</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">4</td>
                    <td data-label="Profile"><span class="profile-circle">NP</span></td>
                    <td data-label="Name">Neha Patel</td>
                    <td data-label="Patient ID">P1004</td>
                    <td data-label="Problem">Migraine</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">5</td>
                    <td data-label="Profile"><span class="profile-circle">VS</span></td>
                    <td data-label="Name">Vikas Singh</td>
                    <td data-label="Patient ID">P1005</td>
                    <td data-label="Problem">Hypertension</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">6</td>
                    <td data-label="Profile"><span class="profile-circle">RT</span></td>
                    <td data-label="Name">Raveena Tondon</td>
                    <td data-label="Patient ID">P1006</td>
                    <td data-label="Problem">Allergy</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">7</td>
                    <td data-label="Profile"><span class="profile-circle">MS</span></td>
                    <td data-label="Name">Manish Sharma</td>
                    <td data-label="Patient ID">P1007</td>
                    <td data-label="Problem">Back Pain</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">8</td>
                    <td data-label="Profile"><span class="profile-circle">PK</span></td>
                    <td data-label="Name">Priya Kapoor</td>
                    <td data-label="Patient ID">P1008</td>
                    <td data-label="Problem">Thyroid</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">9</td>
                    <td data-label="Profile"><span class="profile-circle">RS</span></td>
                    <td data-label="Name">Rohit Sinha</td>
                    <td data-label="Patient ID">P1009</td>
                    <td data-label="Problem">Fracture</td>
                </tr>
                <tr>
                    <td data-label="Serial No.">10</td>
                    <td data-label="Profile"><span class="profile-circle">SM</span></td>
                    <td data-label="Name">Sneha Mehra</td>
                    <td data-label="Patient ID">P1010</td>
                    <td data-label="Problem">Anxiety</td>
                </tr>
            </tbody>
        </table>
    </div>
    <script>
        function searchPatients() {
            const input = document.getElementById('searchInput').value.toLowerCase();
            const table = document.getElementById('patientsTable');
            const trs = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
            for (let i = 0; i < trs.length; i++) {
                const name = trs[i].children[2].textContent.toLowerCase();
                const id = trs[i].children[3].textContent.toLowerCase();
                if (name.includes(input) || id.includes(input)) {
                    trs[i].style.display = '';
                } else {
                    trs[i].style.display = 'none';
                }
            }
        }
    </script>
</body>
</html>
