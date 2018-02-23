package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: XPathNSResolver
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 720082
  * declared in: tsd/browser/lib.es6.d.ts at pos 720174
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathNSResolver")
public class XPathNSResolver
{

    /*
        Constructors
    */
    public XPathNSResolver () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@720116
     */
    public native String lookupNamespaceURI(String prefix);
}
