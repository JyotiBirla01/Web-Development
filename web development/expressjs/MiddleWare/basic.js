import express, { request, response } from "express";
import bodyParser from "body-parser";

const app=express();

// bodyParser.urlencoded({extended: true}) is specifying that the middleware should parse URL-encoded data.
app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());

app.get("/home",(request ,response,next)=>{
response.write("Home page");
response.end();

});

app.get("/about",(request,response,next)=>{
    response.write("About Page"); 
    response.end();
});

app.get("/contact",(request,response,next)=>{
    response.write("Contact Page");
    response.end();
});

app.get("/test",(request,response,next)=>{
response.json({message:"Test page"});
});

app.use((request,response,next)=>{
    console.log("app.use() is executed ");
    response.end("Bad request ");
})

//POST METHOD
app.post("/signup",(request,response,next)=>{
    let username=request.body.username;
    let password=request.body.password;
    let email=request.body.email;
    let age=request.body.age;
    return response.json({data:{username,password,email,age}});
});

app.post("/add",(request,response,next)=>{
let a= request.body.a*1;
let b= request.body.b*1;
response.end("Addition "+(a+b));
});
app.listen(3000,()=>{
console.log("server created");
}); 