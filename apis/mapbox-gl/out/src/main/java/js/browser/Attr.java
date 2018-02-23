package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Attr
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 285292
  * declared in: tsd/browser/lib.es6.d.ts at pos 285489
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Attr")
public class Attr extends Node 
{

    /*
        Constructors
    */
    public Attr () {
    } 

    /*
        Properties
    */

    public String name;

    public Element ownerElement;

    public String prefix;

    public Boolean specified;

    public String value;

    /*
        Methods
    */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "ownerElement")
    public native Element getOwnerElement();
    @JsProperty(name = "prefix")
    public native String getPrefix();
    @JsProperty(name = "specified")
    public native Boolean getSpecified();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "ownerElement")
    public native void setOwnerElement(Element value);
    @JsProperty(name = "prefix")
    public native void setPrefix(String value);
    @JsProperty(name = "specified")
    public native void setSpecified(Boolean value);
    @JsProperty(name = "value")
    public native void setValue(String value);
}
