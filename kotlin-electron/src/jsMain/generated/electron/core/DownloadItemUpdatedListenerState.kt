// Generated by Karakum - do not modify it manually!

package electron.core


sealed external interface DownloadItemUpdatedListenerState {
    companion object {
        @seskar.js.JsValue("progressing")
        val progressing: DownloadItemUpdatedListenerState

        @seskar.js.JsValue("interrupted")
        val interrupted: DownloadItemUpdatedListenerState
    }
}
