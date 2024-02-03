import OrderDetails from "../modules/orderDetails.model.js";

// export const viewOrderList = (request, response, next) => {

//     OrderDetails.viewOrderList()
//         .then(result => {
//             return response.status(200).json({data:result});
//         })
//         .catch(err => {
//             return response.status(500).json({ err: "Internal server error ",err });
//         })


// }

export const viewOrderList = (request, response, next) => {
    // let id = request.body.id;

    OrderDetails.viewOrderList()
        .then(result => {
            return response.status(200).json({ Result: result })
        })
        .catch(err => {
            console.log(err);
            return response.status(500).json({ err: "Internal server error" })
        })
}

export const viewCancelOrderList = (request, response, next) => {
    OrderDetails.viewCancelOrderList()
        .then(result => {
            return response.status(200).json({ Message: "Cancel Order List", data: result })

        })
        .catch(error => {
            return response.status(500).json({ error: "Internal Server Error", error });
        })
}