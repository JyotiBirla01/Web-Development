import pool from "../config/ConnectDb.js";
class OrderDetails {

    constructor(id, orderDate, orderAmount, deliveryAddress, personContactNumber, paymentMode, status, userId) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.deliveryAddress = deliveryAddress;
        this.personContactNumber = personContactNumber;
        this.paymentMode = paymentMode;
        this.status = status;
        this.userId = userId;
    }

    // view orderList of product 
    static viewOrderList() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, con) => {
                if (err)
                    reject(err)
                else {
                    let sql = 'select * from orderDetails;'
                    con.query(sql, (err, result) => {
                        console.log(result)
                        console.log(sql);
                        err ? reject(err) : resolve(result);
                    })
                }
            })
        })
    }
    static viewCancelOrderList() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, conn) => {
                if (err) {
                    reject(err);
                }
                else {
                    const sql = "select * from orderdetails where status='cancel'";
                    conn.query(sql, (err, result) => {
                        err ? reject(err) : resolve(result);
                    })
                }
            })
        })
    }
}
export default OrderDetails;