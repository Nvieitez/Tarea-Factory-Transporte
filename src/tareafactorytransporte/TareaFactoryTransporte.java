package tareafactorytransporte;

/*
* Imports
*/
    import javax.swing.JOptionPane;

public class TareaFactoryTransporte{
    
    public static void main(String[] args) {
        
        /*
        * Declaración de los datos
        */
        
            /*
            *  @Param BotónPresionado
            *  Botón Presionado es la variable que determina que opción eliges
            */
                double BotónPresionado;
            
            /*
            *  @Param BotónTipoPaquete 
            *  Botón Tipo Paquete es la variable que determina que opción eliges dentro del menú de elección de paquete
            */
                double BotónTipoPaquete;
            
            /*
            *  @Param BotónTipoEnvío
            *  Botón Tipo Envío es la variable que determina que opción eliges dentro del menú de elección de envío
            */
                double BotónTipoEnvío;
            
            /*
            *  @Param Peso
            *  Peso es una variable que determina el peso del paquete (Pedido por pantalla)
            */
                double Peso = 0;
            
            /*
            *  @Param EnvíoPostal
            *  Envío postal es una variable que determina el destino del paquete (Pedido por pantalla)
            */
                String EnvíoPostal = "Ninguna Dirección seleccionada";
            
            /*
            *  @Param TipoPaquete 
            *  Tipo Paquete es una variable que determina que tipo de paquete se elige 
            */
                String TipoPaquete = "Nada Seleccionado";
            
            /*
            *  @Param TipoEnvío 
            *  Tipo Envío es una variable que determina que tipo de Envío se elige 
            */
                String TipoEnvío = "Nada Selecionado";
            
            /*
            *  @Param PrecioTotal
            *  Precio Total es una variable que determina el precio total del envío a realizar 
            */
                double PrecioTotal = 0;
            
            /*
            *  @Param PrecioPaquete
            *  Precio Paquete es una variable que determina el precio del paquete dependiendo que tipo eligieses 
            */
                double PrecioPaquete = 0;
            
            /*
            *  @Param PrecioEnvío 
            *  Precio Envío es una variable que determina el precio del envío dependiendo que tipo eligieses 
            */
                double PrecioEnvío = 0;
            
            /*
            *  @Param CajaCartón
            *  Caja Cartón es una variable que permite acceder al tipo de paquete "CajaCartón"
            */
                double CajaCartón = 0;
            
            /*
            *  @Param CajaMadera
            *  Caja Madera es una variable que permite acceder al tipo de paquete "CajaMadera"
            */
                double CajaMadera = 0;
            
            /*
            *  @Param Palé
            *  Palé es una variable que permite acceder al tipo de paquete "Palé"
            */
                double Palé = 0;
            
            /*
            *  @Param ComprobaciónPaquete
            *  Comprobación Paquete es una variable que determina si un paquete ha sido seleccionado o no
            */
                String ComprobaciónPaquete = "False";
            
        /*
        *  Creación de los objetos de las diferentes clases
        */
        
            /*
            *   @Param Bicicleta
            *   Creación del objeto Bicicleta
            */
                Bicicleta Bicicleta = new Bicicleta();
            
            /*
            *   @Param Camión
            *   Creación del objeto Camión
            */
                Camión Camión = new Camión();
            
        /*
        *  Creación del menú
        */
            do{
                
            BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("""
                                                                             Por favor siga los siguientes pasos escribiendo el número de la opción:
                                                                             
                                                                             1. Seleccionar tipo de paquete
                                                                             2. Seleccionar tipo de Envío""" +
                                                                             
                                                                             "\n \nTipo de paquete seleccionado: " + TipoPaquete +
                                                                             "\nTipo de envío seleccionado: " + TipoEnvío +
                                                                             "\nDirección / Código Postal proporcionada: " + EnvíoPostal +
                                                                                                                     
                                                                             "\n \n El precio total de tu envío es de: " + PrecioTotal + " €"));
            
            
                /*
                *  Código para seleccionar tipo de paquete
                */
                    if (BotónPresionado == 1){

                        BotónTipoPaquete = Camión.TipoPaquete(Palé, CajaCartón, CajaMadera);

                        if (BotónTipoPaquete == 1){

                            TipoPaquete = "Caja de Cartón";
                            PrecioPaquete = 10;
                            ComprobaciónPaquete = "True";
                            PrecioTotal = PrecioEnvío + PrecioPaquete;
                        }
                        else{

                            if(BotónTipoPaquete == 2){

                                TipoPaquete = "Caja de Madera";
                                PrecioPaquete = 50;
                                ComprobaciónPaquete = "True";
                                PrecioTotal = PrecioEnvío + PrecioPaquete;
                            }
                            else {

                                if(BotónTipoPaquete == 3){

                                    TipoPaquete = "Palé";
                                    PrecioPaquete = 100;
                                    ComprobaciónPaquete = "True";
                                    PrecioTotal = PrecioEnvío + PrecioPaquete;
                                }
                                else{

                                    JOptionPane.showMessageDialog(null, "El valor introducido no es válido, por favor vuelva a intentarlo");
                                }
                            }
                        }
                    }
                
                /*
                *  Código para seleccionar tipo de envío
                */
                    if (BotónPresionado == 2){
                    
                    /*
                    *  Comprobación del paquete
                    */                   
                        if (ComprobaciónPaquete == "False"){

                            JOptionPane.showMessageDialog(null, "Por favor, primero elija un tipo de paquete para el envío");
                        }
                        else {

                            BotónTipoEnvío = Double.parseDouble(JOptionPane.showInputDialog("""
                                                                                            Escribe el número del tipo de envío deseado:

                                                                                            1. Envío mediante Bicicleta (0 - 3 Kg.) (+10€)
                                                                                            2. Envío mediante Camión (0 - 100 Kg.) (+50€)

                                                                                            0. Cancelar"""));
                        
                        /*
                        *  Código para el tipo de envío "Bicicleta"
                        */                       
                            if(BotónTipoEnvío == 1){

                                TipoEnvío = "Bicicleta";
                                PrecioEnvío = 10;

                                Peso = Bicicleta.PreguntarPeso(Peso);

                                if(Peso > 3){

                                    JOptionPane.showMessageDialog(null, "El paquete que quiere enviar es demasiado pesado, por favor escoja otro tipo de envío");
                                }
                                else{

                                    if(Peso <= 0){

                                        JOptionPane.showMessageDialog(null, "El valor introducido no es válido, por favor vuelva a intentarlo");
                                    }
                                    else{

                                        JOptionPane.showMessageDialog(null, "Todo correcto, por favor a continuación escriba su dirección / Código Postal");

                                        EnvíoPostal =Bicicleta.PregutarEnvíoPostal(EnvíoPostal);

                                        JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros, Tu envío llegará pronto");

                                        PrecioTotal = PrecioEnvío + PrecioPaquete;
                                        
                                        Bicicleta.CosteTotal();

                                    }
                                }
                            }
                        
                        /*
                        *  Código para el tipo de envío "Camión"
                        */                       
                            if(BotónTipoEnvío == 2){

                               TipoEnvío = "Camión";
                               PrecioEnvío = 50;

                               Peso = Bicicleta.PreguntarPeso(Peso);

                               if(Peso > 100){

                                   JOptionPane.showMessageDialog(null, "El paquete que quiere enviar es demasiado pesado, no es posible realizar el envío");
                               }
                               else{

                                   if(Peso <= 0){

                                       JOptionPane.showMessageDialog(null, "El valor introducido no es válido, por favor vuelva a intentarlo");
                                   }
                                   else{

                                       JOptionPane.showMessageDialog(null, "Todo correcto, por favor a continuación escriba su dirección / Código Postal");

                                       EnvíoPostal =Bicicleta.PregutarEnvíoPostal(EnvíoPostal);

                                       JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros, Tu envío llegará pronto");

                                       PrecioTotal = PrecioEnvío + PrecioPaquete;
                                       
                                       Camión.CosteTotal();
                                   }
                               }
                           }
                        }
                    }
                }while(BotónPresionado > 0); 
            }
        }


