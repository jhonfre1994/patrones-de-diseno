
import facade.FacadeServices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonfre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FacadeServices facade = new FacadeServices();
        facade.searchService("Bogota", "22/05/2021", "30/05/2021");
    }
    
}
