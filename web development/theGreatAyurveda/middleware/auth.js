import jwt from "jsonwebtoken";

export const verfifyToken = (request, response, next) => {
    try {
        let token = request.headers.authorization;
        token = token.split(" ")[1];
        jwt.verify(token, 'asdfghjkl');
        next();

    }
    catch (err) {
        return response.status(401).json({ message: "Unauthorized acess" });
    }
}