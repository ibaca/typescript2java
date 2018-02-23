package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGNumberList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 608613
  * declared in: tsd/browser/lib.es6.d.ts at pos 609016
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGNumberList")
public class SVGNumberList
{

    /*
        Constructors
    */
    public SVGNumberList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@608681
     */
    public native SVGNumber appendItem(SVGNumber newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@608728
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@608747
     */
    public native SVGNumber getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@608786
     */
    public native SVGNumber initialize(SVGNumber newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@608833
     */
    public native SVGNumber insertItemBefore(SVGNumber newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@608901
     */
    public native SVGNumber removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@608943
     */
    public native SVGNumber replaceItem(SVGNumber newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
