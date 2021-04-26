package by.molchanova.lesson11.xsl;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class XsltExample {

    public static void main(String[] args) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        // установка используемого XSL-преобразования
        Transformer transformer = tf.newTransformer(new StreamSource("students.xsl"));
        // установка исходного XML-документа и конечного XML-файла
        transformer.transform(new StreamSource("students.xml"),
                new StreamResult("newstudents.xml"));
    }
}
