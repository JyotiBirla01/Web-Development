import express, { request, response } from "express";
import bodyParser from "body-parser";
import pool from "./dataconnection.js";

// create object of express
const app=express();


app.use(bodyParser.urlencoded({extended:true}));
app.use(bodyParser.json());

// Admin sigup
app.post("/userSignup",(request,response,next)=>{
let adminName=request.body.adminName;
let password=request.body.password;

pool.getConnection((err,con)=>{
if(!err){
    let insertQuery="insert into admin (adminName,password) values (?,?)";
    con.query(insertQuery,[adminName,password],(err,result)=>{
if(err)
return response.status(401).json({error:"Bad request"});
else
return response.status(200).json({message:"sign up succesfully",data:{adminName,password}});
con.release();

    });
}
else{
    console.log("Connection Fail");
}
})
});

// Admin Signin

add.post("/userSignin",(request,response,next)=>{
let adminName=request.body.adminName;
let password=request.body.password;

pool.getConnection((err,con)=>{
if(!err){
    let selectQuery="select * from admin where adminName=? and password=?";
}
});
});

// It is used to start the server.
app.listen(3000,()=>{
    console.log("Server Created...");
});