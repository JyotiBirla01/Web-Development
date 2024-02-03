import express from "express";
// import OrderDetails from "../modules/orderDetails.model.js"
import { viewCancelOrderList, viewOrderList } from "../controllers/OrderDetails.controller.js";
const router=express.Router();
router.get("/viewOrderList",viewOrderList);
router.get("/viewCancelOrderList",viewCancelOrderList);
export default router;
