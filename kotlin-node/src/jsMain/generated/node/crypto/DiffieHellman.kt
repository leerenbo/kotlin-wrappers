@file:JsModule("node:crypto")

package node.crypto


/**
 * The `DiffieHellman` class is a utility for creating Diffie-Hellman key
 * exchanges.
 *
 * Instances of the `DiffieHellman` class can be created using the {@link createDiffieHellman} function.
 *
 * ```js
 * import assert from 'assert';
 *
 * const {
 *   createDiffieHellman
 * } = await import('crypto');
 *
 * // Generate Alice's keys...
 * const alice = createDiffieHellman(2048);
 * const aliceKey = alice.generateKeys();
 *
 * // Generate Bob's keys...
 * const bob = createDiffieHellman(alice.getPrime(), alice.getGenerator());
 * const bobKey = bob.generateKeys();
 *
 * // Exchange and generate the secret...
 * const aliceSecret = alice.computeSecret(bobKey);
 * const bobSecret = bob.computeSecret(aliceKey);
 *
 * // OK
 * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
 * ```
 * @since v0.5.0
 */

external class DiffieHellman {
    /**
     * Generates private and public Diffie-Hellman key values, and returns
     * the public key in the specified `encoding`. This key should be
     * transferred to the other party.
     * If `encoding` is provided a string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun generateKeys(): node.buffer.Buffer
    fun generateKeys(encoding: BinaryToTextEncoding): String

    /**
     * Computes the shared secret using `otherPublicKey` as the other
     * party's public key and returns the computed shared secret. The supplied
     * key is interpreted using the specified `inputEncoding`, and secret is
     * encoded using specified `outputEncoding`.
     * If the `inputEncoding` is not
     * provided, `otherPublicKey` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
     *
     * If `outputEncoding` is given a string is returned; otherwise, a `Buffer` is returned.
     * @since v0.5.0
     * @param inputEncoding The `encoding` of an `otherPublicKey` string.
     * @param outputEncoding The `encoding` of the return value.
     */
    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView,
        inputEncoding: Nothing? = definedExternally,
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
        outputEncoding: Nothing? = definedExternally,
    ): node.buffer.Buffer

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    /**
     * Returns the Diffie-Hellman prime in the specified `encoding`.
     * If `encoding` is provided a string is
     * returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPrime(): node.buffer.Buffer
    fun getPrime(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman generator in the specified `encoding`.
     * If `encoding` is provided a string is
     * returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getGenerator(): node.buffer.Buffer
    fun getGenerator(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman public key in the specified `encoding`.
     * If `encoding` is provided a
     * string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPublicKey(): node.buffer.Buffer
    fun getPublicKey(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman private key in the specified `encoding`.
     * If `encoding` is provided a
     * string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPrivateKey(): node.buffer.Buffer
    fun getPrivateKey(encoding: BinaryToTextEncoding): String

    /**
     * Sets the Diffie-Hellman public key. If the `encoding` argument is provided,`publicKey` is expected
     * to be a string. If no `encoding` is provided, `publicKey` is expected
     * to be a `Buffer`, `TypedArray`, or `DataView`.
     * @since v0.5.0
     * @param encoding The `encoding` of the `publicKey` string.
     */
    fun setPublicKey(publicKey: js.buffer.ArrayBufferView): Unit
    fun setPublicKey(publicKey: String, encoding: node.buffer.BufferEncoding): Unit

    /**
     * Sets the Diffie-Hellman private key. If the `encoding` argument is provided,`privateKey` is expected
     * to be a string. If no `encoding` is provided, `privateKey` is expected
     * to be a `Buffer`, `TypedArray`, or `DataView`.
     * @since v0.5.0
     * @param encoding The `encoding` of the `privateKey` string.
     */
    fun setPrivateKey(privateKey: js.buffer.ArrayBufferView): Unit
    fun setPrivateKey(privateKey: String, encoding: node.buffer.BufferEncoding): Unit

    /**
     * A bit field containing any warnings and/or errors resulting from a check
     * performed during initialization of the `DiffieHellman` object.
     *
     * The following values are valid for this property (as defined in `constants`module):
     *
     * * `DH_CHECK_P_NOT_SAFE_PRIME`
     * * `DH_CHECK_P_NOT_PRIME`
     * * `DH_UNABLE_TO_CHECK_GENERATOR`
     * * `DH_NOT_SUITABLE_GENERATOR`
     * @since v0.11.12
     */
    var verifyError: Double
}
