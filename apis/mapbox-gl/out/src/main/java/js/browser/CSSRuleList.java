package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: CSSRuleList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 296610
  * declared in: tsd/browser/lib.es6.d.ts at pos 296743
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSRuleList")
public class CSSRuleList
{

    /*
        Constructors
    */
    public CSSRuleList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, CSSRule value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final CSSRule getByIndex(int index) {
        return (CSSRule) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@296669
     */
    public native CSSRule item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
