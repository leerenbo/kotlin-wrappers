// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface JumpListItemType {
    companion object {
        @seskar.js.JsValue("task")
        val task: JumpListItemType

        @seskar.js.JsValue("separator")
        val separator: JumpListItemType

        @seskar.js.JsValue("file")
        val file: JumpListItemType
    }
}
