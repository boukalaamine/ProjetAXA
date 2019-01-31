import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
*
* @author Mark Beardsley
*/
public class ExcelMacroTest {
   
    private ActiveXComponent oleComponent = null;
    private Dispatch openBook = null;

    private final static String APP_ID = "Excel.Application";
   
    // Constants that map onto Excel's Save Options and  may be passed to the
    // close(int) method
    public static final int DO_NOT_SAVE_CHANGES = 0;
    public static final int PROMPT_TO_SAVE_CHANGES = -2;
    public static final int SAVE_CHANGES = -1;
   
    // These constant values determine whether or not tha application
    // instance will be displyed on the users screen or not.
    public static final boolean VISIBLE = true;
    public static final boolean HIDDEN = false;
   
     /**
     * Create a new instance of the ExcelMacroTest class using the following
     * parameters.
     *
     * @param visibility A primitive boolean whose value will determine whether
     *        or not the application will be visible to the user. Pass true to
     *        isplay Excel, false otherwise.
     */
    public ExcelMacroTest(boolean visibility) {
        this.oleComponent = new ActiveXComponent(ExcelMacroTest.APP_ID);
        this.oleComponent.setProperty("Visible", new Variant(visibility));
    }
   
       /**
     * Open ana existing Excel workbook.
     *
     * @param docName An instance of the String class that encapsulates the
     *        path to and name of a valid Excel file. Note that there are a few
     *        limitations applying to the format of this String; it must specify
     *        the absolute path to the file and it must not use the single forward
     *        slash to specify the path separator.
     */
    public void openWorkbook(String workbookName) {
        Dispatch disp = null;
        Variant var = null;

        // First get a Dispatch object referencing the Documents collection - for
        // collections, think of ArrayLists of objects.
        var = Dispatch.get(this.oleComponent, "Workbooks");
        disp = var.getDispatch();

        // Now call the Open method on the Workbooks collection Dispatch object
        // to both open the file and add it to the collection. It would be possible
        // to open a series of files and access each from the Documents collection
        // but for this example, it is simpler to store a reference to the
        // active document in a private instance variable.
        var = Dispatch.call(disp, "Open", workbookName);
        this.openBook = var.getDispatch();
    }
   
    /**
     * Called to close the active workbook. Note that this method simply
     * calls the overloaded closeDoc(int) method passing the value 0 which
     * instructs Excel to close the workbook and discard any changes that may
     * have been made since it was opened or edited.
     */
    public void closeWorkbook() {
        this.closeWorkbook(ExcelMacroTest.DO_NOT_SAVE_CHANGES);
    }
   
    /**
     * Called to close the active workbook. It is possible with this overloaded
     * version of the close() method to specify what should happen if the user
     * has made changes to the workbook that have not been saved. There are three
     * possible value defined by the following manifest constants;
     *      DO_NOT_SAVE_CHANGES - Close the book and discard any changes the user
     *                            may have made.
     *      PROMPT_TO_SAVE_CHANGES - Display a prompt to the user asking them
     *                               how to proceed.
     *      SAVE_CHANGES - Save the changes the user has made to the book.
     *
     * @param saveOption A primitive integer whose value indicates how the close
     *        operation should proceed if the user has made changes to the active
     *        document. Note that no checks are made on the value passed to
     *        this argument.
     */
    public void closeWorkbook(int saveOption) {
        Object args = {new Integer(saveOption)};
        Dispatch.call(this.openBook, "Close", args);
    }
   
     /**
     * Called once processing has completed in order to close down the instance
     * of Excel.
     */
    public void quit() {
        Dispatch.call(this.oleComponent, "Quit");
    }
   
    /**
     * Call - execute - a named macro.
     *
     * @param args An array of arguments to pass to the Run method when it is
     *        invoked. This array must begin with the name of the macro and
     *        be followed by any values that should be passed to the methods
     *        parameters.
     */
    public void runMacro(Object args) {
        Variant var = null;
       // Maybe, the macro returns a value so catch that.
        var = Dispatch.call(this.oleComponent, "Run", args);
    }
  
   public static void main(String args) {
       ExcelMacroTest emt = null;
       try {
           emt = new ExcelMacroTest(ExcelMacroTest.VISIBLE);
           emt.openWorkbook("………");
           emt.runMacro(new Object{"MacroName"});
           emt.closeWorkbook(ExcelMacroTest.SAVE_CHANGES);
       }
       finally {
           if(emt != null) {
               emt.quit();
           }
       }
   }
} 