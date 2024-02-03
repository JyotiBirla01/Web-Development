import express from "express";
import bodyParser from "body-parser";
import pool  from "./dbconfi";

const app=express();

app.use(bodyParser.urlencoded({express:true}));
app.use(bodyParser.json);

app.get("/home",(request,response,next)=>{
response.write("Home Page");
response.end();
});

app.get("/about",(request,response,next)=>{
response.write("about page");
response.end();

});

app.get("/test",(request,response,next)=>{
response.write({message:"Hello Server"});
response.end();
});

