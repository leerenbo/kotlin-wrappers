// Automatically generated - do not modify!

package typescript

sealed external interface ClassDeclaration : ClassLikeDeclarationBase, DeclarationStatement {
    override val kind: SyntaxKind.ClassDeclaration

    /** May be undefined in `export default class { ... }`. */
    override val name: Identifier?
}
