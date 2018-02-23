package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGElementInstance
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 577540
  * declared in: tsd/browser/lib.es6.d.ts at pos 577986
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGElementInstance")
public class SVGElementInstance extends EventTarget 
{

    /*
        Constructors
    */
    public SVGElementInstance () {
    } 

    /*
        Properties
    */

    public SVGElementInstanceList childNodes;

    public SVGElement correspondingElement;

    public SVGUseElement correspondingUseElement;

    public SVGElementInstance firstChild;

    public SVGElementInstance lastChild;

    public SVGElementInstance nextSibling;

    public SVGElementInstance parentNode;

    public SVGElementInstance previousSibling;

    /*
        Methods
    */
    @JsProperty(name = "childNodes")
    public native SVGElementInstanceList getChildNodes();
    @JsProperty(name = "correspondingElement")
    public native SVGElement getCorrespondingElement();
    @JsProperty(name = "correspondingUseElement")
    public native SVGUseElement getCorrespondingUseElement();
    @JsProperty(name = "firstChild")
    public native SVGElementInstance getFirstChild();
    @JsProperty(name = "lastChild")
    public native SVGElementInstance getLastChild();
    @JsProperty(name = "nextSibling")
    public native SVGElementInstance getNextSibling();
    @JsProperty(name = "parentNode")
    public native SVGElementInstance getParentNode();
    @JsProperty(name = "previousSibling")
    public native SVGElementInstance getPreviousSibling();
    @JsProperty(name = "childNodes")
    public native void setChildNodes(SVGElementInstanceList value);
    @JsProperty(name = "correspondingElement")
    public native void setCorrespondingElement(SVGElement value);
    @JsProperty(name = "correspondingUseElement")
    public native void setCorrespondingUseElement(SVGUseElement value);
    @JsProperty(name = "firstChild")
    public native void setFirstChild(SVGElementInstance value);
    @JsProperty(name = "lastChild")
    public native void setLastChild(SVGElementInstance value);
    @JsProperty(name = "nextSibling")
    public native void setNextSibling(SVGElementInstance value);
    @JsProperty(name = "parentNode")
    public native void setParentNode(SVGElementInstance value);
    @JsProperty(name = "previousSibling")
    public native void setPreviousSibling(SVGElementInstance value);
}
