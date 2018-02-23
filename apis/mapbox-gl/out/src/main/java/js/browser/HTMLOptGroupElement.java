package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLOptGroupElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 452784
  * declared in: tsd/browser/lib.es6.d.ts at pos 454022
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLOptGroupElement")
public class HTMLOptGroupElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLOptGroupElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the status of an option.
     */
    public Boolean defaultSelected;

    public Boolean disabled;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

    /** 
      * Sets or retrieves the ordinal position of an option in a list box.
     */
    public Number index;

    /** 
      * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    public String label;

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
      * Sets or retrieves whether the option in the list box is the default item.
     */
    public Boolean selected;

    /** 
      * Sets or retrieves the text string specified by the option tag.
     */
    public String text;

    /** 
      * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    public String value;

    /*
        Methods
    */
    @JsProperty(name = "defaultSelected")
    public native Boolean getDefaultSelected();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "index")
    public native Number getIndex();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "selected")
    public native Boolean getSelected();
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "defaultSelected")
    public native void setDefaultSelected(Boolean value);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "index")
    public native void setIndex(@DoNotAutobox Number value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "selected")
    public native void setSelected(Boolean value);
    @JsProperty(name = "text")
    public native void setText(String value);
    @JsProperty(name = "value")
    public native void setValue(String value);
}
