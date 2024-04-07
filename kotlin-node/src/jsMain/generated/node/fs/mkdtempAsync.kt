// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Creates a unique temporary directory. A unique directory name is generated by
 * appending six random characters to the end of the provided `prefix`. Due to
 * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
 * platforms, notably the BSDs, can return more than six random characters, and
 * replace trailing `X` characters in `prefix` with random characters.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use.
 *
 * ```js
 * import { mkdtemp } from 'node:fs/promises';
 * import { join } from 'node:path';
 * import { tmpdir } from 'node:os';
 *
 * try {
 *   await mkdtemp(join(tmpdir(), 'foo-'));
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 *
 * The `fsPromises.mkdtemp()` method will append the six randomly selected
 * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
 * platform-specific path separator
 * (`require('node:path').sep`).
 * @since v10.0.0
 * @return Fulfills with a string containing the file system path of the newly created temporary directory.
 */

@JsName("mkdtemp")
external fun mkdtempAsync(prefix: String): Promise<String>


/**
 * Creates a unique temporary directory. A unique directory name is generated by
 * appending six random characters to the end of the provided `prefix`. Due to
 * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
 * platforms, notably the BSDs, can return more than six random characters, and
 * replace trailing `X` characters in `prefix` with random characters.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use.
 *
 * ```js
 * import { mkdtemp } from 'node:fs/promises';
 * import { join } from 'node:path';
 * import { tmpdir } from 'node:os';
 *
 * try {
 *   await mkdtemp(join(tmpdir(), 'foo-'));
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 *
 * The `fsPromises.mkdtemp()` method will append the six randomly selected
 * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
 * platform-specific path separator
 * (`require('node:path').sep`).
 * @since v10.0.0
 * @return Fulfills with a string containing the file system path of the newly created temporary directory.
 */

@JsName("mkdtemp")
external fun mkdtempAsync(prefix: String, options: ObjectEncodingOptions? = definedExternally): Promise<String>


/**
 * Creates a unique temporary directory. A unique directory name is generated by
 * appending six random characters to the end of the provided `prefix`. Due to
 * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
 * platforms, notably the BSDs, can return more than six random characters, and
 * replace trailing `X` characters in `prefix` with random characters.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use.
 *
 * ```js
 * import { mkdtemp } from 'node:fs/promises';
 * import { join } from 'node:path';
 * import { tmpdir } from 'node:os';
 *
 * try {
 *   await mkdtemp(join(tmpdir(), 'foo-'));
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 *
 * The `fsPromises.mkdtemp()` method will append the six randomly selected
 * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
 * platform-specific path separator
 * (`require('node:path').sep`).
 * @since v10.0.0
 * @return Fulfills with a string containing the file system path of the newly created temporary directory.
 */

@JsName("mkdtemp")
external fun mkdtempAsync(prefix: String, options: node.buffer.BufferEncoding? = definedExternally): Promise<String>


/**
 * Asynchronously creates a unique temporary directory.
 * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */

@JsName("mkdtemp")
external fun mkdtempAsync(prefix: String, options: BufferEncodingOption): Promise<node.buffer.Buffer>


/**
 * Asynchronously creates a unique temporary directory.
 * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */


/**
 * Asynchronously creates a unique temporary directory.
 * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */


/**
 * Asynchronously creates a unique temporary directory.
 * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
