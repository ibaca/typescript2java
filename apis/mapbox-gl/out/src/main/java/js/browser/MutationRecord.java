package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MutationRecord
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 528652
  * declared in: tsd/browser/lib.es6.d.ts at pos 529032
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationRecord")
public class MutationRecord
{

    /*
        Constructors
    */
    public MutationRecord () {
    } 

    /*
        Properties
    */

    public NodeList addedNodes;

    public String attributeName;

    public String attributeNamespace;

    public Node nextSibling;

    public String oldValue;

    public Node previousSibling;

    public NodeList removedNodes;

    public Node target;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "addedNodes")
    public native NodeList getAddedNodes();
    @JsProperty(name = "attributeName")
    public native String getAttributeName();
    @JsProperty(name = "attributeNamespace")
    public native String getAttributeNamespace();
    @JsProperty(name = "nextSibling")
    public native Node getNextSibling();
    @JsProperty(name = "oldValue")
    public native String getOldValue();
    @JsProperty(name = "previousSibling")
    public native Node getPreviousSibling();
    @JsProperty(name = "removedNodes")
    public native NodeList getRemovedNodes();
    @JsProperty(name = "target")
    public native Node getTarget();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "addedNodes")
    public native void setAddedNodes(NodeList value);
    @JsProperty(name = "attributeName")
    public native void setAttributeName(String value);
    @JsProperty(name = "attributeNamespace")
    public native void setAttributeNamespace(String value);
    @JsProperty(name = "nextSibling")
    public native void setNextSibling(Node value);
    @JsProperty(name = "oldValue")
    public native void setOldValue(String value);
    @JsProperty(name = "previousSibling")
    public native void setPreviousSibling(Node value);
    @JsProperty(name = "removedNodes")
    public native void setRemovedNodes(NodeList value);
    @JsProperty(name = "target")
    public native void setTarget(Node value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
