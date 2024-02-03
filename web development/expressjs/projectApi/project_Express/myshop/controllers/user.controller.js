import { request, response } from "express";
import User from "../modals/user.model.js";
import jwt from 'jsonwebtoken'


export const signUp = (request, response, next) => {
    let username = request.body.username;
    let password = request.body.password;
    let contact = request.body.contact;

    let user = new User(null, username, password, contact);
    user.signUp()
        .then(result => {
            return response.status(200).json({ message: " User Sign up succefully" })
                .catch(result => {
                    return response.status(500).json({ message: "Internal Server Error" })
                });
        });

}

export const signIn = (request, response, next) => {
    let username = request.body.username;
    let password = request.body.password;

    // create the object of user class 
    // id is auto increment therefore we write null if we doen not write null then it take first rwo argument.
    let user = new User(null, username, password);

    user.signIn()
        .then(result => {
            if (result.length) {
                let payload = { subject: username };
                let token = jwt.sign(payload, "qwertyuiopasdfghjklzxcvbnm");
                return response.status(201).json({ message: "Sign in success", data: result[0], token: token });
            }
            else {
                return response.status(401).json({ message: "unauthorized request" });
            }
        })
        .catch(err => {
            return response.status(500).json({ err: "Internal server Error" });
        });
}



export const userUpdate = (request, response, next) => {
    let username = request.body.username;
    let password = request.body.password;

    let user = new User(null, username, password);

    user.userUpdate()
        .then(result => {
            return response.status(200).json({ message: "Data updated succesfully" })
                .catch(result => {
                    return response.status(500).json({ message: "Internal server error " });
                })
        })
}