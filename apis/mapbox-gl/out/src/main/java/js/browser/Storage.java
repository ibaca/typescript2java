package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: Storage
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 648267
  * declared in: tsd/browser/lib.es6.d.ts at pos 648565
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Storage")
public class Storage
{

    /*
        Constructors
    */
    public Storage () {
    } 

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    @JsOverlay
    public final void setByIndex(String index, Object value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Object getByIndex(String index) {
        return (Object) Js.asPropertyMap(this).get(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@648322
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@648341
     */
    public native String getItem(String key);
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@648382
     */
    public native String key(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@648421
     */
    public native void removeItem(String key);
    /** 
      * tsd/browser/lib.es6.d.ts@648456
     */
    public native void setItem(String key, String data);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
