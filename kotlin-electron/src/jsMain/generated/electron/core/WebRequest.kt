@file:JsModule("INTERNAL_ENTITY")

package electron.core


external class WebRequest {
// Docs: https://electronjs.org/docs/api/web-request
    /**
     * The `listener` will be called with `listener(details)` when a server initiated
     * redirect is about to occur.
     */
    fun onBeforeRedirect(
        filter: WebRequestFilter,
        listener: ((details: OnBeforeRedirectListenerDetails) -> Unit)?,
    ): Unit

    /**
     * The `listener` will be called with `listener(details)` when a server initiated
     * redirect is about to occur.
     */
    fun onBeforeRedirect(listener: ((details: OnBeforeRedirectListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` when a request
     * is about to occur.
     *
     * The `uploadData` is an array of `UploadData` objects.
     *
     * The `callback` has to be called with an `response` object.
     *
     * Some examples of valid `urls`:
     */
    fun onBeforeRequest(
        filter: WebRequestFilter,
        listener: ((details: OnBeforeRequestListenerDetails, callback: (response: CallbackResponse) -> Unit) -> Unit)?,
    ): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` when a request
     * is about to occur.
     *
     * The `uploadData` is an array of `UploadData` objects.
     *
     * The `callback` has to be called with an `response` object.
     *
     * Some examples of valid `urls`:
     */
    fun onBeforeRequest(listener: ((details: OnBeforeRequestListenerDetails, callback: (response: CallbackResponse) -> Unit) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` before sending
     * an HTTP request, once the request headers are available. This may occur after a
     * TCP connection is made to the server, but before any http data is sent.
     *
     * The `callback` has to be called with a `response` object.
     */
    fun onBeforeSendHeaders(
        filter: WebRequestFilter,
        listener: ((details: OnBeforeSendHeadersListenerDetails, callback: (beforeSendResponse: BeforeSendResponse) -> Unit) -> Unit)?,
    ): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` before sending
     * an HTTP request, once the request headers are available. This may occur after a
     * TCP connection is made to the server, but before any http data is sent.
     *
     * The `callback` has to be called with a `response` object.
     */
    fun onBeforeSendHeaders(listener: ((details: OnBeforeSendHeadersListenerDetails, callback: (beforeSendResponse: BeforeSendResponse) -> Unit) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` when a request is
     * completed.
     */
    fun onCompleted(filter: WebRequestFilter, listener: ((details: OnCompletedListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` when a request is
     * completed.
     */
    fun onCompleted(listener: ((details: OnCompletedListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` when an error occurs.
     */
    fun onErrorOccurred(filter: WebRequestFilter, listener: ((details: OnErrorOccurredListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` when an error occurs.
     */
    fun onErrorOccurred(listener: ((details: OnErrorOccurredListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` when HTTP
     * response headers of a request have been received.
     *
     * The `callback` has to be called with a `response` object.
     */
    fun onHeadersReceived(
        filter: WebRequestFilter,
        listener: ((details: OnHeadersReceivedListenerDetails, callback: (headersReceivedResponse: HeadersReceivedResponse) -> Unit) -> Unit)?,
    ): Unit

    /**
     * The `listener` will be called with `listener(details, callback)` when HTTP
     * response headers of a request have been received.
     *
     * The `callback` has to be called with a `response` object.
     */
    fun onHeadersReceived(listener: ((details: OnHeadersReceivedListenerDetails, callback: (headersReceivedResponse: HeadersReceivedResponse) -> Unit) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` when first byte of the
     * response body is received. For HTTP requests, this means that the status line
     * and response headers are available.
     */
    fun onResponseStarted(
        filter: WebRequestFilter,
        listener: ((details: OnResponseStartedListenerDetails) -> Unit)?,
    ): Unit

    /**
     * The `listener` will be called with `listener(details)` when first byte of the
     * response body is received. For HTTP requests, this means that the status line
     * and response headers are available.
     */
    fun onResponseStarted(listener: ((details: OnResponseStartedListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` just before a request is
     * going to be sent to the server, modifications of previous `onBeforeSendHeaders`
     * response are visible by the time this listener is fired.
     */
    fun onSendHeaders(filter: WebRequestFilter, listener: ((details: OnSendHeadersListenerDetails) -> Unit)?): Unit

    /**
     * The `listener` will be called with `listener(details)` just before a request is
     * going to be sent to the server, modifications of previous `onBeforeSendHeaders`
     * response are visible by the time this listener is fired.
     */
    fun onSendHeaders(listener: ((details: OnSendHeadersListenerDetails) -> Unit)?): Unit
}
