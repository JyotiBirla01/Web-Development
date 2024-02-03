import express from "express";

import {signUp,viewUserList} from "../controllers/user.controller.js"

const router=express.Router();
router.post("/signUp",signUp);
router.get("/viewUserList",viewUserList);

export default router;