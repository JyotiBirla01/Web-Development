import express from "express";
import User from "../modals/user.model.js";

import { signUp ,signIn, userUpdate} from "../controllers/user.controller.js";

const router=express.Router();
router.post("/signup",signUp);
router.post("/signin",signIn);
router.post("/update",userUpdate);


export default router;
