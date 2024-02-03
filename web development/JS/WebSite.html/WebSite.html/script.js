function getConnection() {
  var productList = [{ "id": 1, "title": "iPhone 9", "description": "An apple mobile which is nothing like apple", "price": 549, "discountPercentage": 12.96, "rating": 4.69, "stock": 94, "brand": "Apple", "category": "smartphones", "thumbnail": "https://i.dummyjson.com/data/products/1/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/1/1.jpg", "https://i.dummyjson.com/data/products/1/2.jpg", "https://i.dummyjson.com/data/products/1/3.jpg", "https://i.dummyjson.com/data/products/1/4.jpg", "https://i.dummyjson.com/data/products/1/thumbnail.jpg"] }, { "id": 2, "title": "iPhone X", "description": "SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...", "price": 899, "discountPercentage": 17.94, "rating": 4.44, "stock": 34, "brand": "Apple", "category": "smartphones", "thumbnail": "https://i.dummyjson.com/data/products/2/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/2/1.jpg", "https://i.dummyjson.com/data/products/2/2.jpg", "https://i.dummyjson.com/data/products/2/3.jpg", "https://i.dummyjson.com/data/products/2/thumbnail.jpg"] }, { "id": 3, "title": "Samsung Universe 9", "description": "Samsung's new variant which goes beyond Galaxy to the Universe", "price": 1249, "discountPercentage": 15.46, "rating": 4.09, "stock": 36, "brand": "Samsung", "category": "smartphones", "thumbnail": "https://i.dummyjson.com/data/products/3/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/3/1.jpg"] }, { "id": 4, "title": "OPPOF19", "description": "OPPO F19 is officially announced on April 2021.", "price": 280, "discountPercentage": 17.91, "rating": 4.3, "stock": 123, "brand": "OPPO", "category": "smartphones", "thumbnail": "https://i.dummyjson.com/data/products/4/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/4/1.jpg", "https://i.dummyjson.com/data/products/4/2.jpg", "https://i.dummyjson.com/data/products/4/3.jpg", "https://i.dummyjson.com/data/products/4/4.jpg", "https://i.dummyjson.com/data/products/4/thumbnail.jpg"] }, { "id": 5, "title": "Huawei P30", "description": "Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK.", "price": 499, "discountPercentage": 10.58, "rating": 4.09, "stock": 32, "brand": "Huawei", "category": "smartphones", "thumbnail": "https://i.dummyjson.com/data/products/5/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/5/1.jpg", "https://i.dummyjson.com/data/products/5/2.jpg", "https://i.dummyjson.com/data/products/5/3.jpg"] }, { "id": 6, "title": "MacBook Pro", "description": "MacBook Pro 2021 with mini-LED display may launch between September, November", "price": 1749, "discountPercentage": 11.02, "rating": 4.57, "stock": 83, "brand": "Apple", "category": "laptops", "thumbnail": "https://i.dummyjson.com/data/products/6/thumbnail.png", "images": ["https://i.dummyjson.com/data/products/6/1.png", "https://i.dummyjson.com/data/products/6/2.jpg", "https://i.dummyjson.com/data/products/6/3.png", "https://i.dummyjson.com/data/products/6/4.jpg"] }, { "id": 7, "title": "Samsung Galaxy Book", "description": "Samsung Galaxy Book S (2020) Laptop With Intel Lakefield Chip, 8GB of RAM Launched", "price": 1499, "discountPercentage": 4.15, "rating": 4.25, "stock": 50, "brand": "Samsung", "category": "laptops", "thumbnail": "https://i.dummyjson.com/data/products/7/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/7/1.jpg", "https://i.dummyjson.com/data/products/7/2.jpg", "https://i.dummyjson.com/data/products/7/3.jpg", "https://i.dummyjson.com/data/products/7/thumbnail.jpg"] }, { "id": 8, "title": "Microsoft Surface Laptop 4", "description": "Style and speed. Stand out on HD video calls backed by Studio Mics. Capture ideas on the vibrant touchscreen.", "price": 1499, "discountPercentage": 10.23, "rating": 4.43, "stock": 68, "brand": "Microsoft Surface", "category": "laptops", "thumbnail": "https://i.dummyjson.com/data/products/8/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/8/1.jpg", "https://i.dummyjson.com/data/products/8/2.jpg", "https://i.dummyjson.com/data/products/8/3.jpg", "https://i.dummyjson.com/data/products/8/4.jpg", "https://i.dummyjson.com/data/products/8/thumbnail.jpg"] }, { "id": 9, "title": "Infinix INBOOK", "description": "Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty", "price": 1099, "discountPercentage": 11.83, "rating": 4.54, "stock": 96, "brand": "Infinix", "category": "laptops", "thumbnail": "https://i.dummyjson.com/data/products/9/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/9/1.jpg", "https://i.dummyjson.com/data/products/9/2.png", "https://i.dummyjson.com/data/products/9/3.png", "https://i.dummyjson.com/data/products/9/4.jpg", "https://i.dummyjson.com/data/products/9/thumbnail.jpg"] }, { "id": 10, "title": "HP Pavilion 15-DK1056WM", "description": "HP Pavilion 15-DK1056WM Gaming Laptop 10th Gen Core i5, 8GB, 256GB SSD, GTX 1650 4GB, Windows 10", "price": 1099, "discountPercentage": 6.18, "rating": 4.43, "stock": 89, "brand": "HP Pavilion", "category": "laptops", "thumbnail": "https://i.dummyjson.com/data/products/10/thumbnail.jpeg", "images": ["https://i.dummyjson.com/data/products/10/1.jpg", "https://i.dummyjson.com/data/products/10/2.jpg", "https://i.dummyjson.com/data/products/10/3.jpg", "https://i.dummyjson.com/data/products/10/thumbnail.jpeg"] }, { "id": 11, "title": "perfume Oil", "description": "Mega Discount, Impression of Acqua Di Gio by GiorgioArmani concentrated attar perfume Oil", "price": 13, "discountPercentage": 8.4, "rating": 4.26, "stock": 65, "brand": "Impression of Acqua Di Gio", "category": "fragrances", "thumbnail": "https://i.dummyjson.com/data/products/11/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/11/1.jpg", "https://i.dummyjson.com/data/products/11/2.jpg", "https://i.dummyjson.com/data/products/11/3.jpg", "https://i.dummyjson.com/data/products/11/thumbnail.jpg"] }, { "id": 12, "title": "Brown Perfume", "description": "Royal_Mirage Sport Brown Perfume for Men & Women - 120ml", "price": 40, "discountPercentage": 15.66, "rating": 4, "stock": 52, "brand": "Royal_Mirage", "category": "fragrances", "thumbnail": "https://i.dummyjson.com/data/products/12/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/12/1.jpg", "https://i.dummyjson.com/data/products/12/2.jpg", "https://i.dummyjson.com/data/products/12/3.png", "https://i.dummyjson.com/data/products/12/4.jpg", "https://i.dummyjson.com/data/products/12/thumbnail.jpg"] }, { "id": 13, "title": "Fog Scent Xpressio Perfume", "description": "Product details of Best Fog Scent Xpressio Perfume 100ml For Men cool long lasting perfumes for Men", "price": 13, "discountPercentage": 8.14, "rating": 4.59, "stock": 61, "brand": "Fog Scent Xpressio", "category": "fragrances", "thumbnail": "https://i.dummyjson.com/data/products/13/thumbnail.webp", "images": ["https://i.dummyjson.com/data/products/13/1.jpg", "https://i.dummyjson.com/data/products/13/2.png", "https://i.dummyjson.com/data/products/13/3.jpg", "https://i.dummyjson.com/data/products/13/4.jpg", "https://i.dummyjson.com/data/products/13/thumbnail.webp"] }, { "id": 14, "title": "Non-Alcoholic Concentrated Perfume Oil", "description": "Original Al Munakh® by Mahal Al Musk | Our Impression of Climate | 6ml Non-Alcoholic Concentrated Perfume Oil", "price": 120, "discountPercentage": 15.6, "rating": 4.21, "stock": 114, "brand": "Al Munakh", "category": "fragrances", "thumbnail": "https://i.dummyjson.com/data/products/14/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/14/1.jpg", "https://i.dummyjson.com/data/products/14/2.jpg", "https://i.dummyjson.com/data/products/14/3.jpg", "https://i.dummyjson.com/data/products/14/thumbnail.jpg"] }, { "id": 15, "title": "Eau De Perfume Spray", "description": "Genuine  Al-Rehab spray perfume from UAE/Saudi Arabia/Yemen High Quality", "price": 30, "discountPercentage": 10.99, "rating": 4.7, "stock": 105, "brand": "Lord - Al-Rehab", "category": "fragrances", "thumbnail": "https://i.dummyjson.com/data/products/15/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/15/1.jpg", "https://i.dummyjson.com/data/products/15/2.jpg", "https://i.dummyjson.com/data/products/15/3.jpg", "https://i.dummyjson.com/data/products/15/4.jpg", "https://i.dummyjson.com/data/products/15/thumbnail.jpg"] }, { "id": 16, "title": "Hyaluronic Acid Serum", "description": "L'OrÃ©al Paris introduces Hyaluron Expert Replumping Serum formulated with 1.5% Hyaluronic Acid", "price": 19, "discountPercentage": 13.31, "rating": 4.83, "stock": 110, "brand": "L'Oreal Paris", "category": "skincare", "thumbnail": "https://i.dummyjson.com/data/products/16/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/16/1.png", "https://i.dummyjson.com/data/products/16/2.webp", "https://i.dummyjson.com/data/products/16/3.jpg", "https://i.dummyjson.com/data/products/16/4.jpg", "https://i.dummyjson.com/data/products/16/thumbnail.jpg"] }, { "id": 17, "title": "Tree Oil 30ml", "description": "Tea tree oil contains a number of compounds, including terpinen-4-ol, that have been shown to kill certain bacteria,", "price": 12, "discountPercentage": 4.09, "rating": 4.52, "stock": 78, "brand": "Hemani Tea", "category": "skincare", "thumbnail": "https://i.dummyjson.com/data/products/17/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/17/1.jpg", "https://i.dummyjson.com/data/products/17/2.jpg", "https://i.dummyjson.com/data/products/17/3.jpg", "https://i.dummyjson.com/data/products/17/thumbnail.jpg"] }, { "id": 18, "title": "Oil Free Moisturizer 100ml", "description": "Dermive Oil Free Moisturizer with SPF 20 is specifically formulated with ceramides, hyaluronic acid & sunscreen.", "price": 40, "discountPercentage": 13.1, "rating": 4.56, "stock": 88, "brand": "Dermive", "category": "skincare", "thumbnail": "https://i.dummyjson.com/data/products/18/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/18/1.jpg", "https://i.dummyjson.com/data/products/18/2.jpg", "https://i.dummyjson.com/data/products/18/3.jpg", "https://i.dummyjson.com/data/products/18/4.jpg", "https://i.dummyjson.com/data/products/18/thumbnail.jpg"] }, { "id": 19, "title": "Skin Beauty Serum.", "description": "Product name: rorec collagen hyaluronic acid white face serum riceNet weight: 15 m", "price": 46, "discountPercentage": 10.68, "rating": 4.42, "stock": 54, "brand": "ROREC White Rice", "category": "skincare", "thumbnail": "https://i.dummyjson.com/data/products/19/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/19/1.jpg", "https://i.dummyjson.com/data/products/19/2.jpg", "https://i.dummyjson.com/data/products/19/3.png", "https://i.dummyjson.com/data/products/19/thumbnail.jpg"] }, { "id": 20, "title": "Freckle Treatment Cream- 15gm", "description": "Fair & Clear is Pakistan's only pure Freckle cream which helpsfade Freckles, Darkspots and pigments. Mercury level is 0%, so there are no side effects.", "price": 70, "discountPercentage": 16.99, "rating": 4.06, "stock": 140, "brand": "Fair & Clear", "category": "skincare", "thumbnail": "https://i.dummyjson.com/data/products/20/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/20/1.jpg", "https://i.dummyjson.com/data/products/20/2.jpg", "https://i.dummyjson.com/data/products/20/3.jpg", "https://i.dummyjson.com/data/products/20/4.jpg", "https://i.dummyjson.com/data/products/20/thumbnail.jpg"] }, { "id": 21, "title": "- Daal Masoor 500 grams", "description": "Fine quality Branded Product Keep in a cool and dry place", "price": 20, "discountPercentage": 4.81, "rating": 4.44, "stock": 133, "brand": "Saaf & Khaas", "category": "groceries", "thumbnail": "https://i.dummyjson.com/data/products/21/thumbnail.png", "images": ["https://i.dummyjson.com/data/products/21/1.png", "https://i.dummyjson.com/data/products/21/2.jpg", "https://i.dummyjson.com/data/products/21/3.jpg"] }, { "id": 22, "title": "Elbow Macaroni - 400 gm", "description": "Product details of Bake Parlor Big Elbow Macaroni - 400 gm", "price": 14, "discountPercentage": 15.58, "rating": 4.57, "stock": 146, "brand": "Bake Parlor Big", "category": "groceries", "thumbnail": "https://i.dummyjson.com/data/products/22/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/22/1.jpg", "https://i.dummyjson.com/data/products/22/2.jpg", "https://i.dummyjson.com/data/products/22/3.jpg"] }, { "id": 23, "title": "Orange Essence Food Flavou", "description": "Specifications of Orange Essence Food Flavour For Cakes and Baking Food Item", "price": 14, "discountPercentage": 8.04, "rating": 4.85, "stock": 26, "brand": "Baking Food Items", "category": "groceries", "thumbnail": "https://i.dummyjson.com/data/products/23/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/23/1.jpg", "https://i.dummyjson.com/data/products/23/2.jpg", "https://i.dummyjson.com/data/products/23/3.jpg", "https://i.dummyjson.com/data/products/23/4.jpg", "https://i.dummyjson.com/data/products/23/thumbnail.jpg"] }, { "id": 24, "title": "cereals muesli fruit nuts", "description": "original fauji cereal muesli 250gm box pack original fauji cereals muesli fruit nuts flakes breakfast cereal break fast faujicereals cerels cerel foji fouji", "price": 46, "discountPercentage": 16.8, "rating": 4.94, "stock": 113, "brand": "fauji", "category": "groceries", "thumbnail": "https://i.dummyjson.com/data/products/24/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/24/1.jpg", "https://i.dummyjson.com/data/products/24/2.jpg", "https://i.dummyjson.com/data/products/24/3.jpg", "https://i.dummyjson.com/data/products/24/4.jpg", "https://i.dummyjson.com/data/products/24/thumbnail.jpg"] }, { "id": 25, "title": "Gulab Powder 50 Gram", "description": "Dry Rose Flower Powder Gulab Powder 50 Gram • Treats Wounds", "price": 70, "discountPercentage": 13.58, "rating": 4.87, "stock": 47, "brand": "Dry Rose", "category": "groceries", "thumbnail": "https://i.dummyjson.com/data/products/25/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/25/1.png", "https://i.dummyjson.com/data/products/25/2.jpg", "https://i.dummyjson.com/data/products/25/3.png", "https://i.dummyjson.com/data/products/25/4.jpg", "https://i.dummyjson.com/data/products/25/thumbnail.jpg"] }, { "id": 26, "title": "Plant Hanger For Home", "description": "Boho Decor Plant Hanger For Home Wall Decoration Macrame Wall Hanging Shelf", "price": 41, "discountPercentage": 17.86, "rating": 4.08, "stock": 131, "brand": "Boho Decor", "category": "home-decoration", "thumbnail": "https://i.dummyjson.com/data/products/26/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/26/1.jpg", "https://i.dummyjson.com/data/products/26/2.jpg", "https://i.dummyjson.com/data/products/26/3.jpg", "https://i.dummyjson.com/data/products/26/4.jpg", "https://i.dummyjson.com/data/products/26/5.jpg", "https://i.dummyjson.com/data/products/26/thumbnail.jpg"] }, { "id": 27, "title": "Flying Wooden Bird", "description": "Package Include 6 Birds with Adhesive Tape Shape: 3D Shaped Wooden Birds Material: Wooden MDF, Laminated 3.5mm", "price": 51, "discountPercentage": 15.58, "rating": 4.41, "stock": 17, "brand": "Flying Wooden", "category": "home-decoration", "thumbnail": "https://i.dummyjson.com/data/products/27/thumbnail.webp", "images": ["https://i.dummyjson.com/data/products/27/1.jpg", "https://i.dummyjson.com/data/products/27/2.jpg", "https://i.dummyjson.com/data/products/27/3.jpg", "https://i.dummyjson.com/data/products/27/4.jpg", "https://i.dummyjson.com/data/products/27/thumbnail.webp"] }, { "id": 28, "title": "3D Embellishment Art Lamp", "description": "3D led lamp sticker Wall sticker 3d wall art light on/off button  cell operated (included)", "price": 20, "discountPercentage": 16.49, "rating": 4.82, "stock": 54, "brand": "LED Lights", "category": "home-decoration", "thumbnail": "https://i.dummyjson.com/data/products/28/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/28/1.jpg", "https://i.dummyjson.com/data/products/28/2.jpg", "https://i.dummyjson.com/data/products/28/3.png", "https://i.dummyjson.com/data/products/28/4.jpg", "https://i.dummyjson.com/data/products/28/thumbnail.jpg"] }, { "id": 29, "title": "Handcraft Chinese style", "description": "Handcraft Chinese style art luxury palace hotel villa mansion home decor ceramic vase with brass fruit plate", "price": 60, "discountPercentage": 15.34, "rating": 4.44, "stock": 7, "brand": "luxury palace", "category": "home-decoration", "thumbnail": "https://i.dummyjson.com/data/products/29/thumbnail.webp", "images": ["https://i.dummyjson.com/data/products/29/1.jpg", "https://i.dummyjson.com/data/products/29/2.jpg", "https://i.dummyjson.com/data/products/29/3.webp", "https://i.dummyjson.com/data/products/29/4.webp", "https://i.dummyjson.com/data/products/29/thumbnail.webp"] }, { "id": 30, "title": "Key Holder", "description": "Attractive DesignMetallic materialFour key hooksReliable & DurablePremium Quality", "price": 30, "discountPercentage": 2.92, "rating": 4.92, "stock": 54, "brand": "Golden", "category": "home-decoration", "thumbnail": "https://i.dummyjson.com/data/products/30/thumbnail.jpg", "images": ["https://i.dummyjson.com/data/products/30/1.jpg", "https://i.dummyjson.com/data/products/30/2.jpg", "https://i.dummyjson.com/data/products/30/3.jpg", "https://i.dummyjson.com/data/products/30/thumbnail.jpg"] }];
  return productList;
}
function getDataFromStorage() {
  var data = localStorage.getItem("productList");
  data = JSON.parse(data);
  return data;
}

function createHeader() {
  var main_container = document.querySelector(".main-container");
  var header = document.createElement("header");
  header.setAttribute("style", "height:70px; width:100% ;");
  header.setAttribute("class", " bg-success d-flex justify-content-between align-items-center");

  // logo div
  var logo = document.createElement("div");
  logo.setAttribute("style", "height:60px; width:20%");
  logo.setAttribute("class", "d-flex justify-content-center align-item-center");

  // search div
  var search = document.createElement("div");
  search.setAttribute("style", "height:60px; width:60% ;");
  search.setAttribute("class", "d-flex justify-content-center align-item-center mt-4;position:absolute;");

  // sign in and sign out div 
  var nav = document.createElement("div");
  nav.setAttribute("style", "height:60px; width:20%");
  nav.setAttribute("class", "d-flex justify-content-evenly align-item-center text-white");

  // logo img
  var logoImg = document.createElement("span");
  logoImg.innerHTML = "Shopping";
  logoImg.setAttribute("style", " color:white; font-size:40px;");
  logo.appendChild(logoImg);

  //  search input field
  var searchInput = document.createElement("input");
  searchInput.setAttribute("type", "text");
  searchInput.setAttribute("placeholder", "Search");
  searchInput.setAttribute("style", "height:45px; width:40% ;border:none");
  searchInput.setAttribute("class", "p-3 rounded-pill mt-2");
  searchInput.setAttribute("id", "searchKeyword");
  searchInput.addEventListener("keyup", () => {
    SearchProduct();
  });
  search.appendChild(searchInput);

  //  search icon
  var searchIcon = document.createElement("i");
  searchIcon.setAttribute("class", "fa-solid fa-magnifying-glass");
  searchIcon.setAttribute("style", "font-size:20px;position:relative;left:-35px; top:20px");
  search.appendChild(searchIcon);


  if (isLoggedIn()) {
    var viewCart = document.createElement("span");
    viewCart.innerHTML = "ViewCart";
    viewCart.setAttribute("style", "cursor:pointer; font-size:20px;margin-top:10px;");
    // ==============View Cart EventListener=======================
    viewCart.addEventListener("click", () => {
      viewCartFun();

    });




    var signOut = document.createElement("span");
    signOut.innerHTML = "Sign Out";
    signOut.setAttribute("style", "cursor:pointer; font-size:20px ;margin-top:10px;");

    // =============SIGN OUT =======================

    signOut.addEventListener("click", () => {
      signOutFun();
    })

    nav.appendChild(viewCart);
    nav.appendChild(signOut);
  }
  else {
    // sign in
    var signIn = document.createElement("span");
    signIn.innerText = "Sign in";
    signIn.setAttribute("style", "cursor: pointer;font-size:20px;margin-top:10px;");
    signIn.addEventListener("click", () => {
      signInPage();
    })
    nav.appendChild(signIn);



    //  sign Up
    var signUp = document.createElement("span");
    signUp.innerText = "Sign up";
    signUp.setAttribute("style", "cursor: pointer; font-size:20px;margin-top:10px;");
    signUp.addEventListener("click", () => {
      signUpPage();
    });
    nav.appendChild(signUp);
  }

  header.appendChild(logo);
  header.appendChild(search);
  header.appendChild(nav);
  main_container.appendChild(header);

}
// ===================SIGN UP PAGE=====================
function signUpPage() {
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";

  var formContainerDiv = document.createElement("div");
  formContainerDiv.setAttribute("id", "formContainerDiv");
  var formContainer = document.createElement("div");

  formContainer.setAttribute("style", "height: 250px; width: 300px; position:absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); box-shadow: 0px 0px 10px 10px grey; border-radius: 10px; background-color: whitesmoke;");
  formContainer.setAttribute("class", "d-flex flex-column  justify-content-center");

  // =============CROSS BUTTON============
  var i = document.createElement("i");
  i.setAttribute("class", "fa-solid fa-circle-xmark")
  i.setAttribute("style", "font-size:40px; color:#C70039; margin-left:270px; margin-top:-30px;cursor:pointer");
  i.addEventListener("click", () => {
    var formContainer = document.querySelector("#formContainerDiv");
    formContainer.innerHTML = "";
    createHeader();
    createCart(data);
  });


  // email input field
  var emailInput = document.createElement("input");
  emailInput.setAttribute("type", "email");
  emailInput.setAttribute("placeholder", "Enter email");
  emailInput.setAttribute("id", "email");
  emailInput.setAttribute("style", "width: 80%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px;margin-top: 10px; margin-left: 30px;");




  // password input field
  var passwordInput = document.createElement("input");
  passwordInput.setAttribute("type", "password");
  passwordInput.setAttribute("placeholder", "Enter password");
  passwordInput.setAttribute("id", "password");
  passwordInput.setAttribute("style", "width: 80%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px; margin-left: 30px;");

  // signUp button
  var signdiv = document.createElement("div");
  var signUpButton = document.createElement("div");
  signUpButton.innerHTML = "sign up";
  signUpButton.setAttribute("class", "btn btn-success m-3");
  signUpButton.setAttribute("style", "width:30%;");


  // signup button eventListener
  signUpButton.addEventListener("click", () => {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    if (isUserExits(email, password)) {
      window.alert("User already exits");
    }
    else {
      var userData = { email: email, password: password };
      var userList = JSON.parse(localStorage.getItem("userList"));
      userList.push(userData);
      localStorage.setItem("userList", JSON.stringify(userList));
      window.alert("Your account successfully created: ");;

    }
  });

  // alredy have account
  var newAccount = document.createElement("span");
  newAccount.innerHTML = "alredy have account";
  newAccount.setAttribute("style", "cursor: pointer;");

  newAccount.addEventListener("click", () => {
    signInPage();
  });

  formContainer.appendChild(i);
  formContainer.appendChild(emailInput);
  formContainer.appendChild(passwordInput);
  formContainer.appendChild(signdiv);
  signdiv.appendChild(signUpButton);
  signdiv.appendChild(newAccount);
  formContainerDiv.appendChild(formContainer);
  main_container.appendChild(formContainerDiv);
}

// IS USER EXITS OR NOT
function isUserExits(email, password) {
  // get data into local storage
  var userData = localStorage.getItem("userList");
  userData = JSON.parse(userData);

  var user = userData.find((user) => {
    return user.email == email;
  });
  return !!user;
}

// =======================SIGN -IN-PAGE===========================
function signInPage() {
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";

  var formContainerDiv = document.createElement("div");
  formContainerDiv.setAttribute("id", "formContainerDiv");
  var formContainer = document.createElement("div");
  formContainer.setAttribute("style", "height: 250px; width: 300px; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); box-shadow: 0px 0px 10px 10px grey; border-radius: 10px; background-color: whitesmoke;");
  formContainer.setAttribute("class", "d-flex flex-column  justify-content-center");
  formContainer.setAttribute("id", "formContainer");


  // =============CROSS BUTTON============
  var i = document.createElement("i");
  i.setAttribute("class", "fa-solid fa-circle-xmark")
  i.setAttribute("style", "font-size:40px; color:#C70039; margin-left:270px; margin-top:-30px;cursor:pointer");
  i.addEventListener("click", () => {
    var formContainer = document.querySelector("#formContainerDiv");
    formContainer.innerHTML = "";
    createHeader();
    createCart(data);
  });

  // email input field
  var emailInput = document.createElement("input");
  emailInput.setAttribute("type", "email");
  emailInput.setAttribute("placeholder", "Enter email");
  emailInput.setAttribute("id", "email");
  emailInput.setAttribute("style", "width: 80%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px; margin-left: 30px;");


  // password input field
  var passwordInput = document.createElement("input");
  passwordInput.setAttribute("type", "password");
  passwordInput.setAttribute("placeholder", "Enter password");
  passwordInput.setAttribute("id", "password");
  passwordInput.setAttribute("style", "width: 80%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px; margin-left: 30px;"
  );

  // signIn button
  var signdiv = document.createElement("div");
  var signInButton = document.createElement("div");
  signInButton.innerHTML = "sign in";
  signInButton.setAttribute("class", "btn btn-success m-3");
  signInButton.setAttribute("style", "width:30%;");

  signInButton.addEventListener("click", () => {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    signInFun(email, password);
  });

  // alredy have account
  var newAccount = document.createElement("span");
  newAccount.innerHTML = "Create new account";
  newAccount.setAttribute("style", "cursor: pointer;");

  newAccount.addEventListener("click", () => {
    signUpPage();
  });
  formContainer.appendChild(i);
  formContainer.appendChild(emailInput);
  formContainer.appendChild(passwordInput);
  formContainer.appendChild(signdiv);
  signdiv.appendChild(signInButton);
  signdiv.appendChild(newAccount);
  formContainerDiv.appendChild(formContainer);
  main_container.appendChild(formContainerDiv);
}

//  sign in function
function signInFun(email, password) {
  var userList = localStorage.getItem("userList");
  userList = JSON.parse(userList);

  var checkUser = userList.find((user) => {
    return user.email = email && user.password == password;
  });
  if (checkUser) {
    window.alert("Sign in successfull");
    sessionStorage.setItem("isLoggedIn", "true");
    sessionStorage.setItem("currentUser", email);
    var main_container = document.getElementsByClassName(".main-container");
    main_container.innerHTML = "";
    var formContainer = document.getElementById("formContainer");
    formContainer.innerHTML = "";
    formContainer.remove();
    createHeader();
    var data = JSON.parse(localStorage.getItem("productList"));
    createCart(data);
  } else {
    window.alert("Sign in failed");
  }


}

function isLoggedIn() {
  return !!sessionStorage.getItem("isLoggedIn"); // true or null == false
}

// =========================================SIGN  OUT =====================
function signOutFun(main_container) {
  window.alert("Sign out succefully");
  sessionStorage.clear();
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";
  createHeader();
  var data = JSON.parse(localStorage.getItem("productList"));
  createCart(data);
}

function createCart(data) {
  var main_container = document.querySelector(".main-container");
  var cartContainer = document.createElement("div");
  cartContainer.setAttribute("class", "d-flex flex-wrap justify-content-evenly p-2 mt-3");
  cartContainer.setAttribute("id", "cart-container");

  var ind = 0 * 1;
  for (let product of data) {
    ind++;
    let cart = document.createElement("div");
    cart.setAttribute("style", "width:25%; height:400px; box-shadow: 0px 0px 10px 5px rgb(100, 100, 100);");
    cart.setAttribute("class", "m-3 d-flex flex-column align-items-center");

 
    // Product image
    let productImg = document.createElement("img");
    productImg.setAttribute("src", product.thumbnail);
    productImg.setAttribute("style", "height:200px;width:100%");

    // create title
    let title = document.createElement("h1");
    title.innerHTML = product.title;
    title.setAttribute(
      "style",
      "color: black; font-size: 25px; font-weight: 500; margin-top: 2px; margin-bottom: -1px"
    );

    // product price
    let price = document.createElement("div");
   

    // delete price

    let deletproduct = document.createElement("span");
    deletproduct.innerHTML = product.price;
    deletproduct.setAttribute("style", "color: red; font-size: 26px; font-weight: 700; text-decoration: line-through;");


    // discount price
    let discountPrice = (product.price * product.discountPercentage) / 100;
    let actualPrice = product.price - discountPrice.toFixed(2);

    let discountspan = document.createElement("span");
    discountspan.innerText = "Rs. " + actualPrice;
    discountspan.setAttribute("style", "color:green; font-size:20px; font-weight:700");

    //   View More
    let viewMore = document.createElement("p");
    viewMore.innerText = "View More";
    viewMore.setAttribute("style", "font-size:18px; font-weight:600; margin:0");


    // add to cart
    let addToCart = document.createElement("button");
    addToCart.id = "addtocart" + ind;
    addToCart.innerHTML = "Add To Card";
    addToCart.setAttribute(
      "style",
      "color: black; font-size: 20px; font-weight: 600; width: 90%; background-color:lightgreen; margin-top: 5px; padding: 3px; border: none; "
    );
    // let bt1Id = document.getElementById("addtocart");
    addToCart.addEventListener("mouseover", () => {
      addToCart.style.backgroundColor = "darkgreen";
      addToCart.style.color="white";
    });
    addToCart.addEventListener("mouseout", () => {
      addToCart.style.backgroundColor = "lightgreen";
      addToCart.style.color="black";

    });
    addToCart.addEventListener("click", () => {
      if (isLoggedIn()) {
        saveProductInToCart(product);
      }
      else {
        window.alert("sign in first... ");
      }
    });


    cart.appendChild(productImg);
    cart.appendChild(title);
    cart.appendChild(price);
    cart.appendChild(deletproduct);
    cart.appendChild(discountspan);
    cart.appendChild(viewMore);
    cart.appendChild(addToCart);
    cartContainer.appendChild(cart);

  }


  main_container.appendChild(cartContainer);
}

// save the proudect in to cart====================

function saveProductInToCart(product) {
  var currentUser = sessionStorage.getItem("currentUser");
  var cartList = JSON.parse(localStorage.getItem("cartList"));
  let currentUserCartItems = cartList.find((obj) => { return obj.email == currentUser });
  if (currentUserCartItems) {
    var currentUserItemList = currentUserCartItems.cartItems;
    var productObj = currentUserItemList.find((obj) => { return obj.id == product.id });
    console.log(productObj);
    if (productObj)
      window.alert("Product is already added into cart");
    else {
      var index = cartList.findIndex((obj) => { return obj.email == currentUser });
      product.qty = 1;
      currentUserCartItems.cartItems.push(product);
      cartList.splice(index, 1);
      cartList.push(currentUserCartItems);
      localStorage.setItem("cartList", JSON.stringify(cartList));
      window.alert("Product added successfully...");
    }
  }
  else {
    var obj = { email: currentUser, cartItems: [] };
    product.qty = 1;
    obj.cartItems.push(product);
    cartList.push(obj);
    localStorage.setItem("cartList", JSON.stringify(cartList));
    window.alert("Product successfully added");
  }
}

// =====================VIEW CART FUNCTION==============
function viewCartFun() {
  var cartDiv = document.querySelector("#cart-container");
  cartDiv.innerHTML = "";
  var currentUser = sessionStorage.getItem("currentUser");
  // window.alert(currentUser);
  var cartList = JSON.parse(localStorage.getItem("cartList"));
  var currentUserCartList = cartList.find((obj) => { return obj.email == currentUser });
  var cartItems = currentUserCartList.cartItems;

  var container = document.createElement("div");
  container.setAttribute("class", "container mt-5")
  container.setAttribute("id", "viewcartFun");


  var rowDiv = document.createElement("div");
  rowDiv.setAttribute("class", "row");

  var leftConatiner = document.createElement("div");
  leftConatiner.setAttribute("class", "col-md-8");
  leftConatiner.setAttribute("id", "leftContainer");

  // creating table in left container
  var table = document.createElement("table");
  table.setAttribute("class", "table table-bordered table-striped");
  table.setAttribute("style", "background-color:rgb(194, 246, 194)");

  var thead = document.createElement("thead");
  var tr = document.createElement("tr");
  var sNo = document.createElement("th");
  sNo.innerText = "S.No. ";
  tr.appendChild(sNo);

  var name = document.createElement("th");
  name.innerHTML = "Name";
  tr.appendChild(name);
  var price = document.createElement("th");
  price.innerHTML = "Price";
  tr.appendChild(price);
  var qty = document.createElement("th");
  qty.innerHTML = "Quantity";
  tr.appendChild(qty);
  var total = document.createElement("th");
  total.innerText = "Total";
  tr.appendChild(total);
  var del = document.createElement("th");
  del.innerHTML = "Delete";
  tr.appendChild(del);


  thead.appendChild(tr);



  var tbody = document.createElement("tbody");
  for (let index in cartItems) {
    let tr = document.createElement("tr");
    let sNo = document.createElement("td");
    sNo.innerText = "" + ((index * 1) + 1);
    tr.appendChild(sNo);

    let name = document.createElement("td");
    name.innerHTML = cartItems[index].title;
    tr.appendChild(name);


    let discountPrice = (cartItems[index].price * cartItems[index].discountPercentage) / 100;
    let actualPrice = cartItems[index].price - discountPrice.toFixed(2);


    let price = document.createElement("td");
    price.innerHTML = actualPrice;
    tr.appendChild(price);

    let qty = document.createElement("td");
    qty.innerHTML = "<input onchange='updateQty(" + cartItems[index].id + "," + index + ")'; style='width:50px'; id='qtyChange" + index + "'; type='number' min='1' value='" + resetQuantity(index) + "'>";
    tr.appendChild(qty);

    let total = document.createElement("td");
    total.setAttribute("id", "total" + index);
    total.innerHTML = actualPrice;
    tr.appendChild(total);
    tbody.appendChild(tr);

    let deletebutton = document.createElement("td");
    let i = document.createElement("i");
    i.setAttribute("class", "fa-solid fa-trash ms-3");
    i.setAttribute("id", "" + index);

    i.addEventListener("click", () => {
      deleteProduct(index);
    });

    deletebutton.appendChild(i);
    tr.appendChild(deletebutton);

  }
  // ================BACK BUTTON============
  backButton = document.createElement("button");
  backButton.innerText = "Back";
  backButton.setAttribute("class", "btn btn-success");
  backButton.addEventListener("click", () => {
    var viewcartnone = document.querySelector(".main-container");
    viewcartnone.innerHTML = "";
    createHeader();
    createCart(data);
  });

  table.appendChild(thead);
  table.appendChild(tbody);
  leftConatiner.appendChild(table);
  leftConatiner.appendChild(backButton);

  // =============RIGHT CONTAINER=============
  var rightContainer = document.createElement("div");
  rightContainer.setAttribute("id", "rightContainer");
  rightContainer.setAttribute("class", "col-md-3 offset-1");
  rightContainer.setAttribute("style", "font-weight:500; height:250px;box-shadow:10px 10px 10px grey");


  var h1 = document.createElement("h1");
  h1.innerHTML = "Order Details";
  h1.setAttribute("class", "text-center");
  var hr = document.createElement("hr");

  var totalItems = document.createElement("p");
  totalItems.innerHTML = "Total items :" + cartItems.length;

  var totalBillAmount = document.createElement("p");
  totalBillAmount.setAttribute("id", "totalBillLabel");
  totalBillAmount.innerHTML = "Total Bill :" + getBillAmount();

  var checkoutButton = document.createElement("button");
  checkoutButton.innerText = "Checkout";
  checkoutButton.setAttribute("class", "btn btn-success");
  checkoutButton.setAttribute("style", "width:80%; margin:auto;");

  // check Button event listener
  checkoutButton.addEventListener("click", () => {
    checkButtonForm();

  });


  rightContainer.appendChild(h1);
  rightContainer.appendChild(hr);
  rightContainer.appendChild(totalItems);
  rightContainer.appendChild(totalBillAmount);
  rightContainer.appendChild(checkoutButton);
  rowDiv.appendChild(leftConatiner);
  rowDiv.appendChild(rightContainer);

  container.appendChild(rowDiv);
  cartDiv.appendChild(container);
}
// ==========checkOutButtonForm=============
function checkButtonForm() {
  var carts = document.querySelector("#cart-container");
  carts.innerHTML = "";

  var formdiv = document.createElement("div");
  formdiv.setAttribute("style", "width:30%;margin-top:50px;box-shadow:10px 10px 10px gray;background-color:rgb(209, 250, 209)");
  formdiv.setAttribute("id", "formDiv");

  var form = document.createElement("form");
  form.setAttribute("class", "form-group");
  form.setAttribute("id","formId");
  form.setAttribute("style", "width:70%; margin-left:50px");

  var heading = document.createElement("h1");
  heading.innerHTML = "Address Details";
  heading.setAttribute("style", "font-size:30px;margin-left:35px;margin-top:20px");



  var nameInput = document.createElement("input");

  nameInput.setAttribute("type", "text");

  nameInput.setAttribute("placeholder", "Name");
  nameInput.setAttribute("pattern","[A-Za-z]{1,32}");
  nameInput.setAttribute("title","Enter only alphabets");
  nameInput.setAttribute("required","");
  nameInput.setAttribute("class", "form-control mt-3");



  var PhoneNumber = document.createElement("input");
  PhoneNumber.setAttribute("type", "tl");
  PhoneNumber.setAttribute("placeholder", "PhoneNumber");
  PhoneNumber.setAttribute("class", "form-control mt-3");
  PhoneNumber.setAttribute("pattern","[0-9]{10}");
  PhoneNumber.setAttribute("required","");
  PhoneNumber.setAttribute("title","Enter only number");


  var email = document.createElement("input");
  email.setAttribute("type", "email");
  email.setAttribute("placeholder", "Email");
  email.setAttribute("class", "form-control mt-3");
  email.setAttribute("pattern","[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$");
  email.setAttribute("required","");
  email.setAttribute("title","Enter valid email");


  var cardNumber = document.createElement("input");
  cardNumber.setAttribute("class", "form-control mt-3");
  cardNumber.setAttribute("type", "text");
  cardNumber.setAttribute("placeholder", "CardNumber");
  cardNumber.setAttribute("required", "");
  cardNumber.setAttribute("pattern","[0-9]{3}");
  cardNumber.setAttribute("title","Enter only three  numbers");

  var address = document.createElement("textarea");
  address.setAttribute("type", "address");
  address.setAttribute("placeholder", "Address");
  address.setAttribute("style", "height:100px");
  address.setAttribute("class", "form-control mt-3");
 




  var payButton = document.createElement("button");
  payButton.setAttribute("class", "btn btn-success mt-3 mb-3");
  payButton.setAttribute("type", "submit");
  payButton.innerText = "Pay to Card";
  payButton.setAttribute("style", "margin-left:20px");

  var backButton = document.createElement("button");
  backButton.setAttribute("class", "btn btn-success mt-3 mb-3 ms-3");
  backButton.innerText = "Back";

  // =======================
  backButton.addEventListener("click", () => {
    var removeFormDiv = document.querySelector("#formDiv");
    removeFormDiv.innerHTML = "";
    viewCartFun();

  });

  formdiv.appendChild(form);

  form.appendChild(heading);
  form.appendChild(nameInput);
  form.appendChild(PhoneNumber);
  form.appendChild(email);
  form.appendChild(cardNumber);
  form.appendChild(address);
  form.appendChild(backButton);
  form.appendChild(payButton);
  carts.appendChild(formdiv);
}


function deleteProduct(index) {

  var currentUser = sessionStorage.getItem("currentUser");
  var cartList = JSON.parse(localStorage.getItem("cartList"));

  var currentusercartList = cartList.find((obj) => { return obj.email == currentUser });
  var currentUserCartItems = currentusercartList.cartItems;

  currentUserCartItems.splice(index, 1);

  var currentuserIndex = cartList.findIndex((obj) => { return obj.email == currentUser });
  cartList.splice(currentuserIndex, 1, currentusercartList);

  localStorage.setItem("cartList", JSON.stringify(cartList));

  viewCartFun();
}
function getBillAmount() {
  var currentUser = sessionStorage.getItem("currentUser");
  var cartList = JSON.parse(localStorage.getItem("cartList"));
  var currentUserCartList = cartList.find((obj) => { return obj.email == currentUser });
  var cartItems = currentUserCartList.cartItems;
  var totalBill = 0;
  for (var product of cartItems) {
    totalBill = totalBill + product.price * 1 * product.qty * 1;
  }
  return totalBill;
}
function updateQty(productId, index) {
  var qty = document.querySelector("#qtyChange" + index).value;
  var total = document.querySelector("#total" + index);

  var currentUser = sessionStorage.getItem("currentUser");
  var cartList = JSON.parse(localStorage.getItem("cartList"));
  var currentUserCartList = cartList.find((obj) => { return obj.email == currentUser });
  var cartItems = currentUserCartList.cartItems;

  var productIndex = cartItems.findIndex((obj) => { return obj.id == productId });
  var product = cartItems[productIndex];
  product.qty = qty;

  cartItems.splice(productIndex, 1);
  cartItems.splice(productIndex, 0, product);

  currentUserCartList.cartItems = cartItems;

  var currentUserCartListIndex = cartList.findIndex((obj) => { return obj.email == currentUser });
  cartList.splice(currentUserCartListIndex, 1);
  cartList.splice(currentUserCartListIndex, 0, currentUserCartList);
  localStorage.setItem("cartList", JSON.stringify(cartList));

  let discountPrice = (product.price * product.discountPercentage) / 100;
  let acPrice = (product.price - discountPrice).toFixed(2);
  total.innerText = "" + (acPrice * qty).toFixed(2);
  
  var totalBillLabel = document.querySelector("#totalBillLabel");
  totalBillLabel.innerHTML = "<p>Total Bill : " + getBillAmount() + "</p>";
}
function SearchProduct() {
  var keywords = document.querySelector("#searchKeyword").value;
  var productList = JSON.parse(localStorage.getItem("productList"));
  var filterData = productList.filter((product) => { return product.title.toUpperCase().includes(keywords.toUpperCase()) });

  document.querySelector("#cart-container").remove();
  if (filterData.length == 0)
    createCart(productList);
  else
    createCart(filterData);
}
function resetQuantity(index) {
  let cartList = JSON.parse(localStorage.getItem("cartList"));
  let currentUser = sessionStorage.getItem("currentUser");

  let user = cartList.find((user) => {
    return user.email == currentUser;
  });

  let qty = user.cartItems[index].qty;
  return qty;
}