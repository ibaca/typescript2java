package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLObjectElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 448626
  * declared in: tsd/browser/lib.es6.d.ts at pos 452697
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLObjectElement")
public class HTMLObjectElement extends HTMLElement  implements GetSVGDocument 
{

    /*
        Constructors
    */
    public HTMLObjectElement () {
    } 

    /*
        Properties
    */

    /** 
      * Retrieves a string of the URL where the object tag can be found. This is often the href of the document that the object is in, or the value set by a base element.
     */
    public String BaseHref;

    public String align;

    /** 
      * Sets or retrieves a text alternative to the graphic.
     */
    public String alt;

    /** 
      * Gets or sets the optional alternative HTML script to execute if the object fails to load.
     */
    public String altHtml;

    /** 
      * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
     */
    public String archive;

    public String border;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the URL of the file containing the compiled Java class.
     */
    public String code;

    /** 
      * Sets or retrieves the URL of the component.
     */
    public String codeBase;

    /** 
      * Sets or retrieves the Internet media type for the code associated with the object.
     */
    public String codeType;

    /** 
      * Retrieves the document object of the page or frame.
     */
    public Document contentDocument;

    /** 
      * Sets or retrieves the URL that references the data of the object.
     */
    public String data;

    public Boolean declare;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

    /** 
      * Sets or retrieves the height of the object.
     */
    public String height;

    public Number hspace;

    public Element lastElementChild;

    /** 
      * Gets or sets whether the DLNA PlayTo device is available.
     */
    public Boolean msPlayToDisabled;

    /** 
      * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
     */
    public String msPlayToPreferredSourceUri;

    /** 
      * Gets or sets the primary DLNA PlayTo device.
     */
    public Boolean msPlayToPrimary;

    /** 
      * Gets the source associated with the media element for use by the PlayToManager.
     */
    public Object msPlayToSource;

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

    public Number readyState;

    /** 
      * Sets or retrieves a message to be displayed while an object is loading.
     */
    public String standby;

    /** 
      * Sets or retrieves the MIME type of the object.
     */
    public String type;

    /** 
      * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String useMap;

    /** 
      * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String validationMessage;

    /** 
      * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState validity;

    public Number vspace;

    /** 
      * Sets or retrieves the width of the object.
     */
    public String width;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@452145
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "alt")
    public native String getAlt();
    @JsProperty(name = "altHtml")
    public native String getAltHtml();
    @JsProperty(name = "archive")
    public native String getArchive();
    @JsProperty(name = "BaseHref")
    public native String getBaseHref();
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "code")
    public native String getCode();
    @JsProperty(name = "codeBase")
    public native String getCodeBase();
    @JsProperty(name = "codeType")
    public native String getCodeType();
    @JsProperty(name = "contentDocument")
    public native Document getContentDocument();
    @JsProperty(name = "data")
    public native String getData();
    @JsProperty(name = "declare")
    public native Boolean getDeclare();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "height")
    public native String getHeight();
    @JsProperty(name = "hspace")
    public native Number getHspace();
    @JsProperty(name = "msPlayToDisabled")
    public native Boolean getMsPlayToDisabled();
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native String getMsPlayToPreferredSourceUri();
    @JsProperty(name = "msPlayToPrimary")
    public native Boolean getMsPlayToPrimary();
    @JsProperty(name = "msPlayToSource")
    public native Object getMsPlayToSource();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    /** 
      * tsd/browser/lib.es6.d.ts@729577
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
     */
    public native Document getSVGDocument();
    @JsProperty(name = "standby")
    public native String getStandby();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "useMap")
    public native String getUseMap();
    @JsProperty(name = "validationMessage")
    public native String getValidationMessage();
    @JsProperty(name = "validity")
    public native ValidityState getValidity();
    @JsProperty(name = "vspace")
    public native Number getVspace();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "willValidate")
    public native Boolean getWillValidate();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "alt")
    public native void setAlt(String value);
    @JsProperty(name = "altHtml")
    public native void setAltHtml(String value);
    @JsProperty(name = "archive")
    public native void setArchive(String value);
    @JsProperty(name = "BaseHref")
    public native void setBaseHref(String value);
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "code")
    public native void setCode(String value);
    @JsProperty(name = "codeBase")
    public native void setCodeBase(String value);
    @JsProperty(name = "codeType")
    public native void setCodeType(String value);
    @JsProperty(name = "contentDocument")
    public native void setContentDocument(Document value);
    /** 
      * tsd/browser/lib.es6.d.ts@452365
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "data")
    public native void setData(String value);
    @JsProperty(name = "declare")
    public native void setDeclare(Boolean value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "hspace")
    public native void setHspace(@DoNotAutobox Number value);
    @JsProperty(name = "msPlayToDisabled")
    public native void setMsPlayToDisabled(Boolean value);
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native void setMsPlayToPreferredSourceUri(String value);
    @JsProperty(name = "msPlayToPrimary")
    public native void setMsPlayToPrimary(Boolean value);
    @JsProperty(name = "msPlayToSource")
    public native void setMsPlayToSource(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "standby")
    public native void setStandby(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "useMap")
    public native void setUseMap(String value);
    @JsProperty(name = "validationMessage")
    public native void setValidationMessage(String value);
    @JsProperty(name = "validity")
    public native void setValidity(ValidityState value);
    @JsProperty(name = "vspace")
    public native void setVspace(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
    @JsProperty(name = "willValidate")
    public native void setWillValidate(Boolean value);
}
