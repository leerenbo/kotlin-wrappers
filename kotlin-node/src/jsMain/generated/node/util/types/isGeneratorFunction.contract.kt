// Generated by Karakum - do not modify it manually!

package node.util.types

import js.generator.GeneratorFunction
import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isGeneratorFunction(value: Any?): Boolean /* object is GeneratorFunction */ {
    contract {
        returns(true) implies (value is GeneratorFunction<*, *, *, *>)
    }

    return isGeneratorFunctionRaw(value)
}
