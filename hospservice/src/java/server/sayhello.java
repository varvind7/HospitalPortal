/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author varvi
 */
@WebService(serviceName = "sayhello")
public class sayhello {

    /**
     * This is a sample web service operation
     */
    @WebMethod
    public String hello(String txt) {
        String diet=null;
        if(txt.equals("fever"))
        {
            diet="The list of foods below is beneficial for reducing fever:<br>" +
"<br>" +
"Fluid-rich foods: Drink water, hot tea, fresh fruit juice. Intake of fluid-rich foods is recommended such as poultry broths, thin soups, coconut water.<br>" +
"Fresh fruits: Fruits like apples, oranges, watermelon, pineapple, kiwi are rich in vitamin C. This contains antioxidants that reduce fever.<br>" +
"Avoid fruits with heavy sugar and fruits canned in syrup because sugar inhibits the immune system. The banana provides vital nutrients and easy to digest.<br>" +
"Proper intake of proteins: Scrambled eggs, smoothie with low-fat milk, dal, chana or Indian cottage cheese are rich in protein and beneficial.";
        }
        if(txt.equals("cough"))
        {
            diet="Here’s a list of food to go for when trying to tame a cough: <br>" +
"<br>" +
"Honey – honey is a traditional remedy for coughs, and in one study parents rated honey most favourably for symptomatic relief of their child's nocturnal cough. This is more suitable for older children.<br>" +
"Probiotics –there may be some benefits in taking Lactobacillus to reduce the likelihood of a cold or flu.<br>" +
"Pineapple – bromelain, a mixture of enzymes naturally found in pineapples, may help suppress coughs and loosen mucus.<br>" +
"Chicken soup – some studies have suggested that this old-time remedy may actually be able to assist with, colds – one study suggested this could even help with mucus congestion in the nasal passages. <br>" +
"Liquorice root tea - as well as being a soothing drink that can help you to relax when you’re feeling blocked up and poorly, liquorice is a traditional treatment for cough and sore throat and is thought to soothe airways and thin mucus.";
        }
        
        return diet;
    }
}
