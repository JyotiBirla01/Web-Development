// import { request } from "express";
import { request, response } from "express";
import Product from "../modals/product.model.js";


// Add data
export const products = (request, response, next) => {
    let filename = request.file.filename;
    console.log(filename);
    let title = request.body.title;
    let brand = request.body.brand;
    let price = request.body.price;
    let description = request.body.description;
    let imageUrl = "images/" + filename;
    console.log(imageUrl)
    let categoryId = request.body.categoryId;

    let product = new Product(null, title, price, brand, description, imageUrl, categoryId);
    product.insertProducts()
        .then(result => {
            return response.status(201).json({ message: "Data inserted succesfully" })
        })
        .catch(err => {
            console.log(err);
            return response.status(500).json({ err: "Internal server error" });
        })
}


// Get all  products
export const getProducts=(request,response,next)=>{
    Product.getProducts()   
    .then(result=>{
        return response.status(201).json({data:result});
    })
    .catch(err=>{
        console.log(err);
        return response.status(500).json({err:"Internal server error"});
    })

}


// Get product By id
export const getProductById=(request,response,next)=>{
    let productId=request.params.productId;
    Product.getProductById(productId)
    .then(result=>{
        return response.status(201).json({data:result})
    })
    .catch(err=>{
        console.log(err);
        return response.status(500).json({err:"Internal service error"});
    })

}


// delete Product
export const deleteProduct=(request,response,next)=>{
    let productId=request.params.productId;
    Product.deleteProduct(productId)
    .then(result=>{
        if(result.affectedRows!=0)
        return response.status(201).json({message:"Product deleted succesfully",data:{result}})
        return response.status(400).json({ message: "Bad request category  not found " });

    })
    .catch(err=>{
        console.log(err);
        return response.status(500).json({err:"Internal Server Error"})
    })
}


// Update Product 
export const updateProduct=(request,response,next)=>{
    let title=request.body.title;
    let id=request.body.id;
    Product.updateProduct()
    .then(result=>{
        return response.status(201).json({message:"Product Updated succesfully",data:result})
    })
    .catch(err=>{
        return response.status(500).json({err:"Internal server error"});
    })
}

