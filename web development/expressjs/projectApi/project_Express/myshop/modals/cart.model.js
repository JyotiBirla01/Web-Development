import pool from "../db/dbconfig.js";
 export default class Cart {
    constructor(id, userId) {
        this.id = id;
        this.userId = userId;
    }

    static isCartExists(userId) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err)
                    reject(err)
                else {
                    let sql = "select * from cart where userId=?";
                    conn.query(sql, [userId], (err, result) => {
                        if (err)
                            reject(err);
                        else {
                            resolve(result);
                        }
                    });
                }
            })
        })
    }

    static createCart(userId) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err)
                    reject(err);
                else {
                    let sql = "insert into cart(userId) values (?)";
                    conn.query(sql, [userId], (err, result) => {
                        if (err)
                            reject(err)
                        else {
                            let sql = "select * from cart where userId=?";
                            conn.query(sql, [userId], (err, result) => {
                                err ? reject(err) : resolve(result);
                                conn.release();

                            })
                        }

                    })
                }
            })
        })
    }
}