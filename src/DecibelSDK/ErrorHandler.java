package DecibelSDK;

public class ErrorHandler {
    /**
     * Whether or not a error occurred
     */
    public String ErrorMsg = "";
    
    /**
     * The error message
     */
    public boolean HasError;
    
    /**
     * Create a empty error handler, with error set to false as default
     */
    public ErrorHandler(){
        HasError = false;
    }
    
    /**
     * Create a new ErrorHandler with error set to true and error message set to the message given
     * 
     * @param error The error message
     */
    public ErrorHandler(String error){
        HasError = true;
        ErrorMsg = error;
    }
}
