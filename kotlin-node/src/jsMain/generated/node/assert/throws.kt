// Generated by Karakum - do not modify it manually!

@file:JsModule("node:assert/strict")

package node.assert


/**
 * Expects the function `fn` to throw an error.
 *
 * If specified, `error` can be a [`Class`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes),
 * [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions), a validation function,
 * a validation object where each property will be tested for strict deep equality,
 * or an instance of error where each property will be tested for strict deep
 * equality including the non-enumerable `message` and `name` properties. When
 * using an object, it is also possible to use a regular expression, when
 * validating against a string property. See below for examples.
 *
 * If specified, `message` will be appended to the message provided by the`AssertionError` if the `fn` call fails to throw or in case the error validation
 * fails.
 *
 * Custom validation object/error instance:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * const err = new TypeError('Wrong value');
 * err.code = 404;
 * err.foo = 'bar';
 * err.info = {
 *   nested: true,
 *   baz: 'text',
 * };
 * err.reg = /abc/i;
 *
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     name: 'TypeError',
 *     message: 'Wrong value',
 *     info: {
 *       nested: true,
 *       baz: 'text',
 *     },
 *     // Only properties on the validation object will be tested for.
 *     // Using nested objects requires all properties to be present. Otherwise
 *     // the validation is going to fail.
 *   },
 * );
 *
 * // Using regular expressions to validate error properties:
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     // The `name` and `message` properties are strings and using regular
 *     // expressions on those will match against the string. If they fail, an
 *     // error is thrown.
 *     name: /^TypeError$/,
 *     message: /Wrong/,
 *     foo: 'bar',
 *     info: {
 *       nested: true,
 *       // It is not possible to use regular expressions for nested properties!
 *       baz: 'text',
 *     },
 *     // The `reg` property contains a regular expression and only if the
 *     // validation object contains an identical regular expression, it is going
 *     // to pass.
 *     reg: /abc/i,
 *   },
 * );
 *
 * // Fails due to the different `message` and `name` properties:
 * assert.throws(
 *   () => {
 *     const otherErr = new Error('Not found');
 *     // Copy all enumerable properties from `err` to `otherErr`.
 *     for (const [key, value] of Object.entries(err)) {
 *       otherErr[key] = value;
 *     }
 *     throw otherErr;
 *   },
 *   // The error's `message` and `name` properties will also be checked when using
 *   // an error as validation object.
 *   err,
 * );
 * ```
 *
 * Validate instanceof using constructor:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   Error,
 * );
 * ```
 *
 * Validate error message using [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions):
 *
 * Using a regular expression runs `.toString` on the error object, and will
 * therefore also include the error name.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   /^Error: Wrong value$/,
 * );
 * ```
 *
 * Custom error validation:
 *
 * The function must return `true` to indicate all internal validations passed.
 * It will otherwise fail with an `AssertionError`.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   (err) => {
 *     assert(err instanceof Error);
 *     assert(/value/.test(err));
 *     // Avoid returning anything from validation functions besides `true`.
 *     // Otherwise, it's not clear what part of the validation failed. Instead,
 *     // throw an error about the specific validation that failed (as done in this
 *     // example) and add as much helpful debugging information to that error as
 *     // possible.
 *     return true;
 *   },
 *   'unexpected error',
 * );
 * ```
 *
 * `error` cannot be a string. If a string is provided as the second
 * argument, then `error` is assumed to be omitted and the string will be used for`message` instead. This can lead to easy-to-miss mistakes. Using the same
 * message as the thrown error message is going to result in an`ERR_AMBIGUOUS_ARGUMENT` error. Please read the example below carefully if using
 * a string as the second argument gets considered:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * function throwingFirst() {
 *   throw new Error('First');
 * }
 *
 * function throwingSecond() {
 *   throw new Error('Second');
 * }
 *
 * function notThrowing() {}
 *
 * // The second argument is a string and the input function threw an Error.
 * // The first case will not throw as it does not match for the error message
 * // thrown by the input function!
 * assert.throws(throwingFirst, 'Second');
 * // In the next example the message has no benefit over the message from the
 * // error and since it is not clear if the user intended to actually match
 * // against the error message, Node.js throws an `ERR_AMBIGUOUS_ARGUMENT` error.
 * assert.throws(throwingSecond, 'Second');
 * // TypeError [ERR_AMBIGUOUS_ARGUMENT]
 *
 * // The string is only used (as message) in case the function does not throw:
 * assert.throws(notThrowing, 'Second');
 * // AssertionError [ERR_ASSERTION]: Missing expected exception: Second
 *
 * // If it was intended to match for the error message do this instead:
 * // It does not throw because the error messages match.
 * assert.throws(throwingSecond, /Second$/);
 *
 * // If the error message does not match, an AssertionError is thrown.
 * assert.throws(throwingFirst, /Second$/);
 * // AssertionError [ERR_ASSERTION]
 * ```
 *
 * Due to the confusing error-prone notation, avoid a string as the second
 * argument.
 * @since v0.1.21
 */
external fun throws(block: () -> Any?): Unit

/**
 * Expects the function `fn` to throw an error.
 *
 * If specified, `error` can be a [`Class`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes),
 * [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions), a validation function,
 * a validation object where each property will be tested for strict deep equality,
 * or an instance of error where each property will be tested for strict deep
 * equality including the non-enumerable `message` and `name` properties. When
 * using an object, it is also possible to use a regular expression, when
 * validating against a string property. See below for examples.
 *
 * If specified, `message` will be appended to the message provided by the`AssertionError` if the `fn` call fails to throw or in case the error validation
 * fails.
 *
 * Custom validation object/error instance:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * const err = new TypeError('Wrong value');
 * err.code = 404;
 * err.foo = 'bar';
 * err.info = {
 *   nested: true,
 *   baz: 'text',
 * };
 * err.reg = /abc/i;
 *
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     name: 'TypeError',
 *     message: 'Wrong value',
 *     info: {
 *       nested: true,
 *       baz: 'text',
 *     },
 *     // Only properties on the validation object will be tested for.
 *     // Using nested objects requires all properties to be present. Otherwise
 *     // the validation is going to fail.
 *   },
 * );
 *
 * // Using regular expressions to validate error properties:
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     // The `name` and `message` properties are strings and using regular
 *     // expressions on those will match against the string. If they fail, an
 *     // error is thrown.
 *     name: /^TypeError$/,
 *     message: /Wrong/,
 *     foo: 'bar',
 *     info: {
 *       nested: true,
 *       // It is not possible to use regular expressions for nested properties!
 *       baz: 'text',
 *     },
 *     // The `reg` property contains a regular expression and only if the
 *     // validation object contains an identical regular expression, it is going
 *     // to pass.
 *     reg: /abc/i,
 *   },
 * );
 *
 * // Fails due to the different `message` and `name` properties:
 * assert.throws(
 *   () => {
 *     const otherErr = new Error('Not found');
 *     // Copy all enumerable properties from `err` to `otherErr`.
 *     for (const [key, value] of Object.entries(err)) {
 *       otherErr[key] = value;
 *     }
 *     throw otherErr;
 *   },
 *   // The error's `message` and `name` properties will also be checked when using
 *   // an error as validation object.
 *   err,
 * );
 * ```
 *
 * Validate instanceof using constructor:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   Error,
 * );
 * ```
 *
 * Validate error message using [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions):
 *
 * Using a regular expression runs `.toString` on the error object, and will
 * therefore also include the error name.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   /^Error: Wrong value$/,
 * );
 * ```
 *
 * Custom error validation:
 *
 * The function must return `true` to indicate all internal validations passed.
 * It will otherwise fail with an `AssertionError`.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   (err) => {
 *     assert(err instanceof Error);
 *     assert(/value/.test(err));
 *     // Avoid returning anything from validation functions besides `true`.
 *     // Otherwise, it's not clear what part of the validation failed. Instead,
 *     // throw an error about the specific validation that failed (as done in this
 *     // example) and add as much helpful debugging information to that error as
 *     // possible.
 *     return true;
 *   },
 *   'unexpected error',
 * );
 * ```
 *
 * `error` cannot be a string. If a string is provided as the second
 * argument, then `error` is assumed to be omitted and the string will be used for`message` instead. This can lead to easy-to-miss mistakes. Using the same
 * message as the thrown error message is going to result in an`ERR_AMBIGUOUS_ARGUMENT` error. Please read the example below carefully if using
 * a string as the second argument gets considered:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * function throwingFirst() {
 *   throw new Error('First');
 * }
 *
 * function throwingSecond() {
 *   throw new Error('Second');
 * }
 *
 * function notThrowing() {}
 *
 * // The second argument is a string and the input function threw an Error.
 * // The first case will not throw as it does not match for the error message
 * // thrown by the input function!
 * assert.throws(throwingFirst, 'Second');
 * // In the next example the message has no benefit over the message from the
 * // error and since it is not clear if the user intended to actually match
 * // against the error message, Node.js throws an `ERR_AMBIGUOUS_ARGUMENT` error.
 * assert.throws(throwingSecond, 'Second');
 * // TypeError [ERR_AMBIGUOUS_ARGUMENT]
 *
 * // The string is only used (as message) in case the function does not throw:
 * assert.throws(notThrowing, 'Second');
 * // AssertionError [ERR_ASSERTION]: Missing expected exception: Second
 *
 * // If it was intended to match for the error message do this instead:
 * // It does not throw because the error messages match.
 * assert.throws(throwingSecond, /Second$/);
 *
 * // If the error message does not match, an AssertionError is thrown.
 * assert.throws(throwingFirst, /Second$/);
 * // AssertionError [ERR_ASSERTION]
 * ```
 *
 * Due to the confusing error-prone notation, avoid a string as the second
 * argument.
 * @since v0.1.21
 */
external fun throws(block: () -> Any?, message: String = definedExternally): Unit

/**
 * Expects the function `fn` to throw an error.
 *
 * If specified, `error` can be a [`Class`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes),
 * [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions), a validation function,
 * a validation object where each property will be tested for strict deep equality,
 * or an instance of error where each property will be tested for strict deep
 * equality including the non-enumerable `message` and `name` properties. When
 * using an object, it is also possible to use a regular expression, when
 * validating against a string property. See below for examples.
 *
 * If specified, `message` will be appended to the message provided by the`AssertionError` if the `fn` call fails to throw or in case the error validation
 * fails.
 *
 * Custom validation object/error instance:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * const err = new TypeError('Wrong value');
 * err.code = 404;
 * err.foo = 'bar';
 * err.info = {
 *   nested: true,
 *   baz: 'text',
 * };
 * err.reg = /abc/i;
 *
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     name: 'TypeError',
 *     message: 'Wrong value',
 *     info: {
 *       nested: true,
 *       baz: 'text',
 *     },
 *     // Only properties on the validation object will be tested for.
 *     // Using nested objects requires all properties to be present. Otherwise
 *     // the validation is going to fail.
 *   },
 * );
 *
 * // Using regular expressions to validate error properties:
 * assert.throws(
 *   () => {
 *     throw err;
 *   },
 *   {
 *     // The `name` and `message` properties are strings and using regular
 *     // expressions on those will match against the string. If they fail, an
 *     // error is thrown.
 *     name: /^TypeError$/,
 *     message: /Wrong/,
 *     foo: 'bar',
 *     info: {
 *       nested: true,
 *       // It is not possible to use regular expressions for nested properties!
 *       baz: 'text',
 *     },
 *     // The `reg` property contains a regular expression and only if the
 *     // validation object contains an identical regular expression, it is going
 *     // to pass.
 *     reg: /abc/i,
 *   },
 * );
 *
 * // Fails due to the different `message` and `name` properties:
 * assert.throws(
 *   () => {
 *     const otherErr = new Error('Not found');
 *     // Copy all enumerable properties from `err` to `otherErr`.
 *     for (const [key, value] of Object.entries(err)) {
 *       otherErr[key] = value;
 *     }
 *     throw otherErr;
 *   },
 *   // The error's `message` and `name` properties will also be checked when using
 *   // an error as validation object.
 *   err,
 * );
 * ```
 *
 * Validate instanceof using constructor:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   Error,
 * );
 * ```
 *
 * Validate error message using [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions):
 *
 * Using a regular expression runs `.toString` on the error object, and will
 * therefore also include the error name.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   /^Error: Wrong value$/,
 * );
 * ```
 *
 * Custom error validation:
 *
 * The function must return `true` to indicate all internal validations passed.
 * It will otherwise fail with an `AssertionError`.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.throws(
 *   () => {
 *     throw new Error('Wrong value');
 *   },
 *   (err) => {
 *     assert(err instanceof Error);
 *     assert(/value/.test(err));
 *     // Avoid returning anything from validation functions besides `true`.
 *     // Otherwise, it's not clear what part of the validation failed. Instead,
 *     // throw an error about the specific validation that failed (as done in this
 *     // example) and add as much helpful debugging information to that error as
 *     // possible.
 *     return true;
 *   },
 *   'unexpected error',
 * );
 * ```
 *
 * `error` cannot be a string. If a string is provided as the second
 * argument, then `error` is assumed to be omitted and the string will be used for`message` instead. This can lead to easy-to-miss mistakes. Using the same
 * message as the thrown error message is going to result in an`ERR_AMBIGUOUS_ARGUMENT` error. Please read the example below carefully if using
 * a string as the second argument gets considered:
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * function throwingFirst() {
 *   throw new Error('First');
 * }
 *
 * function throwingSecond() {
 *   throw new Error('Second');
 * }
 *
 * function notThrowing() {}
 *
 * // The second argument is a string and the input function threw an Error.
 * // The first case will not throw as it does not match for the error message
 * // thrown by the input function!
 * assert.throws(throwingFirst, 'Second');
 * // In the next example the message has no benefit over the message from the
 * // error and since it is not clear if the user intended to actually match
 * // against the error message, Node.js throws an `ERR_AMBIGUOUS_ARGUMENT` error.
 * assert.throws(throwingSecond, 'Second');
 * // TypeError [ERR_AMBIGUOUS_ARGUMENT]
 *
 * // The string is only used (as message) in case the function does not throw:
 * assert.throws(notThrowing, 'Second');
 * // AssertionError [ERR_ASSERTION]: Missing expected exception: Second
 *
 * // If it was intended to match for the error message do this instead:
 * // It does not throw because the error messages match.
 * assert.throws(throwingSecond, /Second$/);
 *
 * // If the error message does not match, an AssertionError is thrown.
 * assert.throws(throwingFirst, /Second$/);
 * // AssertionError [ERR_ASSERTION]
 * ```
 *
 * Due to the confusing error-prone notation, avoid a string as the second
 * argument.
 * @since v0.1.21
 */
external fun throws(block: () -> Any?, message: Throwable /* JsError */ = definedExternally): Unit

external fun throws(block: () -> Any?, error: AssertPredicate): Unit

external fun throws(block: () -> Any?, error: AssertPredicate, message: String = definedExternally): Unit

external fun throws(
    block: () -> Any?,
    error: AssertPredicate,
    message: Throwable /* JsError */ = definedExternally,
): Unit
