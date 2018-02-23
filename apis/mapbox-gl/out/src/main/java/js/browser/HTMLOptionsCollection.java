package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLOptionsCollection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 455427
  * declared in: tsd/browser/lib.es6.d.ts at pos 455697
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLOptionsCollection")
public class HTMLOptionsCollection extends HTMLCollectionOf<HTMLOptionElement> 
{

    /*
        Constructors
    */
    public HTMLOptionsCollection () {
    } 

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Properties
    */

    /** 
      * Sets or retrieves the number of objects in a collection.
     */
    public int length;

    public Number selectedIndex;

    /*
        Methods
    */
    public native void add(HTMLOptGroupElement element);
    public native void add(HTMLOptGroupElement element, HTMLElement before /* optional */);
    public native void add(HTMLOptGroupElement element, @DoNotAutobox Number before /* optional */);
    public native void add(HTMLOptionElement element);
    public native void add(HTMLOptionElement element, HTMLElement before /* optional */);
    public native void add(HTMLOptionElement element, @DoNotAutobox Number before /* optional */);
    public native void add(UnionOfHTMLOptGroupElementAndHTMLOptionElement element);
    /** 
      * tsd/browser/lib.es6.d.ts@455558
     */
    public native void add(UnionOfHTMLOptGroupElementAndHTMLOptionElement element, UnionOfHTMLElementAndNumber before /* optional */);
    @JsProperty(name = "selectedIndex")
    public native Number getSelectedIndex();
    /** 
      * tsd/browser/lib.es6.d.ts@455654
     */
    public native void remove(@DoNotAutobox Number index);
    @JsProperty(name = "selectedIndex")
    public native void setSelectedIndex(@DoNotAutobox Number value);
}
