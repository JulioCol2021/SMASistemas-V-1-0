
/**
 * NfeCancelamento2CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package sae;

    /**
     *  NfeCancelamento2CallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class NfeCancelamento2CallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public NfeCancelamento2CallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public NfeCancelamento2CallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for nfeCancelamentoNF2 method
            * override this method for handling normal response from nfeCancelamentoNF2 operation
            */
           public void receiveResultnfeCancelamentoNF2(
                    NfeCancelamento2Stub.NfeCancelamentoNF2Result result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from nfeCancelamentoNF2 operation
           */
            public void receiveErrornfeCancelamentoNF2(java.lang.Exception e) {
            }
                


    }
    