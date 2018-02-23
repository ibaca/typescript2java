package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/browser/lib.es6.d.ts:775910
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString  {
    @JsOverlay
    default Date asDate() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofDate(Date value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBArrayKey asIDBArrayKey() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofIDBArrayKey(IDBArrayKey value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
