package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WeakSet
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216706
  * declared in: tsd/browser/lib.es6.d.ts at pos 216965
  * declared in: tsd/browser/lib.es6.d.ts at pos 220276
  * declared in: tsd/browser/lib.es6.d.ts at pos 247837
  * source type: WeakSet
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216706
  * declared in: tsd/browser/lib.es6.d.ts at pos 216965
  * declared in: tsd/browser/lib.es6.d.ts at pos 220276
  * declared in: tsd/browser/lib.es6.d.ts at pos 247837
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakSet")
public class WeakSet<T>
{

    /*
        Constructors
    */
    public WeakSet () {
    } 
    public WeakSet (Array<T> values /* optional */) {
    } 
    public WeakSet (Iterable<T> iterable) {
    } 

    /*
        Properties
    */

    // skipped property __@toStringTag
    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@216735
     */
    public native WeakSet<T> add(@DoNotAutobox T value);
    /** 
      * tsd/browser/lib.es6.d.ts@216760
     */
    public native Boolean delete(@DoNotAutobox T value);
    // skipped method get___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@216791
     */
    public native Boolean has(@DoNotAutobox T value);
    // skipped method set___at_toStringTag
}
