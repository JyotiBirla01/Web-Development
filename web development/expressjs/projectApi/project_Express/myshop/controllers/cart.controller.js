import Cart from "../modals/cart.model.js";
import CartItems from "../modals/cartItems.model.js";

export const  addToCart = async(request, response, next) => {
    try {
        let productId = request.body.productId;
        let userId = request.body.userId;
        let result = await Cart.isCartExists(userId);
        if (result.length) {

            //  If cart exist then we have to save product in cartItems 
            let cartId = result[0].id;
           await CartItems.saveCartItem(cartId, productId);
            return response.status(201).json("Item saved in cart");
        }
        else {

            // If cart is not exist then firstly creat cart then save product in cartItems
            let result = await Cart.createCart(userId);
            let cartId = result[0].id;
           await CartItems.saveCartItem(cartId, productId);
            return response.status(500).json("Item saved in cart");
        }
    }
    catch (err) {
        console.log(err);
    }


}