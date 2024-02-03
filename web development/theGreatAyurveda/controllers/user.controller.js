// import express from "express";
// import jwt from "jsonwebtoken";
// import User  from "../modules/User.model.js";



// export const signUp=(request,response,next)=>{
// let userName=request.body.userName;
// let email=request.body.email;
// let password=request.body.password;
// let contactNumber=request.body.contactNumber;


// // CREATE THE OBJECT OF USER CLASS
// let user =new User(null,userName,email,password,contactNumber)
// user.signUp()
// .then(result=>{
//     return response.status(200).json({message:"User Sign Up succesfully"})
// })
// .catch(err=>{
//     return response.status(500).json({message:"Internal Server Error",err});
// })


// }

// // USER SIGNIN
// export const signIn = (request, response, next) => {
//     let email = request.body.email;
//     let password = request.body.password;

    
//     let user = new User(null, username, password);

//     user.signIn()
//         .then(result => {
//             if (result.length) {
//                 let payload = { subject: email };
//                 let token = jwt.sign(payload, "qwertyuiopasdfghjklzxcvbnm");
//                 return response.status(201).json({ message: "Sign in success", data: result[0], token: token });
//             }
//             else {
//                 return response.status(401).json({ message: "unauthorized request" });
//             }
//         })
//         .catch(err => {
//             return response.status(500).json({ err: "Internal server Error" });
//         });
// }import { request, response } from "express";
import User from '../modules/User.model.js';



export const signUp = (request, response, next) => {
    let userName = request.body.userName;
    let emailId=request.body.emailId;
    let password = request.body.password;
    let contactNumber = request.body.contactNumber;

    let user = new User(null, userName,emailId, password, contactNumber);
    user.signUp()
        .then(result => {
            return response.status(200).json({ message: " User Sign up succefully" })
                .catch(result => {
                    return response.status(500).json({ message: "Internal Server Error" ,err})
                });
        });

}

// VIEW ALL THE USERS
export const viewUserList=(request,response,next)=>{
    User.viewUserList()  
    .then(result=>{
        return response.status(201).json({data:result});
    })
    .catch(err=>{
        console.log(err);
        return response.status(500).json({err:"Internal server error"});
    })

}
