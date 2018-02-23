package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGLengthList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 603664
  * declared in: tsd/browser/lib.es6.d.ts at pos 604067
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGLengthList")
public class SVGLengthList
{

    /*
        Constructors
    */
    public SVGLengthList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@603732
     */
    public native SVGLength appendItem(SVGLength newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@603779
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@603798
     */
    public native SVGLength getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@603837
     */
    public native SVGLength initialize(SVGLength newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@603884
     */
    public native SVGLength insertItemBefore(SVGLength newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@603952
     */
    public native SVGLength removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@603994
     */
    public native SVGLength replaceItem(SVGLength newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
