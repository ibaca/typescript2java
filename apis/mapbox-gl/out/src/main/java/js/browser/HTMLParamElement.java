package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLParamElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 457190
  * declared in: tsd/browser/lib.es6.d.ts at pos 457983
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLParamElement")
public class HTMLParamElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLParamElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the name of an input parameter for an element.
     */
    public String name;

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
      * Sets or retrieves the content type of the resource designated by the value attribute.
     */
    public String type;

    /** 
      * Sets or retrieves the value of an input parameter for an element.
     */
    public String value;

    /** 
      * Sets or retrieves the data type of the value attribute.
     */
    public String valueType;

    /*
        Methods
    */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "valueType")
    public native String getValueType();
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "value")
    public native void setValue(String value);
    @JsProperty(name = "valueType")
    public native void setValueType(String value);
}
