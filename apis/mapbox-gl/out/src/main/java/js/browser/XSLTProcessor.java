package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: XSLTProcessor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 721534
  * declared in: tsd/browser/lib.es6.d.ts at pos 722000
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XSLTProcessor")
public class XSLTProcessor
{

    /*
        Constructors
    */
    public XSLTProcessor () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@721566
     */
    public native void clearParameters();
    /** 
      * tsd/browser/lib.es6.d.ts@721595
     */
    public native Object getParameter(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@721659
     */
    public native void importStylesheet(Node style);
    /** 
      * tsd/browser/lib.es6.d.ts@721700
     */
    public native void removeParameter(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@721768
     */
    public native void reset();
    /** 
      * tsd/browser/lib.es6.d.ts@721787
     */
    public native void setParameter(String namespaceURI, String localName, Object value);
    /** 
      * tsd/browser/lib.es6.d.ts@721864
     */
    public native Document transformToDocument(Node source);
    /** 
      * tsd/browser/lib.es6.d.ts@721913
     */
    public native DocumentFragment transformToFragment(Node source, Document document);
}
