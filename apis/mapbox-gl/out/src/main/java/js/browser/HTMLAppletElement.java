package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLAppletElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 380396
  * declared in: tsd/browser/lib.es6.d.ts at pos 382728
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAppletElement")
public class HTMLAppletElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLAppletElement () {
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
      * Address of a pointer to the document this page or frame contains. If there is no document, then null will be returned.
     */
    public Document contentDocument;

    /** 
      * Sets or retrieves the URL that references the data of the object.
     */
    public String data;

    /** 
      * Sets or retrieves a character string that can be used to implement your own declare functionality for the object.
     */
    public Boolean declare;

    public Element firstElementChild;

    public HTMLFormElement form;

    /** 
      * Sets or retrieves the height of the object.
     */
    public String height;

    public Number hspace;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the shape of the object.
     */
    public String name;

    public Element nextElementSibling;

    public String object;

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
      * Sets or retrieves a message to be displayed while an object is loading.
     */
    public String standby;

    /** 
      * Returns the content type of the object.
     */
    public String type;

    /** 
      * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String useMap;

    public Number vspace;

    public Number width;

    /*
        Methods
    */
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
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "object")
    public native String getObject();
    @JsProperty(name = "standby")
    public native String getStandby();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "useMap")
    public native String getUseMap();
    @JsProperty(name = "vspace")
    public native Number getVspace();
    @JsProperty(name = "width")
    public native Number getWidth();
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
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "object")
    public native void setObject(String value);
    @JsProperty(name = "standby")
    public native void setStandby(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "useMap")
    public native void setUseMap(String value);
    @JsProperty(name = "vspace")
    public native void setVspace(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
