import { request, response } from "express";
import pool from "../db/dbconfig.js";
class User {
    constructor(id, username, password, contact) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    signUp() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);
                }
                else {
                    let insertQuery = "insert into user (username,password,contactNo) values(?,?,?)";
                    conn.query(insertQuery, [this.username, this.password, this.contact], (err, result) => {
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




    // sign in
    signIn() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, con) => {
                if (err) {
                    console.log(err);
                    reject(err);
                }
                else {
                    let selectQuery = "select * from user where username=? and password=? ";
                    con.query(selectQuery, [this.username, this.password], (err, result) => {
                        if (err)
                        {console.log(err);
                            reject(err);}
                        else if (result.length != 0)
                            resolve(result);
                        else
                        console.log(err);
                            reject(err);
                        con.release();

                    })

                }
            });

        });

    }

    userUpdate() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err)
                    reject(err);
                else {
                    let updateQuery = "UPDATE user SET username = ?, password= ? WHERE id = ?";
                    conn.query(updateQuery, [this.username, this.password,this.id], (err, result) => {
                        if (err)
                            reject(err);
                        else
                            resolve(result);
                        conn.release();

                    });
                }
            })
        });
    }




}


export default User;