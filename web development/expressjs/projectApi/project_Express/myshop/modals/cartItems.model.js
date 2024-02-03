import pool from "../db/dbconfig.js";
 export default class CartItems {
    constructor(id, cartId, productId) {
        this.id = id;
        this.cartId = cartId;
        this.productId = productId;
    }

    static saveCartItem(cartId, productId) {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err)
                    reject(err);
                else {
                    let sql = "insert into cartItems (cartId,productId) values(?,?)";
                    conn.query(sql, [cartId, productId], (err, result) => {
                        err ? reject(err) : resolve(result);
                        conn.release();

                    });


                }
            });
        });
    }
}