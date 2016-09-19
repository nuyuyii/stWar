/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nuyuyii
 */
@WebService(serviceName = "mvWebService")
public class mvWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checklogin")
    public String checklogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        String result = "";
        String user[] = {"user1"};
        String pass[] = {"1234"};
        if(user[0].equals(username) && pass[0].equals(password)){
            result = "ยินดีต้อนรับเข้าสู่ระบบ";
            return result;
        } else {
            result = "ไม่สามารถเข้าสู่ระบบได้";
            return result;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getsqr")
    public int getsqr(@WebParam(name = "no") final int no) {
        //TODO write your implementation code here:
        return no*no;
    }
    
}
