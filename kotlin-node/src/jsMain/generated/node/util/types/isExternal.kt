// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a native `External` value.
 *
 * A native `External` value is a special type of object that contains a
 * raw C++ pointer (`void*`) for access from native code, and has no other
 * properties. Such objects are created either by Node.js internals or native
 * addons. In JavaScript, they are [frozen](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/freeze) objects with a`null` prototype.
 *
 * ```c
 * #include <js_native_api.h>
 * #include <stdlib.h>
 * napi_value result;
 * static napi_value MyNapi(napi_env env, napi_callback_info info) {
 *   int* raw = (int*) malloc(1024);
 *   napi_status status = napi_create_external(env, (void*) raw, NULL, NULL, &#x26;result);
 *   if (status != napi_ok) {
 *     napi_throw_error(env, NULL, "napi_create_external failed");
 *     return NULL;
 *   }
 *   return result;
 * }
 * ...
 * DECLARE_NAPI_PROPERTY("myNapi", MyNapi)
 * ...
 * ```
 *
 * ```js
 * const native = require('napi_addon.node');
 * const data = native.myNapi();
 * util.types.isExternal(data); // returns true
 * util.types.isExternal(0); // returns false
 * util.types.isExternal(new String('foo')); // returns false
 * ```
 *
 * For further information on `napi_create_external`, refer to `napi_create_external()`.
 * @since v10.0.0
 */
external fun isExternal(value: Any?): Boolean
