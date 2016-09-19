
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
        
        File xmlFile = new File("/home/nuyuyii/NetBeansProjects/MovieWebService/web/movies.xml");
        
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(xmlFile);
        
        NodeList nList = doc.getElementsByTagName("film");
        showNode(nList,60);

        
        
    }
    
    private static void showNode(NodeList nList,int nodeid){
          Element nfilm = (Element) nList.item(nodeid-1);
          NodeList childfilm = nfilm.getChildNodes();
          for (int j= 0; j < childfilm.getLength(); j++){
            Node temp = childfilm.item(j);
            NodeList childtemp = temp.getChildNodes();
            if(childtemp.getLength() > 1){
                for (int i = 0; i<childtemp.getLength();i++){
                    Node child = childtemp.item(i);
                    NodeList childnode = child.getChildNodes();
                    if (child.getNodeName()=="type1"){
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

    
}
