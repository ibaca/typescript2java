package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ReadonlyMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215534

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ReadonlyMap<K, V>
{

    /*
        Properties
    */

    public int size;

    /*
        Methods
    */
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@215570
     */
    public native void forEach(Action3<V, K, ReadonlyMap<K, V>> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@215668
     */
    public native V get(@DoNotAutobox K key);
    @JsProperty(name = "size")
    public native Number getSize();
    /** 
      * tsd/browser/lib.es6.d.ts@215698
     */
    public native Boolean has(@DoNotAutobox K key);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
}
