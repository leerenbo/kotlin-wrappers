@file:JsModule("node:crypto")

package node.crypto


/**
 * Encrypts `buffer` with `privateKey`. The returned data can be decrypted using
 * the corresponding public key, for example using {@link publicDecrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
 * @since v1.1.0
 */
external fun privateEncrypt(privateKey: RsaPrivateKey, buffer: js.buffer.ArrayBufferView): node.buffer.Buffer

external fun privateEncrypt(privateKey: KeyLike, buffer: js.buffer.ArrayBufferView): node.buffer.Buffer
