<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demo</title>

    <!-- link JS -->
    <script src="./createPage.js"></script>

    <!-- link CSS BOOTSTRAP -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    link JS BOOTSTRAP
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>



</head>

<body>

    <!-- MAIN-CONTAINER -->
    <div class="main-container">
        
    </div>

   
    <script>
        // create header
        createHeader();

        // set data in localStorage
        var data = getConnection();
        localStorage.setItem("productList", JSON.stringify(data));

        // create card
        createCart(data);

        // Check user in local storage 
        let isUserExist = localStorage.getItem("userList");
        if(!isUserExist)
            localStorage.setItem("userList", "[]");

        // functionality of sing up 
        
    </script>

</body>

</html>