//package ReadXML;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//transformer
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult;
import static serverpack.mvWebService.callXML;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nuyuyii
 */
public class ReadXML {
    
    public static void main(String[] args) throws Exception {
        
        File xmlFile = new File("/home/nuyuyii/NetBeansProjects/Pro_ST/MovieWebService/web/movies.xml");
        String filepath = "/home/nuyuyii/NetBeansProjects/Pro_ST/MovieWebService/web/Updatemovies.xml";
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(xmlFile);
        
        NodeList nList = doc.getElementsByTagName("film");
        showNode(nList,60);
        deleteElement(nList,"director",60);
        deleteMovie(nList,60);
        addMovie(doc, "boxset","$500",59);
        showNode(nList,59);
        //getMovie(doc, "1", "Paypal", "Payment", "1000");
        getMovie(doc, "Pete's Dragon ", "2016", "Animation,Adventure", 102, "David Lowery");
        showNode(nList,60);
         // Use a Transformer for output
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));//System.out);
        transformer.transform(source, result);       
        
    }
    
    private static void showNode(NodeList nList,int nodeid){
          Element nfilm = (Element) nList.item(nodeid-1);
          NodeList childfilm = nfilm.getChildNodes();
          /*if (nfilm.getNodeType() == Node.ELEMENT_NODE) {
              //Print each employee's detail
              Element eElement = (Element) nfilm;
              //System.out.println("Employee id : "    + eElement.getAttribute("id"));
              System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
              System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
              System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
          }*/
          for (int j= 0; j < childfilm.getLength(); j++){
            Node temp = childfilm.item(j);
            //System.out.println(temp.getNodeName());
            NodeList childtemp = temp.getChildNodes();
            if(childtemp.getLength() > 1){
                System.out.print(temp.getNodeName()+ ": ");                
                for (int i = 0; i<childtemp.getLength();i++){
                    Node child = childtemp.item(i);
                    NodeList childnode = child.getChildNodes();                    
                    if (i==1){                        
                        System.out.println(child.getTextContent());
                    }else if (childnode.getLength()>0){
                        System.out.println("       " 
                                + child.getTextContent());
                    }
                }
                
            //We got more childs; Let's visit them as well
            }else if(childtemp.getLength() > 0){
                System.out.println(temp.getNodeName() + ": " + temp.getTextContent());
            }
          }
          System.out.println("-----------------");
    }
    
    private static void searchMovie(NodeList nList, String search){
        System.out.println("\n\nsearch about : " + search);
        System.out.println("----------------------------");
        for (int i = 0; i < nList.getLength(); i++) {  //all film
                 Element film = (Element) nList.item(i);
                 NodeList childfilm = film.getChildNodes();  
                      for (int j= 0; j < childfilm.getLength(); j++){ //all node in film
                               Node temp = childfilm.item(j);
                               NodeList childElement = temp.getChildNodes();
                               if (childElement.getLength() > 1){ 
                                        for (int l=1; l<childElement.getLength();l++){  // For item(0) is types element
                                                 Node child = childElement.item(l);  // Start item(1) is type1 element
                                                 if (child.getTextContent().toLowerCase().contains(search.toLowerCase())){
                                      System.out.println(temp.getNodeName() + " ChildNode " + child.getNodeName()+ ": "
                                                                  + child.getTextContent()+",  nodeId: "+(i+1));
                                                 }
                                        }   //end forLoop l
                               }else if (temp.getTextContent().toLowerCase().contains(search.toLowerCase())){
                                        System.out.println(temp.getNodeName()+ ": "
                                           + temp.getTextContent()+",  nodeId: "+(i+1)); 
                               }
                      }  //end forLoop j
        }  //end forLoop i
    }  //end function
    
    private static void deleteElement(NodeList nList, String delname, int nodeid){
        Element nfilm = (Element) nList.item(nodeid-1);
        Node delNode = nfilm.getElementsByTagName(delname).item(0);
        nfilm.removeChild(delNode);
        System.out.println("XML file delete element successfully");
    }
    
    private static void deleteMovie(NodeList nList, int nodeid){
        Element nfilm = (Element) nList.item(nodeid-1);
        nfilm.getParentNode().removeChild(nfilm);
        System.out.println("XML file delete movie successfully");
    }
    
    private static void addElement(Document doc, String newname, String value, int nodeid) {
            NodeList film = doc.getElementsByTagName("film");
            Element nfilm = (Element) film.item(nodeid-1);
            Element newElement = doc.createElement(newname);
            newElement.appendChild(doc.createTextNode(value));
            nfilm.appendChild(newElement);
    }
    
    private static void updateElementValue(NodeList nList, String elementname, String newValue, int nodeid) {
          Element nfilm =  (Element) nList.item(nodeid-1);
          Node name = nfilm.getElementsByTagName(elementname).item(0).getFirstChild();
          name.setNodeValue(newValue);             
    }
    
    private static void addMovie(Document doc, String newname, String value, int nodeid) {
        NodeList film = doc.getElementsByTagName("film");
        Element nfilm = (Element) film.item(nodeid-1);
        Element newElement = doc.createElement(newname);
        newElement.appendChild(doc.createTextNode(value));
        //System.out.println("Insert OK");
        nfilm.appendChild(newElement);
    }
    private static void getMovie(Document doc, String title, String year, String types, int time, String director) {
        Element movie = (Element) doc.getDocumentElement();//getElementsByTagName("film");
        Element newfilm = doc.createElement("film");
        //newfilm.setAttribute("id", id);
        String mins = time+" min";
        newfilm.appendChild(getMovieElement(doc, "title", title));
        newfilm.appendChild(getMovieElement(doc, "year", year));
        newfilm.appendChild(getMovieElement(doc, "types", ""));
        newfilm.appendChild(getMovieElement(doc, "time", mins));
        newfilm.appendChild(getMovieElement(doc, "director", director));
        Element addtype = (Element) newfilm.getElementsByTagName("types").item(0);
        //Node addtype = 
        int index = 1;
        for (String type: types.split(",")){
            String name = "type"+index;
            addtype.appendChild(getMovieElement(doc, name, type));
            index++;
            //System.out.println(type);
        }
        // NodeList childfilm = newfilm.getChildNodes();
        //System.out.println("-----"+newfilm.getTextContent());
        movie.appendChild(newfilm);
        //return company;
    }
    private static Node getMovieElement(Document doc, String name, String value){
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        System.out.println("Insert OK "+node.getTextContent());
        return node;
    }
}
/*  for (int j= 0; j < childfilm.getLength(); j++){
            Node temp = childfilm.item(j);
            NodeList childtemp = temp.getChildNodes();
            if(childtemp.getLength() > 1){
                for (int i = 0; i<childtemp.getLength();i++){
                    Node child = childtemp.item(i);
                    NodeList childnode = child.getChildNodes();
                    if (child.getNodeName()==""){
                        System.out.println(temp.getNodeName() + ": " 
                                + child.getTextContent());
                    }else if (childnode.getLength()>0){
                        System.out.println("       " 
                                + child.getTextContent());
                    }
                }                
            //We got more childs; Let's visit them as well
            }else if(childtemp.getLength() > 0){
                System.out.println(temp.getNodeName() + ": " + temp.getTextContent());
            }
          }
          System.out.println("-----------------");*/