import express, { request, response } from "express";
import Category from "../modals/category.model.js";

// Add category 
export const productCategory = (request, response, next) => {
    let categoryName = request.body.categoryName;
    let category = new Category(null, categoryName);
    category.productCategory()
        .then(result => {
            return response.status(200).json({ message: "category added..." })
                .catch(result => {
                    return response.status(500).json({ message: "Internal Server Error" })
                });
        });


}

// delete category 
export const deleteCategory = (request, response, next) => {
    let categoryId = request.params.categoryIds;
    Category.deleteCategory(categoryId)
        .then(result => {
            if (result.affectedRows != 0)
                return response.status(200).json({ message: "Category deletd" });
            return response.status(400).json({ message: "Bad request category  not found " });

        })
        .catch(err => {
            return response.status(500).json({ error: "Internal Server Error" });
        });
}

// get category by id 
export const getCategoryById = (request, response, next) => {
    let categoryId = request.params.categoryId;
    Category.getCategoryById(categoryId)
        .then(result => {
            return response.status(201).json({ data: result })

        }).catch(err => {
            return response.status(500).json({ error: "Internal server error" });

        });

}



export const categoryList = (request,response,next)=>{
    Category.list()
    .then(result=>{
        return response.status(200).json({data:  result});
    }).catch(err=>{
        return response.status(500).json({err: 'Internal Server Error'});
    });
}


