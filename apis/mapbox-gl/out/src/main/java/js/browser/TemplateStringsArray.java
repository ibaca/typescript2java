package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TemplateStringsArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 20972

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TemplateStringsArray implements ReadonlyArray<String> 
{

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    /** 
      * Gets the length of the array. This is a number one higher than the highest element defined in an array.
     */
    public int length;

    public ReadonlyArray<String> raw;

    /*
        Methods
    */
    // skipped method ___at_iterator
    public native <U> Array<String> concat();
    public native Array<String> concat(String...  items);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native <U> Array<String> concat(U...  items);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Array<String> concat(Array<String>...  items);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Array<String> concat(UnionOfArrayOfTAndT<String>...  items);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native IterableIterator<Tuple<Number, String>> entries();
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Boolean every(Function3<String, Number, ReadonlyArray<String>, Boolean> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native <S> Array<S> filter(Function3<String, Number, ReadonlyArray<String>, Boolean> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native String find(Function3<String, Number, ReadonlyArray<String>, Boolean> predicate);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Number findIndex(Function3<String, Number, Array<String>, Boolean> predicate);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native void forEach(Action3<String, Number, ReadonlyArray<String>> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "raw")
    public native ReadonlyArray<String> getRaw();
    public native Number indexOf(String searchElement);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Number indexOf(String searchElement, Number fromIndex /* optional */);
    public native String join();
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native String join(String separator /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native IterableIterator<Number> keys();
    public native Number lastIndexOf(String searchElement);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Number lastIndexOf(String searchElement, Number fromIndex /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native <U> Array<U> map(Function3<String, Number, ReadonlyArray<String>, U> callbackfn);
    public native String reduce(Function4<String, String, Number, ReadonlyArray<String>, String> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native String reduce(Function4<String, String, Number, ReadonlyArray<String>, String> callbackfn, String initialValue /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native <U> U reduce(Function4<U, String, Number, ReadonlyArray<String>, U> callbackfn, U initialValue);
    public native String reduceRight(Function4<String, String, Number, ReadonlyArray<String>, String> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native String reduceRight(Function4<String, String, Number, ReadonlyArray<String>, String> callbackfn, String initialValue /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native <U> U reduceRight(Function4<U, String, Number, ReadonlyArray<String>, U> callbackfn, U initialValue);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    @JsProperty(name = "length")
    public native void setLength(Number value);
    @JsProperty(name = "raw")
    public native void setRaw(ReadonlyArray<String> value);
    public native Array<String> slice();
    public native Array<String> slice(Number start /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Array<String> slice(Number start /* optional */, Number end /* optional */);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native Boolean some(Function3<String, Number, ReadonlyArray<String>, Boolean> callbackfn);
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native String toLocaleString();
    /** 
      * inherited from (js.browser.ReadonlyArray)
     */
    public native IterableIterator<String> values();
}
