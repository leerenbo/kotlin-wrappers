// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a built-in [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer) instance.
 * This does _not_ include [`SharedArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer) instances. Usually, it is
 * desirable to test for both; See `util.types.isAnyArrayBuffer()` for that.
 *
 * ```js
 * util.types.isArrayBuffer(new ArrayBuffer());  // Returns true
 * util.types.isArrayBuffer(new SharedArrayBuffer());  // Returns false
 * ```
 * @since v10.0.0
 */

@JsName("isArrayBuffer")
external fun isArrayBufferRaw(value: Any?): Boolean /* object is ArrayBuffer */
