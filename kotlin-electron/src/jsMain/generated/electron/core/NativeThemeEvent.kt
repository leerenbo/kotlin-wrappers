// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface NativeThemeEvent {
    sealed interface UPDATED : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("updated")
        val UPDATED: UPDATED

        @seskar.js.JsValue("updated")
        fun updated(): node.events.EventType<NativeTheme, js.array.JsTuple>
    }
}
