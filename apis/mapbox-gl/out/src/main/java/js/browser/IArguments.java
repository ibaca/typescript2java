package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: IArguments
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 10666
  * declared in: tsd/browser/lib.es6.d.ts at pos 219510

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IArguments
{

    @JsOverlay
    public final void setByIndex(int index, Object value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Object getByIndex(int index) {
        return (Object) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Function callee;

    public int length;

    /*
        Methods
    */
    // skipped method ___at_iterator
    @JsProperty(name = "callee")
    public native Function getCallee();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "callee")
    public native void setCallee(Function value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
