// Automatically generated - do not modify!

package typescript

sealed external interface HighlightSpan {
    var fileName: String?
    var isInString: Boolean? /* true */
    var textSpan: TextSpan
    var contextSpan: TextSpan?
    var kind: HighlightSpanKind
}
