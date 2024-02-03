
import pool from "../db/dbconfig.js";

class Category {
    constructor(id, categoryName) {
        this.id = id;
        this.categoryName = categoryName;

    }


    productCategory() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    console.log("Connection time errr");
                    reject(err);
                }
                else {
                    let insertQuery = "insert into category(categoryName) values(?)";
                    conn.query(insertQuery, [this.categoryName], (err, result) => {
                        if (err) {
                            console.log("data insert time errrr" + err);
                            reject(err);
                        }
                        else
                            resolve(result);
                        conn.release();
                    });
                }
            });
        });
    }

    static deleteCategory(id) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);
                }
                else {
                    let deleteQuery = "delete from category where id=?";
                    conn.query(deleteQuery, [id * 1], (err, result) => {
                        if (err)
                            reject(err);
                        else
                            resolve(result);
                        conn.release();
                    });

                }
            })

        })
    }


    static getCategoryById(id) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);

                }
                else {
                    let sql = "select * from category where id=?";
                    conn.query(sql, [id], (err, result) => {
                        if (err) {
                            console.log(err);
                            reject(err);
                        }
                        else
                            resolve(result);
                        conn.release();
                    })
                }
            })
        })

    }

      
static list(){
    return new Promise((resolve,reject)=>{
     pool.getConnection((err,con)=>{
         if(err)
           reject(err);
         else{
             let sql = "select * from category";
             con.query(sql,(err,result)=>{
               err ? reject(err) : resolve(result);
               con.release();
             });
         }  
     })
    });
 }

}

export default Category;