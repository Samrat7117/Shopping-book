<!DOCTYPE html>
<html>
<head>
    <title>Online Book Store</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background-color: #f5f5f5;
        }

        /* Navbar */
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #333;
            padding: 10px 20px;
            color: white;
        }

        .logo {
            font-size: 20px;
            font-weight: bold;
        }

        .nav-btn {
            background-color: #ff9800;
            border: none;
            padding: 8px 15px;
            color: white;
            cursor: pointer;
            border-radius: 5px;
        }

        .nav-btn:hover {
            background-color: #e68900;
        }

        /* Book Section */
        .container {
            display: flex;
            justify-content: center;
            margin-top: 40px;
            gap: 30px;
        }

        .book {
            background: white;
            padding: 15px;
            border-radius: 10px;
            text-align: center;
            width: 200px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .book img {
            width: 100%;
            height: 200px;
            object-fit: cover;
            border-radius: 5px;
        }

        .book button {
            margin-top: 10px;
            padding: 8px 10px;
            background-color: green;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .book button:hover {
            background-color: darkgreen;
        }
    </style>

</head>
<body>

    <!-- Navbar -->
    <div class="navbar">
        <div class="logo">MyBookStore</div>
        <button class="nav-btn" onclick="viewCart()">View Cart</button>
    </div>

    <!-- Books -->
    <div class="container">

        <!-- Java Book -->
        <div class="book">
            <img src="./images/java.png" alt="Java Book">
            <h3>Java Book</h3>
            <button onclick="addJava()">Add to Cart</button>
        </div>

        <!-- Python Book -->
        <div class="book">
            <img src="./images/python.png" alt="Python Book">
            <h3>Python Book</h3>
            <button onclick="addPython()">Add to Cart</button>
        </div>

        <!-- DS Book -->
        <div class="book">
            <img src="./images/ds.png" alt="DS Book">
            <h3>Data Structure Book</h3>
            <button onclick="addDS()">Add to Cart</button>
        </div>

    </div>

    <script>
        function addJava() {
            window.location.href = 'AddToCartServlet?book=Java';
        }

        function addPython() {
            window.location.href = 'AddToCartServlet?book=Python';
        }

        function addDS() {
            window.location.href = 'AddToCartServlet?book=DataStructure';
        }

        function viewCart() {
            window.location.href = 'ViewCartServlet';
        }
    </script>

</body>
</html>