import express from "express";
import bodyParser from "body-parser";
import AdminRouter from "./routers/admin.route.js";
import UserRouter from "./routers/user.route.js";
import CategoryRouter from "./routers/category.router.js"
import ProductRouter from "./routers/product.router.js";
import CartRouter from "./routers/cart.router.js";


import path from "path";
import { fileURLToPath } from "url";
// import exp from "constants";

// Create object of express
const app = express();
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);


// For parse the datay
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use(express.static(path.join(__dirname, "public")));


app.use("/admin", AdminRouter);
app.use("/user", UserRouter);
app.use("/category", CategoryRouter);
app.use("/products", ProductRouter);
app.use("/cart",CartRouter);




// To start the server
app.listen(3000, () => {
    console.log("Server Created....")
});

