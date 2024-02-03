import express from "express";

import { productCategory, deleteCategory, getCategoryById, categoryList } from "../controllers/category.controller.js";

// The express. Router() function is used to create a new router object.

const router = express.Router();

// http://localhost//3000/category/save
router.post("/save", productCategory);
router.get("/list", categoryList);
router.delete("/:categoryIds", deleteCategory);
router.get("/:categoryId", getCategoryById);

export default router;
