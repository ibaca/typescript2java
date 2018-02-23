package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLBaseFontElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 386592
  * declared in: tsd/browser/lib.es6.d.ts at pos 387150
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLBaseFontElement")
public class HTMLBaseFontElement extends HTMLElement  implements DOML2DeprecatedColorProperty 
{

    /*
        Constructors
    */
    public HTMLBaseFontElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public String color;

    /** 
      * Sets or retrieves the current typeface family.
     */
    public String face;

    public Element firstElementChild;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    /** 
      * Sets or retrieves the font size of the object.
     */
    public int size;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
     */
    @JsProperty(name = "color")
    public native String getColor();
    @JsProperty(name = "face")
    public native String getFace();
    @JsProperty(name = "size")
    public native Number getSize();
    /** 
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
     */
    @JsProperty(name = "color")
    public native void setColor(String value);
    @JsProperty(name = "face")
    public native void setFace(String value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
}
