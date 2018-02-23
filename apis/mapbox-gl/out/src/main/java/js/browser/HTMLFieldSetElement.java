package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLFieldSetElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 406953
  * declared in: tsd/browser/lib.es6.d.ts at pos 408612
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFieldSetElement")
public class HTMLFieldSetElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLFieldSetElement () {
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

    public Boolean disabled;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

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

    /** 
      * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String validationMessage;

    /** 
      * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState validity;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@408058
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "validationMessage")
    public native String getValidationMessage();
    @JsProperty(name = "validity")
    public native ValidityState getValidity();
    @JsProperty(name = "willValidate")
    public native Boolean getWillValidate();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@408278
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "validationMessage")
    public native void setValidationMessage(String value);
    @JsProperty(name = "validity")
    public native void setValidity(ValidityState value);
    @JsProperty(name = "willValidate")
    public native void setWillValidate(Boolean value);
}
