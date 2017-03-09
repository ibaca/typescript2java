package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralArray
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralArray extends AST {
    public JsArray<Object> expressions;
    @JsConstructor
    public LiteralArray(ParseSpan span,JsArray<Object> expressions) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
