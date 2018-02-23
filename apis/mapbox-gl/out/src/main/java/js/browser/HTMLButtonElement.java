package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLButtonElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 389620
  * declared in: tsd/browser/lib.es6.d.ts at pos 392529
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLButtonElement")
public class HTMLButtonElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLButtonElement () {
    } 

    /*
        Properties
    */

    /** 
      * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    public Boolean autofocus;

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean disabled;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

    /** 
      * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    public String formAction;

    /** 
      * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    public String formEnctype;

    /** 
      * Overrides the submit method attribute previously specified on a form element.
     */
    public String formMethod;

    /** 
      * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    public String formNoValidate;

    /** 
      * Overrides the target attribute on a form element.
     */
    public String formTarget;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the name of the object.
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

    public Object status;

    /** 
      * Gets the classification and default behavior of the button.
     */
    public String type;

    /** 
      * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String validationMessage;

    /** 
      * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState validity;

    /** 
      * Sets or retrieves the default or selected value of the control.
     */
    public String value;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@391977
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "autofocus")
    public native Boolean getAutofocus();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "formAction")
    public native String getFormAction();
    @JsProperty(name = "formEnctype")
    public native String getFormEnctype();
    @JsProperty(name = "formMethod")
    public native String getFormMethod();
    @JsProperty(name = "formNoValidate")
    public native String getFormNoValidate();
    @JsProperty(name = "formTarget")
    public native String getFormTarget();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "status")
    public native Object getStatus();
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
    @JsProperty(name = "autofocus")
    public native void setAutofocus(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@392197
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "formAction")
    public native void setFormAction(String value);
    @JsProperty(name = "formEnctype")
    public native void setFormEnctype(String value);
    @JsProperty(name = "formMethod")
    public native void setFormMethod(String value);
    @JsProperty(name = "formNoValidate")
    public native void setFormNoValidate(String value);
    @JsProperty(name = "formTarget")
    public native void setFormTarget(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "status")
    public native void setStatus(Object value);
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
