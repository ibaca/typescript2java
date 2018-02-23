package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: StyleSheetPageList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 649626
  * declared in: tsd/browser/lib.es6.d.ts at pos 649774
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheetPageList")
public class StyleSheetPageList
{

    /*
        Constructors
    */
    public StyleSheetPageList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, CSSPageRule value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final CSSPageRule getByIndex(int index) {
        return (CSSPageRule) Js.asArrayLike(this).getAt(index);
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
    /** 
      * tsd/browser/lib.es6.d.ts@649692
     */
    public native CSSPageRule item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
