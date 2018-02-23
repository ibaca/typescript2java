package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGStringList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 627943
  * declared in: tsd/browser/lib.es6.d.ts at pos 628316
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGStringList")
public class SVGStringList
{

    /*
        Constructors
    */
    public SVGStringList () {
    } 

    /*
        Properties
    */

    public Number numberOfItems;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@628011
     */
    public native String appendItem(String newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@628052
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@628071
     */
    public native String getItem(@DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native Number getNumberOfItems();
    /** 
      * tsd/browser/lib.es6.d.ts@628107
     */
    public native String initialize(String newItem);
    /** 
      * tsd/browser/lib.es6.d.ts@628148
     */
    public native String insertItemBefore(String newItem, @DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@628210
     */
    public native String removeItem(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@628249
     */
    public native String replaceItem(String newItem, @DoNotAutobox Number index);
    @JsProperty(name = "numberOfItems")
    public native void setNumberOfItems(@DoNotAutobox Number value);
}
