package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: SourceBufferList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 645095
  * declared in: tsd/browser/lib.es6.d.ts at pos 645263
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SourceBufferList")
public class SourceBufferList extends EventTarget 
{

    /*
        Constructors
    */
    public SourceBufferList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, SourceBuffer value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final SourceBuffer getByIndex(int index) {
        return (SourceBuffer) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@645179
     */
    public native SourceBuffer item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
