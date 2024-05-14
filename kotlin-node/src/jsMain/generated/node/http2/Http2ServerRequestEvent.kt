// Generated by Karakum - do not modify it manually!

package node.http2


@seskar.js.JsVirtual
sealed external interface Http2ServerRequestEvent {
    sealed interface ABORTED : node.events.LegacyEventType
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface DATA : node.events.LegacyEventType
    sealed interface END : node.events.LegacyEventType
    sealed interface READABLE : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("aborted")
        val ABORTED: ABORTED

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("readable")
        val READABLE: READABLE

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("aborted")
        fun aborted(): node.events.EventType<Http2ServerRequest, js.array.JsTuple2<Boolean, Double>>

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Http2ServerRequest, js.array.JsTuple>

        @seskar.js.JsValue("data")
        fun data(): node.events.EventType<Http2ServerRequest, js.array.JsTuple1<Any /* Buffer | string */>>

        @seskar.js.JsValue("end")
        fun end(): node.events.EventType<Http2ServerRequest, js.array.JsTuple>

        @seskar.js.JsValue("readable")
        fun readable(): node.events.EventType<Http2ServerRequest, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Http2ServerRequest, js.array.JsTuple1<Throwable /* JsError */>>
    }
}
