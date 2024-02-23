package tareafactorytransporte;

/*
* Imports
*/
    import javax.swing.JOptionPane;

public class Bicicleta implements MétodosComunes{
    
    /*
    * Declaración de los datos
    */
    
        /*
        *  @Param Peso
        *  Peso es una variable que determina el peso del paquete (Pedido por pantalla)
        */
            private double Peso;
        
        /*
        *  @Param EnvíoPostal
        *  Envío postal es una variable que determina el destino del paquete (Pedido por pantalla)
        */
            private String EnvíoPostal;
        
        /*
        *  @Param CosteTotal
        *  Coste Total es una variable que determina el precio total del paquete a realizar 
        */
            private double CosteTotal;
        
        /*
        *  @Param TipoPaquete 
        *  Tipo Paquete es una variable que determina que tipo de Envío se elige 
        */
            private double TipoPaquete;
            
        /*
        *  @Param PrecioEnvío 
        *  Precio Envío es una variable que determina el precio del envío dependiendo que tipo eligieses 
        */
            private double PrecioEnvío;
        
        /*
        *  @Param PrecioPaquete
        *  Precio Paquete es una variable que determina el precio del paquete dependiendo que tipo eligieses 
        */
            private double PrecioPaquete;
        
    /*
    *  Constructor por defecto    
    */  
        public void Bicicleta(){
               
        }
    
    /*
    *  Constructor parametrizado
    *  @Param Peso  
    *  @Param EnvíoPostal    
    */
         public void Bicicleta (double P, String EP){
            
            Peso = P;
            EnvíoPostal = EP;
            
        }
        
    /*
    *  Creación de los métodos    
    */
        
        /*
        *  Método Preguntar Peso
        *  Sirve para preguntar el peso del paquete por pantalla
        *  @Param Peso
        *  @Return Peso
        */
            public double PreguntarPeso (double P){

                Peso = P;
                Peso = Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso del producto a enviar"));
                return Peso;
            }

        /*
        *  Método Preguntar Envío Postal
        *  Sirve para preguntar el destino del paquete por pantalla
        *  @Param EnvíoPostal
        *  @Return EnvíoPostal    
        */
            public String PregutarEnvíoPostal (String EP){

                EnvíoPostal = EP;
                EnvíoPostal = JOptionPane.showInputDialog("Cual es tu Código postal / Dirección?");
                return EnvíoPostal;
            }    
        
    /*
    *  Métodos Override
    */
        
        /*
        *  Método Coste Total calcula el coste total del envío
        *  @Return CosteTotal
        */
            @Override
            public double CosteTotal(){

                CosteTotal = PrecioPaquete + PrecioEnvío;

                return CosteTotal;    
            }   
        
        /*
        *  Método Tipo Paquete crea el menú de selección de paquete
        *  @Param Palé
        *  @Param CajaCartón
        *  @Param CajaMadera
        *  @Return TipoPaquete 
        */
            @Override
            public double TipoPaquete(double Palé, double CajaCartón, double CajaMadera){

                TipoPaquete = Double.parseDouble(JOptionPane.showInputDialog("""
                                            Escribe el número del tipo de paquete que desees:

                                            1. Caja de Cartón (+10€)
                                            2. Caja de Madera (+50€)
                                            3. Palé (+100€)"""));
                return TipoPaquete;
            }       
        }
