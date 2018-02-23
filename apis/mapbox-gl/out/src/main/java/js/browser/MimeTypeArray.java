package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: MimeTypeArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 526155
  * declared in: tsd/browser/lib.es6.d.ts at pos 526325
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MimeTypeArray")
public class MimeTypeArray
{

    /*
        Constructors
    */
    public MimeTypeArray () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Plugin value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Plugin getByIndex(int index) {
        return (Plugin) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@526216
     */
    public native Plugin item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@526249
     */
    public native Plugin namedItem(String type);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
