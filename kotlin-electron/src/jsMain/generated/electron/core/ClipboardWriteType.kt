// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{selection: 'selection', clipboard: 'clipboard'}/*union*/)""")
sealed external interface ClipboardWriteType {
    companion object {
        val selection: ClipboardWriteType
        val clipboard: ClipboardWriteType
    }
}
