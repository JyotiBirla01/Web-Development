import pool from "../db/dbconfig.js";
export default class Product {
    constructor(id, title, price, brand, description, imageUrl, categoryId) {
        this.id = id;
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }
    // insert product data 
    insertProducts() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, con) => {
                if (err) {
                    console.log(err);
                    reject(err);
                }
                else {
                    let sql = "insert into product( title, brand, price, description, imageUrl, categoryId) values(?,?,?,?,?,?)";
                    con.query(sql, [this.title, this.brand, this.price * 1, this.description, this.imageUrl, this.categoryId * 1], (err, result) => {
                        con.release();
                        err ? reject(err) : resolve(result);
                    });
                }
            })
        })
    }

    // get all the products  
    static getProducts() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);

                }
                else {
                    let sql = "select * from product";
                    conn.query(sql, (err, result) => {
                        if (err) {
                            reject(err);
                        }
                        else {
                            resolve(result);
                        }
                    });
                }
            })
        })
    }

    // get particular product by id
    static getProductById(id) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err)
                    reject(err);
                else {
                    const sql = "select * from product where id=?";
                    conn.query(sql, [id], (err, result) => {
                        if (err) {
                            console.log(err);
                            reject(err);
                        }
                        else {
                            console.log(err);
                            resolve(result);
                        }
                        conn.release();
                    })
                }
            });
        })
    }

    // delete product
    static deleteProduct(id) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);
                }
                else {
                    const sql = "delete from product where id =?";
                    conn.query(sql, [id], (err, result) => {
                        err ? reject(err) : resolve(result);
                        conn.release();


                    });
                }
            });
        });
    }


    // Update Product 
    updateProduct(){
        return new Promise((resolve,reject)=>{
            pool.getConnection((err,conn)=>{
                if(err)
                reject(err);
            else{
                const sql="update product set title=? where id=?"
                conn.query(sql,[this.title,this.id],(err,result)=>{
                    if(err)
                    reject(err);
                else{
                    resolve(result);
                }
                })
            }
            })
        })
    }
}
