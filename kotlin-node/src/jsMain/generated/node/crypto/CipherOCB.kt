package node.crypto


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface CipherOCB : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: CipherOCBSetAADOptions = definedExternally): Unit /* this */
    fun getAuthTag(): node.buffer.Buffer
}
