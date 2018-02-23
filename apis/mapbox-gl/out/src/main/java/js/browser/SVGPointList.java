package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPointList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 619621
  * declared in: tsd/browser/lib.es6.d.ts at pos 620013
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPointList")
public class SVGPointList
{

    /*
        Constructors
    */
    public SVGPointList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@619688
     */
    public native SVGPoint appendItem(SVGPoint newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@619733
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@619752
     */
    public native SVGPoint getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@619790
     */
    public native SVGPoint initialize(SVGPoint newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@619835
     */
    public native SVGPoint insertItemBefore(SVGPoint newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@619901
     */
    public native SVGPoint removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@619942
     */
    public native SVGPoint replaceItem(SVGPoint newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
