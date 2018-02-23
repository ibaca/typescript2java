package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Map
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215076
  * declared in: tsd/browser/lib.es6.d.ts at pos 215513
  * declared in: tsd/browser/lib.es6.d.ts at pos 219604
  * declared in: tsd/browser/lib.es6.d.ts at pos 247617
  * source type: Map
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215076
  * declared in: tsd/browser/lib.es6.d.ts at pos 215513
  * declared in: tsd/browser/lib.es6.d.ts at pos 219604
  * declared in: tsd/browser/lib.es6.d.ts at pos 247617
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Map")
public class Map<K, V>
{

    /*
        Constructors
    */
    public Map () {
    } 
    public Map (Array<Tuple<K, V>> entries /* optional */) {
    } 
    public Map (Iterable<Tuple<K, V>> iterable) {
    } 

    /*
        Properties
    */

    // skipped property __@toStringTag
    public int size;

    /*
        Methods
    */
    // skipped method ___at_iterator
    /** 
      * tsd/browser/lib.es6.d.ts@215105
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@215124
     */
    public native Boolean delete(@DoNotAutobox K key);
    /** 
      * tsd/browser/lib.es6.d.ts@219682
     */
    public native IterableIterator<Tuple<K, V>> entries();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@215153
     */
    public native void forEach(Action3<V, K, Map<K, V>> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@215243
     */
    public native V get(@DoNotAutobox K key);
    @JsProperty(name = "size")
    public native Number getSize();
    // skipped method get___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@215275
     */
    public native Boolean has(@DoNotAutobox K key);
    /** 
      * tsd/browser/lib.es6.d.ts@219723
     */
    public native IterableIterator<K> keys();
    /** 
      * tsd/browser/lib.es6.d.ts@215301
     */
    public native Map<K, V> set(@DoNotAutobox K key, @DoNotAutobox V value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    // skipped method set___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@219756
     */
    public native IterableIterator<V> values();
}
