// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.Uint8Array
import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUint8Array(value: Any?): Boolean /* object is Uint8Array */ {
    contract {
        returns(true) implies (value is Uint8Array)
    }

    return isUint8ArrayRaw(value)
}
