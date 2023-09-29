package node.crypto


sealed external class DiffieHellmanGroup {
    /* new (name: string): DiffieHellmanGroup; */

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(name: String): DiffieHellmanGroup

    constructor ()

    fun generateKeys(): node.buffer.Buffer
    fun generateKeys(encoding: BinaryToTextEncoding): String
    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView,
        inputEncoding: Nothing? = definedExternally,
        outputEncoding: Nothing? = definedExternally,
    ): node.buffer.Buffer

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: Nothing? = definedExternally,
    ): node.buffer.Buffer

    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView,
        inputEncoding: Nothing?,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun getPrime(): node.buffer.Buffer
    fun getPrime(encoding: BinaryToTextEncoding): String
    fun getGenerator(): node.buffer.Buffer
    fun getGenerator(encoding: BinaryToTextEncoding): String
    fun getPublicKey(): node.buffer.Buffer
    fun getPublicKey(encoding: BinaryToTextEncoding): String
    fun getPrivateKey(): node.buffer.Buffer
    fun getPrivateKey(encoding: BinaryToTextEncoding): String
    var verifyError: Double
}
