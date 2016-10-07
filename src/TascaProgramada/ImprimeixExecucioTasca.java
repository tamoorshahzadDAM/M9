/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TascaProgramada;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ALUMNEDAM
 */
public class ImprimeixExecucioTasca implements Runnable{
    
    

        @Override
        public void run() {
            
        Calendar calendar = new GregorianCalendar();
       
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " : " +
        calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND));
       
        
        }
    
}
    

