package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: DOMTokenList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 322919
  * declared in: tsd/browser/lib.es6.d.ts at pos 323239
  * declared in: tsd/browser/lib.es6.d.ts at pos 784486
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMTokenList")
public class DOMTokenList
{

    /*
        Constructors
    */
    public DOMTokenList () {
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
    // skipped method ___at_iterator
    public native void add();
    /** 
      * tsd/browser/lib.es6.d.ts@322979
     */
    public native void add(String...  token);
    /** 
      * tsd/browser/lib.es6.d.ts@323014
     */
    public native Boolean contains(String token);
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@323052
     */
    public native String item(@DoNotAutobox Number index);
    public native void remove();
    /** 
      * tsd/browser/lib.es6.d.ts@323085
     */
    public native void remove(String...  token);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    public native Boolean toggle(String token);
    /** 
      * tsd/browser/lib.es6.d.ts@323147
     */
    public native Boolean toggle(String token, Boolean force /* optional */);
}
