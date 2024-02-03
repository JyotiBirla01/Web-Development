import express from "express";
import bodyParser from "body-parser";
import pool from "./dataconn.js";

const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());


app.post("/insertdata", (request, response, next) => {
    console.log("Hello");
   
    let id = request.body.id*1;
    let name = request.body.name;
    let address = request.body.address;
    let contact = request.body.contact;

    pool.getConnection((err, con) => {
        if (!err) {
            const sql = "insert into student (id,name,address,contact) values (?,?,?,?)";
            con.query(sql, [id, name, address, contact], (err, result) => {
                if (err) {
                    return response.status(401).json({ error: "Bad request" });
                }
                else {
                    return response.status(201).json({ message: "Data inserted successfully ", data: { id, name, address, contact } });
                }
                con.release();
                response.end();
            });
        }
        else {
            console.log("Connection fail");
            console.log(err);
        }
    });

    // delete data
    pool.getConnection((err,con)=>{
        if(!err){
            const deleteQuery="delete from student where id=?";
con.query(deleteQuery,[id,name,address,contact],(err,result)=>{
if(err){
    response.status(401).json({message:"Bad request"});
}
else{
    response.status(201).json({message:"Data deleted successfully",data:{id,name,address,contact}} );
}
con.release();
con.end();
});

        }
        else{
            console.log("Connection Fail");
        }

    });


});



app.listen(3000, () => {
    console.log("Server Created...");
});