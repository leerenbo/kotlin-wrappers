// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.Float64Array
import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFloat64Array(value: Any?): Boolean /* object is Float64Array */ {
    contract {
        returns(true) implies (value is Float64Array)
    }

    return isFloat64ArrayRaw(value)
}
