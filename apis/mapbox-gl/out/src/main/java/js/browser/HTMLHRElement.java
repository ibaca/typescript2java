package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLHRElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 417605
  * declared in: tsd/browser/lib.es6.d.ts at pos 418315
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLHRElement")
public class HTMLHRElement extends HTMLElement  implements DOML2DeprecatedColorProperty, DOML2DeprecatedSizeProperty 
{

    /*
        Constructors
    */
    public HTMLHRElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves how the object is aligned with adjacent text.
     */
    public String align;

    public Number childElementCount;

    public HTMLCollection children;

    public String color;

    public Element firstElementChild;

    public Element lastElementChild;

    public Element nextElementSibling;

    /** 
      * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
     */
    public Boolean noShade;

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

    public int size;

    /** 
      * Sets or retrieves the width of the object.
     */
    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "align")
    public native String getAlign();
    /** 
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
     */
    @JsProperty(name = "color")
    public native String getColor();
    @JsProperty(name = "noShade")
    public native Boolean getNoShade();
    /** 
      * inherited from (js.browser.DOML2DeprecatedSizeProperty)
      * inherited from (js.browser.DOML2DeprecatedSizeProperty)
     */
    @JsProperty(name = "size")
    public native Number getSize();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    /** 
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
      * inherited from (js.browser.DOML2DeprecatedColorProperty)
     */
    @JsProperty(name = "color")
    public native void setColor(String value);
    @JsProperty(name = "noShade")
    public native void setNoShade(Boolean value);
    /** 
      * inherited from (js.browser.DOML2DeprecatedSizeProperty)
      * inherited from (js.browser.DOML2DeprecatedSizeProperty)
     */
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
