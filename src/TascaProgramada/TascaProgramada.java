/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TascaProgramada;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ALUMNEDAM
 */
public class TascaProgramada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
       // ImprimeixExecucioTasca imprimirTasca = new ImprimeixExecucioTasca();
        
        ScheduledThreadPoolExecutor sch = (ScheduledThreadPoolExecutor)
                Executors.newScheduledThreadPool(2);
        
        System.out.println("Inici: " + new Date());
        
        ImprimeixExecucioTasca imprimir = new ImprimeixExecucioTasca();
        
       sch.scheduleWithFixedDelay( imprimir, 2, 3, TimeUnit.SECONDS);
       
       sch.awaitTermination(20, TimeUnit.SECONDS);
       sch.shutdown();
    }
}
