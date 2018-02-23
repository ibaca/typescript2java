package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLOutputElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 455796
  * declared in: tsd/browser/lib.es6.d.ts at pos 456529
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLOutputElement")
public class HTMLOutputElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLOutputElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public String defaultValue;

    public Element firstElementChild;

    public HTMLFormElement form;

    public DOMSettableTokenList htmlFor;

    public Element lastElementChild;

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

    public String type;

    public String validationMessage;

    public ValidityState validity;

    public String value;

    public Boolean willValidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@456136
     */
    public native Boolean checkValidity();
    @JsProperty(name = "defaultValue")
    public native String getDefaultValue();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "htmlFor")
    public native DOMSettableTokenList getHtmlFor();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "validationMessage")
    public native String getValidationMessage();
    @JsProperty(name = "validity")
    public native ValidityState getValidity();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "willValidate")
    public native Boolean getWillValidate();
    /** 
      * tsd/browser/lib.es6.d.ts@456166
     */
    public native Boolean reportValidity();
    /** 
      * tsd/browser/lib.es6.d.ts@456197
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "defaultValue")
    public native void setDefaultValue(String value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "htmlFor")
    public native void setHtmlFor(DOMSettableTokenList value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "validationMessage")
    public native void setValidationMessage(String value);
    @JsProperty(name = "validity")
    public native void setValidity(ValidityState value);
    @JsProperty(name = "value")
    public native void setValue(String value);
    @JsProperty(name = "willValidate")
    public native void setWillValidate(Boolean value);
}
