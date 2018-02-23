package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Set
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216127
  * declared in: tsd/browser/lib.es6.d.ts at pos 216502
  * declared in: tsd/browser/lib.es6.d.ts at pos 220025
  * declared in: tsd/browser/lib.es6.d.ts at pos 247773
  * source type: Set
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216127
  * declared in: tsd/browser/lib.es6.d.ts at pos 216502
  * declared in: tsd/browser/lib.es6.d.ts at pos 220025
  * declared in: tsd/browser/lib.es6.d.ts at pos 247773
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Set")
public class Set<T>
{

    /*
        Constructors
    */
    public Set () {
    } 
    public Set (Array<T> values /* optional */) {
    } 
    public Set (Iterable<T> iterable) {
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
      * tsd/browser/lib.es6.d.ts@216152
     */
    public native Set<T> add(@DoNotAutobox T value);
    /** 
      * tsd/browser/lib.es6.d.ts@216177
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@216196
     */
    public native Boolean delete(@DoNotAutobox T value);
    /** 
      * tsd/browser/lib.es6.d.ts@220096
     */
    public native IterableIterator<Tuple<T, T>> entries();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@216227
     */
    public native void forEach(Action3<T, T, Set<T>> callbackfn);
    @JsProperty(name = "size")
    public native Number getSize();
    // skipped method get___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@216317
     */
    public native Boolean has(@DoNotAutobox T value);
    /** 
      * tsd/browser/lib.es6.d.ts@220137
     */
    public native IterableIterator<T> keys();
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    // skipped method set___at_toStringTag
    /** 
      * tsd/browser/lib.es6.d.ts@220170
     */
    public native IterableIterator<T> values();
}
