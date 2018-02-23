package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: StyleSheetList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 649405
  * declared in: tsd/browser/lib.es6.d.ts at pos 649548
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheetList")
public class StyleSheetList
{

    /*
        Constructors
    */
    public StyleSheetList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, StyleSheet value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final StyleSheet getByIndex(int index) {
        return (StyleSheet) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    public native StyleSheet item();
    /** 
      * tsd/browser/lib.es6.d.ts@649467
     */
    public native StyleSheet item(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
