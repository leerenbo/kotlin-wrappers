// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface ProductDiscountPaymentMode {
    companion object {
        @seskar.js.JsValue("payAsYouGo")
        val payAsYouGo: ProductDiscountPaymentMode

        @seskar.js.JsValue("payUpFront")
        val payUpFront: ProductDiscountPaymentMode

        @seskar.js.JsValue("freeTrial")
        val freeTrial: ProductDiscountPaymentMode
    }
}
