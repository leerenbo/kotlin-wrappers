// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface WebRequestFilterType {
    companion object {
        @seskar.js.JsValue("mainFrame")
        val mainFrame: WebRequestFilterType

        @seskar.js.JsValue("subFrame")
        val subFrame: WebRequestFilterType

        @seskar.js.JsValue("stylesheet")
        val stylesheet: WebRequestFilterType

        @seskar.js.JsValue("script")
        val script: WebRequestFilterType

        @seskar.js.JsValue("image")
        val image: WebRequestFilterType

        @seskar.js.JsValue("font")
        val font: WebRequestFilterType

        @seskar.js.JsValue("object")
        val `object`: WebRequestFilterType

        @seskar.js.JsValue("xhr")
        val xhr: WebRequestFilterType

        @seskar.js.JsValue("ping")
        val ping: WebRequestFilterType

        @seskar.js.JsValue("cspReport")
        val cspReport: WebRequestFilterType

        @seskar.js.JsValue("media")
        val media: WebRequestFilterType

        @seskar.js.JsValue("webSocket")
        val webSocket: WebRequestFilterType
    }
}
