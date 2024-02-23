package tareafactorytransporte;

public interface MétodosComunes {
    
    /*
    *  Declaración de los datos
    */
        
        /*
        *  Palé es una variable que permite acceder al tipo de paquete "Palé"
        *  @Param Palé
        */
            final static double Palé = 1;
            
        /*
        *  Caja Cartón es una variable que permite acceder al tipo de paquete "CajaCartón"
        *  @Param CajaCartón
        */
            final static double CajaCartón = 2;
            
        /*
        *  Caja Madera es una variable que permite acceder al tipo de paquete "CajaMadera"
        *  @Param CajaMadera
        */    
            final static double CajaMadera = 3;
    
    /*
    *  Creación de los métodos abstractos        
    */
        /*
        *  Método Coste Total calcula el coste total del envío
        *  @Return CosteTotal
        */    
            double CosteTotal();
        
        /*
        *  Método Tipo Paquete crea el menú de selección de paquete
        *  @Param Palé
        *  @Param CajaCartón
        *  @Param CajaMadera
        *  @Return TipoPaquete 
        */
            double TipoPaquete(double Palé, double CajaCartón, double CajaMadera);
}
