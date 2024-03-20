// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ClientRequestEvent {
    sealed interface ABORT : node.events.LegacyEventType
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface FINISH : node.events.LegacyEventType
    sealed interface LOGIN : node.events.LegacyEventType
    sealed interface REDIRECT : node.events.LegacyEventType
    sealed interface RESPONSE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("abort")
        val ABORT: ABORT

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("login")
        val LOGIN: LOGIN

        @seskar.js.JsValue("redirect")
        val REDIRECT: REDIRECT

        @seskar.js.JsValue("response")
        val RESPONSE: RESPONSE

        @seskar.js.JsValue("abort")
        fun abort(): node.events.EventType<ClientRequest, js.array.JsTuple>

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<ClientRequest, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<ClientRequest, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("finish")
        fun finish(): node.events.EventType<ClientRequest, js.array.JsTuple>

        @seskar.js.JsValue("login")
        fun login(): node.events.EventType<ClientRequest, js.array.JsTuple2<AuthInfo, (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit>>

        @seskar.js.JsValue("redirect")
        fun redirect(): node.events.EventType<ClientRequest, js.array.JsTuple4<Double, String, String, js.objects.ReadonlyRecord<String, js.array.ReadonlyArray<String>>>>

        @seskar.js.JsValue("response")
        fun response(): node.events.EventType<ClientRequest, js.array.JsTuple1<IncomingMessage>>
    }
}
