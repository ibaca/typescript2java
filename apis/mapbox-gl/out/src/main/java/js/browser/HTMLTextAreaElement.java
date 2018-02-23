package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTextAreaElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 479892
  * declared in: tsd/browser/lib.es6.d.ts at pos 483879
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTextAreaElement")
public class HTMLTextAreaElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTextAreaElement () {
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

    /** 
      * Sets or retrieves the width of the object.
     */
    public Number cols;

    /** 
      * Sets or retrieves the initial contents of the object.
     */
    public String defaultValue;

    public Boolean disabled;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    public Number maxLength;

    public Number minLength;

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

    /** 
      * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    public String placeholder;

    public Element previousElementSibling;

    /** 
      * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    public Boolean readOnly;

    /** 
      * When present, marks an element that can't be submitted without a value.
     */
    public Boolean required;

    /** 
      * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public Number rows;

    /** 
      * Gets or sets the end position or offset of a text selection.
     */
    public Number selectionEnd;

    /** 
      * Gets or sets the starting position or offset of a text selection.
     */
    public Number selectionStart;

    /** 
      * Sets or retrieves the value indicating whether the control is selected.
     */
    public Object status;

    /** 
      * Retrieves the type of control.
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
      * Retrieves or sets the text in the entry field of the textArea element.
     */
    public String value;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /** 
      * Sets or retrieves how to handle wordwrapping in the object.
     */
    public String wrap;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@482924
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "autofocus")
    public native Boolean getAutofocus();
    @JsProperty(name = "cols")
    public native Number getCols();
    @JsProperty(name = "defaultValue")
    public native String getDefaultValue();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "maxLength")
    public native Number getMaxLength();
    @JsProperty(name = "minLength")
    public native Number getMinLength();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "placeholder")
    public native String getPlaceholder();
    @JsProperty(name = "readOnly")
    public native Boolean getReadOnly();
    @JsProperty(name = "required")
    public native Boolean getRequired();
    @JsProperty(name = "rows")
    public native Number getRows();
    @JsProperty(name = "selectionEnd")
    public native Number getSelectionEnd();
    @JsProperty(name = "selectionStart")
    public native Number getSelectionStart();
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
    @JsProperty(name = "wrap")
    public native String getWrap();
    /** 
      * tsd/browser/lib.es6.d.ts@483024
      * Highlights the input area of a form element.
     */
    public native void select();
    @JsProperty(name = "autofocus")
    public native void setAutofocus(Boolean value);
    @JsProperty(name = "cols")
    public native void setCols(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@483234
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "defaultValue")
    public native void setDefaultValue(String value);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "maxLength")
    public native void setMaxLength(@DoNotAutobox Number value);
    @JsProperty(name = "minLength")
    public native void setMinLength(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "placeholder")
    public native void setPlaceholder(String value);
    @JsProperty(name = "readOnly")
    public native void setReadOnly(Boolean value);
    @JsProperty(name = "required")
    public native void setRequired(Boolean value);
    @JsProperty(name = "rows")
    public native void setRows(@DoNotAutobox Number value);
    @JsProperty(name = "selectionEnd")
    public native void setSelectionEnd(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@483532
      * Sets the start and end positions of a selection in a text field.
     */
    public native void setSelectionRange(@DoNotAutobox Number start, @DoNotAutobox Number end);
    @JsProperty(name = "selectionStart")
    public native void setSelectionStart(@DoNotAutobox Number value);
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
    @JsProperty(name = "wrap")
    public native void setWrap(String value);
}
