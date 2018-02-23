package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: DOMStringList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 322515
  * declared in: tsd/browser/lib.es6.d.ts at pos 322691
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMStringList")
public class DOMStringList
{

    /*
        Constructors
    */
    public DOMStringList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@322576
     */
    public native Boolean contains(String str);
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@322612
     */
    public native String item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
