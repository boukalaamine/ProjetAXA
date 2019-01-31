package controler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;




public class DOCXTest {
   
    private XWPFDocument document = null;
   
    public DOCXTest() {
    }
   
    public final void openFile(String filename) throws IOException {
        File file = null;
        FileInputStream fis = null;
        try {
            file = new File(filename);
            fis = new FileInputStream(file);
            this.document = new XWPFDocument(fis);
        }
        finally {
            try {
                if(fis != null) {
                    fis.close();
                    fis = null;
                }
            }
            catch(IOException ioEx) {
                // Swallow this exception. It would have occured onyl
                // when releasing the file handle and should not pose
                // problems to later processing.
            }
        }
    }
   
    public final void saveAs(String filename) throws IOException {
        File file = null;
        FileOutputStream fos = null;
        try {
            file = new File(filename);
            fos = new FileOutputStream(file);
            this.document.write(fos);
        }
        finally {
            if(fos != null) {
                fos.close();
               fos = null;
            }
        }
    }
   
    public final void insertAtBookmark(String bookmarkName, String bookmarkValue) {
        List<XWPFParagraph> paraList = null;
        Iterator<XWPFParagraph> paraIter = null;
        XWPFParagraph para = null;
        List<CTBookmark> bookmarkList = null;
        Iterator<CTBookmark> bookmarkIter = null;
        CTBookmark bookmark = null;
        XWPFRun run = null;
       
        paraList = this.document.getParagraphs();
        paraIter = paraList.iterator();
           
        while(paraIter.hasNext()) {
            para = paraIter.next();
               
            bookmarkList = para.getCTP().getBookmarkStartList();
            bookmarkIter = bookmarkList.iterator();
               
            while(bookmarkIter.hasNext()) {
                bookmark = bookmarkIter.next();
                if(bookmark.getName().equals(bookmarkName)) {
                    run = para.createRun();
                    run.setText(bookmarkValue);
                    //para.getCTP().getDomNode().insertBefore(run.getCTR().getDomNode(), bookmark.getDomNode());
                }
            }
        }
    }
   
    public static void main(String[] args) {
        try {
            DOCXTest docxTest = new DOCXTest();
            docxTest.openFile("C:/temp/Doc1.docx");
            docxTest.insertAtBookmark("WHOLE_WORD", "This should be inserted at the WHOLE_WORD bookmark.");
            docxTest.insertAtBookmark("MARK_ONE", "..and this at the MARK_ONE bookmark.");
            docxTest.saveAs("C:/temp/Doc1 With Bookmarks Updated.docx");
        }
        catch(Exception ex) {
            System.out.println("Caught a: " + ex.getClass().getName());
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Stacktrace follows:.....");
            ex.printStackTrace(System.out);
        }
    }
} 