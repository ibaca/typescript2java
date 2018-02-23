package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WeakMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215748
  * declared in: tsd/browser/lib.es6.d.ts at pos 216098
  * declared in: tsd/browser/lib.es6.d.ts at pos 219873
  * declared in: tsd/browser/lib.es6.d.ts at pos 247684
  * source type: WeakMap
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215748
  * declared in: tsd/browser/lib.es6.d.ts at pos 216098
  * declared in: tsd/browser/lib.es6.d.ts at pos 219873
  * declared in: tsd/browser/lib.es6.d.ts at pos 247684
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakMap")
public class WeakMap<K extends Object, V>
{

    /*
        Constructors
    */
    public WeakMap () {
    } 
    public WeakMap (Array<Tuple<K, V>> entries /* optional */) {
    } 
    public WeakMap (Iterable<Tuple<K, V>> iterable) {
    } 

    /*
        Properties
    */

    // skipped property __@toStringTag
    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@215795
     */
    public native Boolean delete(@DoNotAutobox K key);
    /** 
      * tsd/browser/lib.es6.d.ts@215824
     */
    public native V get(@DoNotAutobox K key);
    // skipped method get___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@215856
     */
    public native Boolean has(@DoNotAutobox K key);
    /** 
      * tsd/browser/lib.es6.d.ts@215882
     */
    public native WeakMap<K, V> set(@DoNotAutobox K key, @DoNotAutobox V value);
    // skipped method set___at_toStringTag
}
