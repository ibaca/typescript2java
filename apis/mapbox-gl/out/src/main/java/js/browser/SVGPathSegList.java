package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 617771
  * declared in: tsd/browser/lib.es6.d.ts at pos 618185
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegList")
public class SVGPathSegList
{

    /*
        Constructors
    */
    public SVGPathSegList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@617840
     */
    public native SVGPathSeg appendItem(SVGPathSeg newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@617889
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@617908
     */
    public native SVGPathSeg getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@617948
     */
    public native SVGPathSeg initialize(SVGPathSeg newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@617997
     */
    public native SVGPathSeg insertItemBefore(SVGPathSeg newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@618067
     */
    public native SVGPathSeg removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@618110
     */
    public native SVGPathSeg replaceItem(SVGPathSeg newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
