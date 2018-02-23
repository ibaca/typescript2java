package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSNamespaceRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 295081
  * declared in: tsd/browser/lib.es6.d.ts at pos 295206
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSNamespaceRule")
public class CSSNamespaceRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSNamespaceRule () {
    } 

    /*
        Properties
    */

    public String namespaceURI;

    public String prefix;

    /*
        Methods
    */
    @JsProperty(name = "namespaceURI")
    public native String getNamespaceURI();
    @JsProperty(name = "prefix")
    public native String getPrefix();
    @JsProperty(name = "namespaceURI")
    public native void setNamespaceURI(String value);
    @JsProperty(name = "prefix")
    public native void setPrefix(String value);
}
