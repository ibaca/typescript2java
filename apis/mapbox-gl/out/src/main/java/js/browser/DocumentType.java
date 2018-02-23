package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DocumentType
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 363548
  * declared in: tsd/browser/lib.es6.d.ts at pos 363821
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DocumentType")
public class DocumentType extends Node  implements ChildNode 
{

    /*
        Constructors
    */
    public DocumentType () {
    } 

    /*
        Properties
    */

    public NamedNodeMap entities;

    public String internalSubset;

    public String name;

    public NamedNodeMap notations;

    public String publicId;

    public String systemId;

    /*
        Methods
    */
    @JsProperty(name = "entities")
    public native NamedNodeMap getEntities();
    @JsProperty(name = "internalSubset")
    public native String getInternalSubset();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "notations")
    public native NamedNodeMap getNotations();
    @JsProperty(name = "publicId")
    public native String getPublicId();
    @JsProperty(name = "systemId")
    public native String getSystemId();
    /** 
      * tsd/browser/lib.es6.d.ts@723950
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
     */
    public native void remove();
    @JsProperty(name = "entities")
    public native void setEntities(NamedNodeMap value);
    @JsProperty(name = "internalSubset")
    public native void setInternalSubset(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "notations")
    public native void setNotations(NamedNodeMap value);
    @JsProperty(name = "publicId")
    public native void setPublicId(String value);
    @JsProperty(name = "systemId")
    public native void setSystemId(String value);
}
