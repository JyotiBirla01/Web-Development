// import express from "express";
// import pool from "../config/ConnectDb.js";
// class User {
//     constructor(id, userName, email, password, contactNumber) {
//         this.id = id;
//         this.userName = userName;
//         this.email = email;
//         this.password = password;
//         this.contactNumber = contactNumber;
//     }

//     // USER SIGNUP
//     signUp() {
//         return new Promise((resolve, reject) => {
//             pool.getConnection((err, conn) => {
//                 if (err) {
//                     console.log(err);
//                     reject(err);
//                 }
//                 else {
//                     console.log('============================================', this.email);
//                     let sql = "insert into user(userName,email,password,contactNumber) values(?,?,?,?)";
//                     conn.query(sql, [this.userName, this.email, this.password, this.contactNumber], (err, result) => {
//                         if (err) {
//                             console.log(err);
//                             reject(err);
                            

//                         }
//                         else {
//                             resolve(result);
//                             conn.release();

//                         }
//                     })
//                 }
//             })
//         })
//     }

//     // User SignIn
//     signIn() {
//         return new Promise((resolve, reject) => {
//             pool.getConnection((err, conn) => {
//                 if (err) {
//                     reject(err);
//                 }
//                 else {
//                     let sql = "select * from user where email=? and password=?";
//                     conn.query(sql, [this.email, this.password], (err, result) => {
//                         if (err) {
//                             reject(err);

//                         }
//                         else if (result.length != 0) {
//                             resolve(result);
//                         }
//                         else{
//                             reject(err);
//                             conn.release();

//                         }
//                     })
//                 }
//             })
//         })
//     }

// }

// export default User;

import express from "express";
import pool from "../config/ConnectDb.js";
class User {
    constructor(id, userName, emailId,password, contacNumber) {
        this.id = id;
        this.userName = userName;
        this.emailId=emailId;
        this.password = password;
        this.contacNumber = contacNumber;
    }

    signUp() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    console.log(err);
                    reject(err);
                }
                else {
                    let insertQuery = "insert into user (userName,emailId,password,contacNumber) values(?,?,?)";
                    conn.query(insertQuery, [this.userName,this.emailId, this.password, this.contacNumber], (err, result) => {
                        if (err)
                            reject(err);
                        else
                            resolve(result);
                        conn.release();

                    });
                }
            });
        });
    }

    // VIEW USER LIST
     static viewUserList() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    console.log(err);
                    reject(err);
                }
                else {
                    let insertQuery = "select * from user";
                    conn.query(insertQuery,  (err, result) => {
                        if (err)
                            reject(err);
                        else
                            resolve(result);
                        conn.release();

                    });
                }
            });
        });
    }


}
export default User;