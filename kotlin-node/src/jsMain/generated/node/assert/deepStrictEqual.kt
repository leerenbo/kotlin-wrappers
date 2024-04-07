// Generated by Karakum - do not modify it manually!

@file:JsModule("node:assert/strict")

package node.assert


/**
 * Tests for deep equality between the `actual` and `expected` parameters.
 * "Deep" equality means that the enumerable "own" properties of child objects
 * are recursively evaluated also by the following rules.
 * @since v1.2.0
 */
external fun <T> deepEqual(actual: Any?, expected: T): Unit /* asserts actual is T */

/**
 * Tests for deep equality between the `actual` and `expected` parameters.
 * "Deep" equality means that the enumerable "own" properties of child objects
 * are recursively evaluated also by the following rules.
 * @since v1.2.0
 */
external fun <T> deepEqual(
    actual: Any?,
    expected: T,
    message: String = definedExternally,
): Unit /* asserts actual is T */

/**
 * Tests for deep equality between the `actual` and `expected` parameters.
 * "Deep" equality means that the enumerable "own" properties of child objects
 * are recursively evaluated also by the following rules.
 * @since v1.2.0
 */
external fun <T> deepEqual(
    actual: Any?,
    expected: T,
    message: Throwable /* JsError */ = definedExternally,
): Unit /* asserts actual is T */
