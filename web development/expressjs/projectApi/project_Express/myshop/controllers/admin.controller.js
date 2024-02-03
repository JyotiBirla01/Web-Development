
import { request, response } from "express";
import Admin from "../modals/admin.model.js";
import Category from "../modals/category.model.js";
export const signUp=(request,response,next)=>{
let username=request.body.username;
let password=request.body.password;

// create the object of admin class 
// id is auto increment therefore we write null if we doen not write null then it take first rwo argument.
let admin=new Admin(null,username,password);

admin.signUp()
.then(result=>{
    return response.status(200).json({message:"Sign up succesfully"});
})
.catch(err=>{
    return response.status(500).json({err:"Internal server Error"});
});
}

export const signIn=(request,response,next)=>{
    let username=request.body.username;
    let password=request.body.password;
    
    // create the object of admin class 
    // id is auto increment therefore we write null if we doen not write null then it take first rwo argument.
    let admin=new Admin(null,username,password);
    
    admin.signIn()
    .then(result=>{
        return response.status(200).json({message:"Sign In succesfully"});
    })
    .catch(err=>{
        return response.status(500).json({err:"Internal server Error"});
    });
    }
