// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface CookiesOffListenerCause {
    companion object {
        @seskar.js.JsValue("explicit")
        val explicit: CookiesOffListenerCause

        @seskar.js.JsValue("overwrite")
        val overwrite: CookiesOffListenerCause

        @seskar.js.JsValue("expired")
        val expired: CookiesOffListenerCause

        @seskar.js.JsValue("evicted")
        val evicted: CookiesOffListenerCause

        @seskar.js.JsValue("expired-overwrite")
        val expiredOverwrite: CookiesOffListenerCause
    }
}
