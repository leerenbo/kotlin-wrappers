// Generated by Karakum - do not modify it manually!

package node.workerThreads


@seskar.js.JsVirtual
sealed external interface WorkerEvent {
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface EXIT : node.events.LegacyEventType
    sealed interface MESSAGE : node.events.LegacyEventType
    sealed interface MESSAGEERROR : node.events.LegacyEventType
    sealed interface ONLINE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("exit")
        val EXIT: EXIT

        @seskar.js.JsValue("message")
        val MESSAGE: MESSAGE

        @seskar.js.JsValue("messageerror")
        val MESSAGEERROR: MESSAGEERROR

        @seskar.js.JsValue("online")
        val ONLINE: ONLINE

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Worker, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("exit")
        fun exit(): node.events.EventType<Worker, js.array.JsTuple1<Double>>

        @seskar.js.JsValue("message")
        fun message(): node.events.EventType<Worker, js.array.JsTuple1<Any?>>

        @seskar.js.JsValue("messageerror")
        fun messageerror(): node.events.EventType<Worker, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("online")
        fun online(): node.events.EventType<Worker, js.array.JsTuple>
    }
}
