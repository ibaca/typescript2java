package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Node
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 531508
  * declared in: tsd/browser/lib.es6.d.ts at pos 533617
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Node")
public class Node extends EventTarget 
{

    /*
        Constructors
    */
    public Node () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="Node", name="ATTRIBUTE_NODE")
    public static Number ATTRIBUTE_NODE;

    @JsProperty(namespace="Node", name="CDATA_SECTION_NODE")
    public static Number CDATA_SECTION_NODE;

    @JsProperty(namespace="Node", name="COMMENT_NODE")
    public static Number COMMENT_NODE;

    @JsProperty(namespace="Node", name="DOCUMENT_FRAGMENT_NODE")
    public static Number DOCUMENT_FRAGMENT_NODE;

    @JsProperty(namespace="Node", name="DOCUMENT_NODE")
    public static Number DOCUMENT_NODE;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_CONTAINED_BY")
    public static Number DOCUMENT_POSITION_CONTAINED_BY;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_CONTAINS")
    public static Number DOCUMENT_POSITION_CONTAINS;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_DISCONNECTED")
    public static Number DOCUMENT_POSITION_DISCONNECTED;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_FOLLOWING")
    public static Number DOCUMENT_POSITION_FOLLOWING;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    public static Number DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;

    @JsProperty(namespace="Node", name="DOCUMENT_POSITION_PRECEDING")
    public static Number DOCUMENT_POSITION_PRECEDING;

    @JsProperty(namespace="Node", name="DOCUMENT_TYPE_NODE")
    public static Number DOCUMENT_TYPE_NODE;

    @JsProperty(namespace="Node", name="ELEMENT_NODE")
    public static Number ELEMENT_NODE;

    @JsProperty(namespace="Node", name="ENTITY_NODE")
    public static Number ENTITY_NODE;

    @JsProperty(namespace="Node", name="ENTITY_REFERENCE_NODE")
    public static Number ENTITY_REFERENCE_NODE;

    @JsProperty(namespace="Node", name="NOTATION_NODE")
    public static Number NOTATION_NODE;

    @JsProperty(namespace="Node", name="PROCESSING_INSTRUCTION_NODE")
    public static Number PROCESSING_INSTRUCTION_NODE;

    @JsProperty(namespace="Node", name="TEXT_NODE")
    public static Number TEXT_NODE;

    /*
        Properties
    */

    public NamedNodeMap attributes;

    public String baseURI;

    public NodeList childNodes;

    public Node firstChild;

    public Node lastChild;

    public String localName;

    public String namespaceURI;

    public Node nextSibling;

    public String nodeName;

    public Number nodeType;

    public String nodeValue;

    public Document ownerDocument;

    public HTMLElement parentElement;

    public Node parentNode;

    public Node previousSibling;

    public String textContent;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@532148
     */
    public native <T> T appendChild(@DoNotAutobox T newChild);
    public native Node cloneNode();
    /** 
      * tsd/browser/lib.es6.d.ts@532197
     */
    public native Node cloneNode(Boolean deep /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@532234
     */
    public native Number compareDocumentPosition(Node other);
    /** 
      * tsd/browser/lib.es6.d.ts@532284
     */
    public native Boolean contains(Node child);
    @JsProperty(name = "ATTRIBUTE_NODE")
    public native Number getATTRIBUTE_NODE();
    @JsProperty(name = "attributes")
    public native NamedNodeMap getAttributes();
    @JsProperty(name = "baseURI")
    public native String getBaseURI();
    @JsProperty(name = "CDATA_SECTION_NODE")
    public native Number getCDATA_SECTION_NODE();
    @JsProperty(name = "COMMENT_NODE")
    public native Number getCOMMENT_NODE();
    @JsProperty(name = "childNodes")
    public native NodeList getChildNodes();
    @JsProperty(name = "DOCUMENT_FRAGMENT_NODE")
    public native Number getDOCUMENT_FRAGMENT_NODE();
    @JsProperty(name = "DOCUMENT_NODE")
    public native Number getDOCUMENT_NODE();
    @JsProperty(name = "DOCUMENT_POSITION_CONTAINED_BY")
    public native Number getDOCUMENT_POSITION_CONTAINED_BY();
    @JsProperty(name = "DOCUMENT_POSITION_CONTAINS")
    public native Number getDOCUMENT_POSITION_CONTAINS();
    @JsProperty(name = "DOCUMENT_POSITION_DISCONNECTED")
    public native Number getDOCUMENT_POSITION_DISCONNECTED();
    @JsProperty(name = "DOCUMENT_POSITION_FOLLOWING")
    public native Number getDOCUMENT_POSITION_FOLLOWING();
    @JsProperty(name = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    public native Number getDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC();
    @JsProperty(name = "DOCUMENT_POSITION_PRECEDING")
    public native Number getDOCUMENT_POSITION_PRECEDING();
    @JsProperty(name = "DOCUMENT_TYPE_NODE")
    public native Number getDOCUMENT_TYPE_NODE();
    @JsProperty(name = "ELEMENT_NODE")
    public native Number getELEMENT_NODE();
    @JsProperty(name = "ENTITY_NODE")
    public native Number getENTITY_NODE();
    @JsProperty(name = "ENTITY_REFERENCE_NODE")
    public native Number getENTITY_REFERENCE_NODE();
    @JsProperty(name = "firstChild")
    public native Node getFirstChild();
    @JsProperty(name = "lastChild")
    public native Node getLastChild();
    @JsProperty(name = "localName")
    public native String getLocalName();
    @JsProperty(name = "NOTATION_NODE")
    public native Number getNOTATION_NODE();
    @JsProperty(name = "namespaceURI")
    public native String getNamespaceURI();
    @JsProperty(name = "nextSibling")
    public native Node getNextSibling();
    @JsProperty(name = "nodeName")
    public native String getNodeName();
    @JsProperty(name = "nodeType")
    public native Number getNodeType();
    @JsProperty(name = "nodeValue")
    public native String getNodeValue();
    @JsProperty(name = "ownerDocument")
    public native Document getOwnerDocument();
    @JsProperty(name = "PROCESSING_INSTRUCTION_NODE")
    public native Number getPROCESSING_INSTRUCTION_NODE();
    @JsProperty(name = "parentElement")
    public native HTMLElement getParentElement();
    @JsProperty(name = "parentNode")
    public native Node getParentNode();
    @JsProperty(name = "previousSibling")
    public native Node getPreviousSibling();
    @JsProperty(name = "TEXT_NODE")
    public native Number getTEXT_NODE();
    @JsProperty(name = "textContent")
    public native String getTextContent();
    /** 
      * tsd/browser/lib.es6.d.ts@532320
     */
    public native Boolean hasAttributes();
    /** 
      * tsd/browser/lib.es6.d.ts@532350
     */
    public native Boolean hasChildNodes();
    /** 
      * tsd/browser/lib.es6.d.ts@532380
     */
    public native Node insertBefore(Node newChild, Node refChild);
    /** 
      * tsd/browser/lib.es6.d.ts@532443
     */
    public native Boolean isDefaultNamespace(String namespaceURI);
    /** 
      * tsd/browser/lib.es6.d.ts@532505
     */
    public native Boolean isEqualNode(Node arg);
    /** 
      * tsd/browser/lib.es6.d.ts@532542
     */
    public native Boolean isSameNode(Node other);
    /** 
      * tsd/browser/lib.es6.d.ts@532580
     */
    public native String lookupNamespaceURI(String prefix);
    /** 
      * tsd/browser/lib.es6.d.ts@532642
     */
    public native String lookupPrefix(String namespaceURI);
    /** 
      * tsd/browser/lib.es6.d.ts@532704
     */
    public native void normalize();
    /** 
      * tsd/browser/lib.es6.d.ts@532727
     */
    public native Node removeChild(Node oldChild);
    /** 
      * tsd/browser/lib.es6.d.ts@532766
     */
    public native Node replaceChild(Node newChild, Node oldChild);
    @JsProperty(name = "ATTRIBUTE_NODE")
    public native void setATTRIBUTE_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "attributes")
    public native void setAttributes(NamedNodeMap value);
    @JsProperty(name = "baseURI")
    public native void setBaseURI(String value);
    @JsProperty(name = "CDATA_SECTION_NODE")
    public native void setCDATA_SECTION_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "COMMENT_NODE")
    public native void setCOMMENT_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "childNodes")
    public native void setChildNodes(NodeList value);
    @JsProperty(name = "DOCUMENT_FRAGMENT_NODE")
    public native void setDOCUMENT_FRAGMENT_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_NODE")
    public native void setDOCUMENT_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_CONTAINED_BY")
    public native void setDOCUMENT_POSITION_CONTAINED_BY(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_CONTAINS")
    public native void setDOCUMENT_POSITION_CONTAINS(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_DISCONNECTED")
    public native void setDOCUMENT_POSITION_DISCONNECTED(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_FOLLOWING")
    public native void setDOCUMENT_POSITION_FOLLOWING(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    public native void setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_POSITION_PRECEDING")
    public native void setDOCUMENT_POSITION_PRECEDING(@DoNotAutobox Number value);
    @JsProperty(name = "DOCUMENT_TYPE_NODE")
    public native void setDOCUMENT_TYPE_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "ELEMENT_NODE")
    public native void setELEMENT_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "ENTITY_NODE")
    public native void setENTITY_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "ENTITY_REFERENCE_NODE")
    public native void setENTITY_REFERENCE_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "firstChild")
    public native void setFirstChild(Node value);
    @JsProperty(name = "lastChild")
    public native void setLastChild(Node value);
    @JsProperty(name = "localName")
    public native void setLocalName(String value);
    @JsProperty(name = "NOTATION_NODE")
    public native void setNOTATION_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "namespaceURI")
    public native void setNamespaceURI(String value);
    @JsProperty(name = "nextSibling")
    public native void setNextSibling(Node value);
    @JsProperty(name = "nodeName")
    public native void setNodeName(String value);
    @JsProperty(name = "nodeType")
    public native void setNodeType(@DoNotAutobox Number value);
    @JsProperty(name = "nodeValue")
    public native void setNodeValue(String value);
    @JsProperty(name = "ownerDocument")
    public native void setOwnerDocument(Document value);
    @JsProperty(name = "PROCESSING_INSTRUCTION_NODE")
    public native void setPROCESSING_INSTRUCTION_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "parentElement")
    public native void setParentElement(HTMLElement value);
    @JsProperty(name = "parentNode")
    public native void setParentNode(Node value);
    @JsProperty(name = "previousSibling")
    public native void setPreviousSibling(Node value);
    @JsProperty(name = "TEXT_NODE")
    public native void setTEXT_NODE(@DoNotAutobox Number value);
    @JsProperty(name = "textContent")
    public native void setTextContent(String value);
}
