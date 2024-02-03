import express from "express";
import bodyParser  from "body-parser";
import orderDetailsRouter from "./routers/orderList.route.js";
import UserRouter from "./routers/user.route.js";
import CartRouter from "./routers/cart.router.js";

const app=express();

// For parse the data
app.use(bodyParser.urlencoded({extended:true}));
app.use(bodyParser.json());

app.use("/orderDetails",orderDetailsRouter);
app.use("/user",UserRouter);
app.use("/cart",CartRouter);




// For start the server 
app.listen(3000,()=>{
    console.log("Server Created");
})