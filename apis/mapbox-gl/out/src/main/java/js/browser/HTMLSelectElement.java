package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: HTMLSelectElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 461896
  * declared in: tsd/browser/lib.es6.d.ts at pos 466431
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLSelectElement")
public class HTMLSelectElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLSelectElement () {
    } 

    @JsOverlay
    public final void setByIndex(String index, Object value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Object getByIndex(String index) {
        return (Object) Js.asPropertyMap(this).get(index);
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

    public Element lastElementChild;

    /** 
      * Sets or retrieves the number of objects in a collection.
     */
    public int length;

    /** 
      * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    public Boolean multiple;

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

    public HTMLOptionsCollection options;

    public Element previousElementSibling;

    /** 
      * When present, marks an element that can't be submitted without a value.
     */
    public Boolean required;

    /** 
      * Sets or retrieves the index of the selected option in a select object.
     */
    public Number selectedIndex;

    public HTMLCollectionOf<HTMLOptionElement> selectedOptions;

    /** 
      * Sets or retrieves the number of rows in the list box. 
     */
    public int size;

    /** 
      * Retrieves the type of select control based on the value of the MULTIPLE attribute.
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
      * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    public String value;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /*
        Methods
    */
    public native void add(HTMLElement element);
    public native void add(HTMLElement element, HTMLElement before /* optional */);
    public native void add(HTMLElement element, @DoNotAutobox Number before /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@464576
      * Adds an element to the areas, controlRange, or options collection.
     */
    public native void add(HTMLElement element, UnionOfHTMLElementAndNumber before /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@464757
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "autofocus")
    public native Boolean getAutofocus();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "multiple")
    public native Boolean getMultiple();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "options")
    public native HTMLOptionsCollection getOptions();
    @JsProperty(name = "required")
    public native Boolean getRequired();
    @JsProperty(name = "selectedIndex")
    public native Number getSelectedIndex();
    @JsProperty(name = "selectedOptions")
    public native HTMLCollectionOf<HTMLOptionElement> getSelectedOptions();
    @JsProperty(name = "size")
    public native Number getSize();
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
    public native Object item();
    public native Object item(Object name /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@465352
      * Retrieves a select object or an object from an options collection.
     */
    public native Object item(Object name /* optional */, Object index /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@465641
      * Retrieves a select object or an object from an options collection.
     */
    public native Object namedItem(String name);
    public native void remove();
    /** 
      * tsd/browser/lib.es6.d.ts@465850
      * Removes an element from the collection.
     */
    public native void remove(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "autofocus")
    public native void setAutofocus(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@466074
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "multiple")
    public native void setMultiple(Boolean value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "options")
    public native void setOptions(HTMLOptionsCollection value);
    @JsProperty(name = "required")
    public native void setRequired(Boolean value);
    @JsProperty(name = "selectedIndex")
    public native void setSelectedIndex(@DoNotAutobox Number value);
    @JsProperty(name = "selectedOptions")
    public native void setSelectedOptions(HTMLCollectionOf<HTMLOptionElement> value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
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
