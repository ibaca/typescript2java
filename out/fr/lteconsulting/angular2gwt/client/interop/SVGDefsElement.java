package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGDefsElement
  * Typescript fqn SVGDefsElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGDefsElement extends Object /* no JavaNode for symbol */ {
    <K> void addEventListener(K type, JsFunction2<SVGDefsElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}