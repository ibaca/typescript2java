package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: HTMLFormElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 409533
  * declared in: tsd/browser/lib.es6.d.ts at pos 412209
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFormElement")
public class HTMLFormElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLFormElement () {
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
      * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     */
    public String acceptCharset;

    /** 
      * Sets or retrieves the URL to which the form content is sent for processing.
     */
    public String action;

    /** 
      * Specifies whether autocomplete is applied to an editable text field.
     */
    public String autocomplete;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Retrieves a collection, in source order, of all controls in a given form.
     */
    public HTMLFormControlsCollection elements;

    /** 
      * Sets or retrieves the MIME encoding for the form.
     */
    public String encoding;

    /** 
      * Sets or retrieves the encoding type for the form.
     */
    public String enctype;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the number of objects in a collection.
     */
    public int length;

    /** 
      * Sets or retrieves how to send the form data to the server.
     */
    public String method;

    /** 
      * Sets or retrieves the name of the object.
     */
    public String name;

    public Element nextElementSibling;

    /** 
      * Designates a form that is not validated when submitted.
     */
    public Boolean noValidate;

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
      * Sets or retrieves the window or frame at which to target content.
     */
    public String target;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@410973
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "acceptCharset")
    public native String getAcceptCharset();
    @JsProperty(name = "action")
    public native String getAction();
    @JsProperty(name = "autocomplete")
    public native String getAutocomplete();
    @JsProperty(name = "elements")
    public native HTMLFormControlsCollection getElements();
    @JsProperty(name = "encoding")
    public native String getEncoding();
    @JsProperty(name = "enctype")
    public native String getEnctype();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "method")
    public native String getMethod();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "noValidate")
    public native Boolean getNoValidate();
    @JsProperty(name = "target")
    public native String getTarget();
    public native Object item();
    public native Object item(Object name /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@411565
      * Retrieves a form object or an object from an elements collection.
     */
    public native Object item(Object name /* optional */, Object index /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@411696
      * Retrieves a form object or an object from an elements collection.
     */
    public native Object namedItem(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@411790
      * Fires when the user resets a form.
     */
    public native void reset();
    @JsProperty(name = "acceptCharset")
    public native void setAcceptCharset(String value);
    @JsProperty(name = "action")
    public native void setAction(String value);
    @JsProperty(name = "autocomplete")
    public native void setAutocomplete(String value);
    @JsProperty(name = "elements")
    public native void setElements(HTMLFormControlsCollection value);
    @JsProperty(name = "encoding")
    public native void setEncoding(String value);
    @JsProperty(name = "enctype")
    public native void setEnctype(String value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "method")
    public native void setMethod(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "noValidate")
    public native void setNoValidate(Boolean value);
    @JsProperty(name = "target")
    public native void setTarget(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@411878
      * Fires when a FORM is about to be submitted.
     */
    public native void submit();
}
