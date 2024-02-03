import express from "express";
import { products,getProducts, getProductById, deleteProduct, updateProduct } from "../controllers/product.controller.js";
import multer from "multer";
import { verfifyToken } from "../middleware/auth.js";

// import multer for image  upload

const upload = multer({ dest: "public/images/" });

const router = express.Router();

// single is built in method for pass only one image 
router.post("/save", upload.single("imageUrl"), products);
router.get("/getProducts", verfifyToken,upload.single("imageUrl"),getProducts);
router.get("/:productId",getProductById);
router.delete("/:productId",deleteProduct);
router.get("/update",updateProduct);


export default router; 

 