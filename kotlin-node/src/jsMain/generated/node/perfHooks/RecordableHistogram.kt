// Generated by Karakum - do not modify it manually!


package node.perfHooks


sealed external interface RecordableHistogram : Histogram {
    /**
     * @since v15.9.0, v14.18.0
     * @param val The amount to record in the histogram.
     */
    fun record(value: Double): Unit

    /**
     * @since v15.9.0, v14.18.0
     * @param val The amount to record in the histogram.
     */
    fun record(value: js.core.BigInt): Unit

    /**
     * Calculates the amount of time (in nanoseconds) that has passed since the
     * previous call to `recordDelta()` and records that amount in the histogram.
     *
     * ## Examples
     * @since v15.9.0, v14.18.0
     */
    fun recordDelta(): Unit

    /**
     * Adds the values from `other` to this histogram.
     * @since v17.4.0, v16.14.0
     */
    fun add(other: RecordableHistogram): Unit
}
