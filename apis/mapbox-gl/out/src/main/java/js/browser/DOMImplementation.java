package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMImplementation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 321746
  * declared in: tsd/browser/lib.es6.d.ts at pos 322077
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMImplementation")
public class DOMImplementation
{

    /*
        Constructors
    */
    public DOMImplementation () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@321782
     */
    public native Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype);
    /** 
      * tsd/browser/lib.es6.d.ts@321894
     */
    public native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);
    /** 
      * tsd/browser/lib.es6.d.ts@321991
     */
    public native Document createHTMLDocument(String title);
    /** 
      * tsd/browser/lib.es6.d.ts@322040
     */
    public native Boolean hasFeature();
}
