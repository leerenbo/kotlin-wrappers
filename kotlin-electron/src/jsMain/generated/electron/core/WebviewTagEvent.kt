// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WebviewTagEvent {
    companion object {
// Docs: https://electronjs.org/docs/api/webview-tag
        /**
         * Fired when a load has committed. This includes navigation within the current
         * document as well as subframe document-level loads, but does not include
         * asynchronous resource loads.
         */

        @seskar.js.JsValue("load-commit")
        val LOAD_COMMIT: web.events.EventType<LoadCommitEvent, WebviewTag>

        /**
         * Fired when the navigation is done, i.e. the spinner of the tab will stop
         * spinning, and the `onload` event is dispatched.
         */

        @seskar.js.JsValue("did-finish-load")
        val DID_FINISH_LOAD: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * This event is like `did-finish-load`, but fired when the load failed or was
         * cancelled, e.g. `window.stop()` is invoked.
         */

        @seskar.js.JsValue("did-fail-load")
        val DID_FAIL_LOAD: web.events.EventType<DidFailLoadEvent, WebviewTag>

        /**
         * Fired when a frame has done navigation.
         */

        @seskar.js.JsValue("did-frame-finish-load")
        val DID_FRAME_FINISH_LOAD: web.events.EventType<DidFrameFinishLoadEvent, WebviewTag>

        /**
         * Corresponds to the points in time when the spinner of the tab starts spinning.
         */

        @seskar.js.JsValue("did-start-loading")
        val DID_START_LOADING: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Corresponds to the points in time when the spinner of the tab stops spinning.
         */

        @seskar.js.JsValue("did-stop-loading")
        val DID_STOP_LOADING: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when attached to the embedder web contents.
         */

        @seskar.js.JsValue("did-attach")
        val DID_ATTACH: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when document in the given frame is loaded.
         */

        @seskar.js.JsValue("dom-ready")
        val DOM_READY: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when page title is set during navigation. `explicitSet` is false when
         * title is synthesized from file url.
         */

        @seskar.js.JsValue("page-title-updated")
        val PAGE_TITLE_UPDATED: web.events.EventType<PageTitleUpdatedEvent, WebviewTag>

        /**
         * Fired when page receives favicon urls.
         */

        @seskar.js.JsValue("page-favicon-updated")
        val PAGE_FAVICON_UPDATED: web.events.EventType<PageFaviconUpdatedEvent, WebviewTag>

        /**
         * Fired when page enters fullscreen triggered by HTML API.
         */

        @seskar.js.JsValue("enter-html-full-screen")
        val ENTER_HTML_FULL_SCREEN: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when page leaves fullscreen triggered by HTML API.
         */

        @seskar.js.JsValue("leave-html-full-screen")
        val LEAVE_HTML_FULL_SCREEN: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when the guest window logs a console message.
         *
         * The following example code forwards all log messages to the embedder's console
         * without regard for log level or other properties.
         */

        @seskar.js.JsValue("console-message")
        val CONSOLE_MESSAGE: web.events.EventType<ConsoleMessageEvent, WebviewTag>

        /**
         * Fired when a result is available for `webview.findInPage` request.
         */

        @seskar.js.JsValue("found-in-page")
        val FOUND_IN_PAGE: web.events.EventType<FoundInPageEvent, WebviewTag>

        /**
         * Emitted when a user or the page wants to start navigation. It can happen when
         * the `window.location` object is changed or a user clicks a link in the page.
         *
         * This event will not emit when the navigation is started programmatically with
         * APIs like `<webview>.loadURL` and `<webview>.back`.
         *
         * It is also not emitted during in-page navigation, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         *
         * Calling `event.preventDefault()` does **NOT** have any effect.
         */

        @seskar.js.JsValue("will-navigate")
        val WILL_NAVIGATE: web.events.EventType<WillNavigateEvent, WebviewTag>

        /**
         * Emitted when a user or the page wants to start navigation anywhere in the
         * `<webview>` or any frames embedded within. It can happen when the
         * `window.location` object is changed or a user clicks a link in the page.
         *
         * This event will not emit when the navigation is started programmatically with
         * APIs like `<webview>.loadURL` and `<webview>.back`.
         *
         * It is also not emitted during in-page navigation, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         *
         * Calling `event.preventDefault()` does **NOT** have any effect.
         */

        @seskar.js.JsValue("will-frame-navigate")
        val WILL_FRAME_NAVIGATE: web.events.EventType<WillFrameNavigateEvent, WebviewTag>

        /**
         * Emitted when any frame (including main) starts navigating. `isInPlace` will be
         * `true` for in-page navigations.
         */

        @seskar.js.JsValue("did-start-navigation")
        val DID_START_NAVIGATION: web.events.EventType<DidStartNavigationEvent, WebviewTag>

        /**
         * Emitted after a server side redirect occurs during navigation. For example a 302
         * redirect.
         */

        @seskar.js.JsValue("did-redirect-navigation")
        val DID_REDIRECT_NAVIGATION: web.events.EventType<DidRedirectNavigationEvent, WebviewTag>

        /**
         * Emitted when a navigation is done.
         *
         * This event is not emitted for in-page navigations, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         */

        @seskar.js.JsValue("did-navigate")
        val DID_NAVIGATE: web.events.EventType<DidNavigateEvent, WebviewTag>

        /**
         * Emitted when any frame navigation is done.
         *
         * This event is not emitted for in-page navigations, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         */

        @seskar.js.JsValue("did-frame-navigate")
        val DID_FRAME_NAVIGATE: web.events.EventType<DidFrameNavigateEvent, WebviewTag>

        /**
         * Emitted when an in-page navigation happened.
         *
         * When in-page navigation happens, the page URL changes but does not cause
         * navigation outside of the page. Examples of this occurring are when anchor links
         * are clicked or when the DOM `hashchange` event is triggered.
         */

        @seskar.js.JsValue("did-navigate-in-page")
        val DID_NAVIGATE_IN_PAGE: web.events.EventType<DidNavigateInPageEvent, WebviewTag>

        /**
         * Fired when the guest page attempts to close itself.
         *
         * The following example code navigates the `webview` to `about:blank` when the
         * guest attempts to close itself.
         */

        @seskar.js.JsValue("close")
        val CLOSE: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when the guest page has sent an asynchronous message to embedder page.
         *
         * With `sendToHost` method and `ipc-message` event you can communicate between
         * guest page and embedder page:
         */

        @seskar.js.JsValue("ipc-message")
        val IPC_MESSAGE: web.events.EventType<IpcMessageEvent, WebviewTag>

        /**
         * Fired when the renderer process unexpectedly disappears. This is normally
         * because it was crashed or killed.
         */

        @seskar.js.JsValue("render-process-gone")
        val RENDER_PROCESS_GONE: web.events.EventType<RenderProcessGoneEvent, WebviewTag>

        /**
         * Fired when a plugin process is crashed.
         */

        @seskar.js.JsValue("plugin-crashed")
        val PLUGIN_CRASHED: web.events.EventType<PluginCrashedEvent, WebviewTag>

        /**
         * Fired when the WebContents is destroyed.
         */

        @seskar.js.JsValue("destroyed")
        val DESTROYED: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when media starts playing.
         */

        @seskar.js.JsValue("media-started-playing")
        val MEDIA_STARTED_PLAYING: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when media is paused or done playing.
         */

        @seskar.js.JsValue("media-paused")
        val MEDIA_PAUSED: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when a page's theme color changes. This is usually due to encountering a
         * meta tag:
         */

        @seskar.js.JsValue("did-change-theme-color")
        val DID_CHANGE_THEME_COLOR: web.events.EventType<DidChangeThemeColorEvent, WebviewTag>

        /**
         * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
         */

        @seskar.js.JsValue("update-target-url")
        val UPDATE_TARGET_URL: web.events.EventType<UpdateTargetUrlEvent, WebviewTag>

        /**
         * Emitted when a link is clicked in DevTools or 'Open in new tab' is selected for
         * a link in its context menu.
         */

        @seskar.js.JsValue("devtools-open-url")
        val DEVTOOLS_OPEN_URL: web.events.EventType<DevtoolsOpenUrlEvent, WebviewTag>

        /**
         * Emitted when DevTools is opened.
         */

        @seskar.js.JsValue("devtools-opened")
        val DEVTOOLS_OPENED: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when DevTools is closed.
         */

        @seskar.js.JsValue("devtools-closed")
        val DEVTOOLS_CLOSED: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when DevTools is focused / opened.
         */

        @seskar.js.JsValue("devtools-focused")
        val DEVTOOLS_FOCUSED: web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when there is a new context menu that needs to be handled.
         */

        @seskar.js.JsValue("context-menu")
        val CONTEXT_MENU: web.events.EventType<ContextMenuEvent, WebviewTag>
// Docs: https://electronjs.org/docs/api/webview-tag
        /**
         * Fired when a load has committed. This includes navigation within the current
         * document as well as subframe document-level loads, but does not include
         * asynchronous resource loads.
         */

        @seskar.js.JsValue("load-commit")
        fun loadCommit(): web.events.EventType<LoadCommitEvent, WebviewTag>

        /**
         * Fired when the navigation is done, i.e. the spinner of the tab will stop
         * spinning, and the `onload` event is dispatched.
         */

        @seskar.js.JsValue("did-finish-load")
        fun didFinishLoad(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * This event is like `did-finish-load`, but fired when the load failed or was
         * cancelled, e.g. `window.stop()` is invoked.
         */

        @seskar.js.JsValue("did-fail-load")
        fun didFailLoad(): web.events.EventType<DidFailLoadEvent, WebviewTag>

        /**
         * Fired when a frame has done navigation.
         */

        @seskar.js.JsValue("did-frame-finish-load")
        fun didFrameFinishLoad(): web.events.EventType<DidFrameFinishLoadEvent, WebviewTag>

        /**
         * Corresponds to the points in time when the spinner of the tab starts spinning.
         */

        @seskar.js.JsValue("did-start-loading")
        fun didStartLoading(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Corresponds to the points in time when the spinner of the tab stops spinning.
         */

        @seskar.js.JsValue("did-stop-loading")
        fun didStopLoading(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when attached to the embedder web contents.
         */

        @seskar.js.JsValue("did-attach")
        fun didAttach(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when document in the given frame is loaded.
         */

        @seskar.js.JsValue("dom-ready")
        fun domReady(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when page title is set during navigation. `explicitSet` is false when
         * title is synthesized from file url.
         */

        @seskar.js.JsValue("page-title-updated")
        fun pageTitleUpdated(): web.events.EventType<PageTitleUpdatedEvent, WebviewTag>

        /**
         * Fired when page receives favicon urls.
         */

        @seskar.js.JsValue("page-favicon-updated")
        fun pageFaviconUpdated(): web.events.EventType<PageFaviconUpdatedEvent, WebviewTag>

        /**
         * Fired when page enters fullscreen triggered by HTML API.
         */

        @seskar.js.JsValue("enter-html-full-screen")
        fun enterHtmlFullScreen(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when page leaves fullscreen triggered by HTML API.
         */

        @seskar.js.JsValue("leave-html-full-screen")
        fun leaveHtmlFullScreen(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when the guest window logs a console message.
         *
         * The following example code forwards all log messages to the embedder's console
         * without regard for log level or other properties.
         */

        @seskar.js.JsValue("console-message")
        fun consoleMessage(): web.events.EventType<ConsoleMessageEvent, WebviewTag>

        /**
         * Fired when a result is available for `webview.findInPage` request.
         */

        @seskar.js.JsValue("found-in-page")
        fun foundInPage(): web.events.EventType<FoundInPageEvent, WebviewTag>

        /**
         * Emitted when a user or the page wants to start navigation. It can happen when
         * the `window.location` object is changed or a user clicks a link in the page.
         *
         * This event will not emit when the navigation is started programmatically with
         * APIs like `<webview>.loadURL` and `<webview>.back`.
         *
         * It is also not emitted during in-page navigation, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         *
         * Calling `event.preventDefault()` does **NOT** have any effect.
         */

        @seskar.js.JsValue("will-navigate")
        fun willNavigate(): web.events.EventType<WillNavigateEvent, WebviewTag>

        /**
         * Emitted when a user or the page wants to start navigation anywhere in the
         * `<webview>` or any frames embedded within. It can happen when the
         * `window.location` object is changed or a user clicks a link in the page.
         *
         * This event will not emit when the navigation is started programmatically with
         * APIs like `<webview>.loadURL` and `<webview>.back`.
         *
         * It is also not emitted during in-page navigation, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         *
         * Calling `event.preventDefault()` does **NOT** have any effect.
         */

        @seskar.js.JsValue("will-frame-navigate")
        fun willFrameNavigate(): web.events.EventType<WillFrameNavigateEvent, WebviewTag>

        /**
         * Emitted when any frame (including main) starts navigating. `isInPlace` will be
         * `true` for in-page navigations.
         */

        @seskar.js.JsValue("did-start-navigation")
        fun didStartNavigation(): web.events.EventType<DidStartNavigationEvent, WebviewTag>

        /**
         * Emitted after a server side redirect occurs during navigation. For example a 302
         * redirect.
         */

        @seskar.js.JsValue("did-redirect-navigation")
        fun didRedirectNavigation(): web.events.EventType<DidRedirectNavigationEvent, WebviewTag>

        /**
         * Emitted when a navigation is done.
         *
         * This event is not emitted for in-page navigations, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         */

        @seskar.js.JsValue("did-navigate")
        fun didNavigate(): web.events.EventType<DidNavigateEvent, WebviewTag>

        /**
         * Emitted when any frame navigation is done.
         *
         * This event is not emitted for in-page navigations, such as clicking anchor links
         * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
         * this purpose.
         */

        @seskar.js.JsValue("did-frame-navigate")
        fun didFrameNavigate(): web.events.EventType<DidFrameNavigateEvent, WebviewTag>

        /**
         * Emitted when an in-page navigation happened.
         *
         * When in-page navigation happens, the page URL changes but does not cause
         * navigation outside of the page. Examples of this occurring are when anchor links
         * are clicked or when the DOM `hashchange` event is triggered.
         */

        @seskar.js.JsValue("did-navigate-in-page")
        fun didNavigateInPage(): web.events.EventType<DidNavigateInPageEvent, WebviewTag>

        /**
         * Fired when the guest page attempts to close itself.
         *
         * The following example code navigates the `webview` to `about:blank` when the
         * guest attempts to close itself.
         */

        @seskar.js.JsValue("close")
        fun close(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Fired when the guest page has sent an asynchronous message to embedder page.
         *
         * With `sendToHost` method and `ipc-message` event you can communicate between
         * guest page and embedder page:
         */

        @seskar.js.JsValue("ipc-message")
        fun ipcMessage(): web.events.EventType<IpcMessageEvent, WebviewTag>

        /**
         * Fired when the renderer process unexpectedly disappears. This is normally
         * because it was crashed or killed.
         */

        @seskar.js.JsValue("render-process-gone")
        fun renderProcessGone(): web.events.EventType<RenderProcessGoneEvent, WebviewTag>

        /**
         * Fired when a plugin process is crashed.
         */

        @seskar.js.JsValue("plugin-crashed")
        fun pluginCrashed(): web.events.EventType<PluginCrashedEvent, WebviewTag>

        /**
         * Fired when the WebContents is destroyed.
         */

        @seskar.js.JsValue("destroyed")
        fun destroyed(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when media starts playing.
         */

        @seskar.js.JsValue("media-started-playing")
        fun mediaStartedPlaying(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when media is paused or done playing.
         */

        @seskar.js.JsValue("media-paused")
        fun mediaPaused(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when a page's theme color changes. This is usually due to encountering a
         * meta tag:
         */

        @seskar.js.JsValue("did-change-theme-color")
        fun didChangeThemeColor(): web.events.EventType<DidChangeThemeColorEvent, WebviewTag>

        /**
         * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
         */

        @seskar.js.JsValue("update-target-url")
        fun updateTargetUrl(): web.events.EventType<UpdateTargetUrlEvent, WebviewTag>

        /**
         * Emitted when a link is clicked in DevTools or 'Open in new tab' is selected for
         * a link in its context menu.
         */

        @seskar.js.JsValue("devtools-open-url")
        fun devtoolsOpenUrl(): web.events.EventType<DevtoolsOpenUrlEvent, WebviewTag>

        /**
         * Emitted when DevTools is opened.
         */

        @seskar.js.JsValue("devtools-opened")
        fun devtoolsOpened(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when DevTools is closed.
         */

        @seskar.js.JsValue("devtools-closed")
        fun devtoolsClosed(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when DevTools is focused / opened.
         */

        @seskar.js.JsValue("devtools-focused")
        fun devtoolsFocused(): web.events.EventType<DOMEvent, WebviewTag>

        /**
         * Emitted when there is a new context menu that needs to be handled.
         */

        @seskar.js.JsValue("context-menu")
        fun contextMenu(): web.events.EventType<ContextMenuEvent, WebviewTag>
    }
}
