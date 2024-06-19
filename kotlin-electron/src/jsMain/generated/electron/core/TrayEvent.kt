// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface TrayEvent {
    sealed interface BALLOON_CLICK : node.events.LegacyEventType
    sealed interface BALLOON_CLOSED : node.events.LegacyEventType
    sealed interface BALLOON_SHOW : node.events.LegacyEventType
    sealed interface CLICK : node.events.LegacyEventType
    sealed interface DOUBLE_CLICK : node.events.LegacyEventType
    sealed interface DRAG_END : node.events.LegacyEventType
    sealed interface DRAG_ENTER : node.events.LegacyEventType
    sealed interface DRAG_LEAVE : node.events.LegacyEventType
    sealed interface DROP : node.events.LegacyEventType
    sealed interface DROP_FILES : node.events.LegacyEventType
    sealed interface DROP_TEXT : node.events.LegacyEventType
    sealed interface MIDDLE_CLICK : node.events.LegacyEventType
    sealed interface MOUSE_DOWN : node.events.LegacyEventType
    sealed interface MOUSE_ENTER : node.events.LegacyEventType
    sealed interface MOUSE_LEAVE : node.events.LegacyEventType
    sealed interface MOUSE_MOVE : node.events.LegacyEventType
    sealed interface MOUSE_UP : node.events.LegacyEventType
    sealed interface RIGHT_CLICK : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("balloon-click")
        val BALLOON_CLICK: BALLOON_CLICK

        @seskar.js.JsValue("balloon-closed")
        val BALLOON_CLOSED: BALLOON_CLOSED

        @seskar.js.JsValue("balloon-show")
        val BALLOON_SHOW: BALLOON_SHOW

        @seskar.js.JsValue("click")
        val CLICK: CLICK

        @seskar.js.JsValue("double-click")
        val DOUBLE_CLICK: DOUBLE_CLICK

        @seskar.js.JsValue("drag-end")
        val DRAG_END: DRAG_END

        @seskar.js.JsValue("drag-enter")
        val DRAG_ENTER: DRAG_ENTER

        @seskar.js.JsValue("drag-leave")
        val DRAG_LEAVE: DRAG_LEAVE

        @seskar.js.JsValue("drop")
        val DROP: DROP

        @seskar.js.JsValue("drop-files")
        val DROP_FILES: DROP_FILES

        @seskar.js.JsValue("drop-text")
        val DROP_TEXT: DROP_TEXT

        @seskar.js.JsValue("middle-click")
        val MIDDLE_CLICK: MIDDLE_CLICK

        @seskar.js.JsValue("mouse-down")
        val MOUSE_DOWN: MOUSE_DOWN

        @seskar.js.JsValue("mouse-enter")
        val MOUSE_ENTER: MOUSE_ENTER

        @seskar.js.JsValue("mouse-leave")
        val MOUSE_LEAVE: MOUSE_LEAVE

        @seskar.js.JsValue("mouse-move")
        val MOUSE_MOVE: MOUSE_MOVE

        @seskar.js.JsValue("mouse-up")
        val MOUSE_UP: MOUSE_UP

        @seskar.js.JsValue("right-click")
        val RIGHT_CLICK: RIGHT_CLICK

        @seskar.js.JsValue("balloon-click")
        fun balloonClick(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("balloon-closed")
        fun balloonClosed(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("balloon-show")
        fun balloonShow(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("click")
        fun click(): node.events.EventType<Tray, js.array.JsTuple3<KeyboardEvent, Rectangle, Point>>

        @seskar.js.JsValue("double-click")
        fun doubleClick(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Rectangle>>

        @seskar.js.JsValue("drag-end")
        fun dragEnd(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("drag-enter")
        fun dragEnter(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("drag-leave")
        fun dragLeave(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("drop")
        fun drop(): node.events.EventType<Tray, js.array.JsTuple>

        @seskar.js.JsValue("drop-files")
        fun dropFiles(): node.events.EventType<Tray, js.array.JsTuple2<Event<*>, js.array.ReadonlyArray<String>>>

        @seskar.js.JsValue("drop-text")
        fun dropText(): node.events.EventType<Tray, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("middle-click")
        fun middleClick(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Rectangle>>

        @seskar.js.JsValue("mouse-down")
        fun mouseDown(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Point>>

        @seskar.js.JsValue("mouse-enter")
        fun mouseEnter(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Point>>

        @seskar.js.JsValue("mouse-leave")
        fun mouseLeave(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Point>>

        @seskar.js.JsValue("mouse-move")
        fun mouseMove(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Point>>

        @seskar.js.JsValue("mouse-up")
        fun mouseUp(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Point>>

        @seskar.js.JsValue("right-click")
        fun rightClick(): node.events.EventType<Tray, js.array.JsTuple2<KeyboardEvent, Rectangle>>
    }
}
