@file:JsModule("node:crypto")

package node.crypto


/**
 * Computes the Diffie-Hellman secret based on a `privateKey` and a `publicKey`.
 * Both keys must have the same `asymmetricKeyType`, which must be one of `'dh'`(for Diffie-Hellman), `'ec'` (for ECDH), `'x448'`, or `'x25519'` (for ECDH-ES).
 * @since v13.9.0, v12.17.0
 */
external fun diffieHellman(options: DiffieHellmanOptions): node.buffer.Buffer
