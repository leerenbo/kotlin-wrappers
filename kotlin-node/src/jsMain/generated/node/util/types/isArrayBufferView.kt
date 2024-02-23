// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is an instance of one of the [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer) views, such as typed
 * array objects or [`DataView`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView). Equivalent to
 * [`ArrayBuffer.isView()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/isView).
 *
 * ```js
 * util.types.isArrayBufferView(new Int8Array());  // true
 * util.types.isArrayBufferView(Buffer.from('hello world')); // true
 * util.types.isArrayBufferView(new DataView(new ArrayBuffer(16)));  // true
 * util.types.isArrayBufferView(new ArrayBuffer());  // false
 * ```
 * @since v10.0.0
 */

@JsName("isArrayBufferView")
external fun isArrayBufferViewRaw(value: Any?): Boolean /* object is NodeJS.ArrayBufferView */
