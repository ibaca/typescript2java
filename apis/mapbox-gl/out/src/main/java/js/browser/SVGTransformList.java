package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTransformList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 635249
  * declared in: tsd/browser/lib.es6.d.ts at pos 635785
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTransformList")
public class SVGTransformList
{

    /*
        Constructors
    */
    public SVGTransformList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@635320
     */
    public native SVGTransform appendItem(SVGTransform newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@635373
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@635392
     */
    public native SVGTransform consolidate();
    /** 
      * tsd/browser/lib.es6.d.ts@635425
     */
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    /** 
      * tsd/browser/lib.es6.d.ts@635492
     */
    public native SVGTransform getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@635534
     */
    public native SVGTransform initialize(SVGTransform newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@635587
     */
    public native SVGTransform insertItemBefore(SVGTransform newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@635661
     */
    public native SVGTransform removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@635706
     */
    public native SVGTransform replaceItem(SVGTransform newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
