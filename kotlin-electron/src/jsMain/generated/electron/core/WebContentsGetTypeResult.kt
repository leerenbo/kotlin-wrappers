// Generated by Karakum - do not modify it manually!

package electron.core


@seskar.js.JsVirtual
sealed external interface WebContentsGetTypeResult {
    companion object {
        @seskar.js.JsValue("backgroundPage")
        val backgroundPage: WebContentsGetTypeResult

        @seskar.js.JsValue("window")
        val window: WebContentsGetTypeResult

        @seskar.js.JsValue("browserView")
        val browserView: WebContentsGetTypeResult

        @seskar.js.JsValue("remote")
        val remote: WebContentsGetTypeResult

        @seskar.js.JsValue("webview")
        val webview: WebContentsGetTypeResult

        @seskar.js.JsValue("offscreen")
        val offscreen: WebContentsGetTypeResult
    }
}
