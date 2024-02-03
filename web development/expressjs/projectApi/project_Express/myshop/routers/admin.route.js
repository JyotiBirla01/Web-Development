import express from "express";
import Admin from "../modals/admin.model.js";

import { signUp,signIn} from "../controllers/admin.controller.js";

// The express. Router() function is used to create a new router object.

const router=express.Router();
router.post("/signup",signUp);
router.post("/signin",signIn);


export default router;


