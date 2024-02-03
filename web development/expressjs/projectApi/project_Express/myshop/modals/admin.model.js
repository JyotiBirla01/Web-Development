import pool from "../db/dbconfig.js";
class Admin {
    constructor(id, username, password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    signUp() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);
                }


                else {
                    let insertQuery = "insert into admin(username,password) values(?,?)";
                    conn.query(insertQuery, [this.username, this.password], (err, result) => {
                        if (err) {
                            console.log("data not inserted" + err);
                            reject(err);
                        }
                        else {
                            resolve(result);
                            conn.release();
                        }


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
                    reject(err);
                }
                else {
                    let selectQuery = "select * from admin where username=? and password=? ";
                    con.query(selectQuery, [this.username, this.password], (err, result) => {
                        if (err)
                            reject(err);
                        else if (result.length != 0)
                            resolve(result);
                        else
                            reject(err);
                    })

                }
            });

        });

    }

  


}

export default Admin;